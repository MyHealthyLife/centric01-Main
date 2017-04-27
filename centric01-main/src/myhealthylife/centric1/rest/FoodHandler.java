package myhealthylife.centric1.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.commons.math3.stat.regression.SimpleRegression;

import jersey.repackaged.com.google.common.collect.Lists;
import myhealthylife.centric1.util.ServicesLocator;
import myhealthylife.centric1.util.Utilities;
import myhealthylife.dataservice.soap.DataService;
import myhealthylife.dataservice.soap.Measure;
import myhealthylife.dataservice.soap.Person;
import myhealthylife.nutritionservice.soap.Food;
import myhealthylife.nutritionservice.soap.Foods;
import myhealthylife.nutritionservice.soap.Foods_Type;
import myhealthylife.sentencegenerator.soap.Sentence;
import myhealthylife.sentencegenerator.soap.Sentences;

@Path("/foods")
public class FoodHandler {

	/**
	 * Returns the suggested foods for that particular user identified by its username.
	 * The suggested foods are calculated by the system by analysing all the measures contained 
	 * in the measure history of a person. E.g. if the user gains weight and is already fat, the 
	 * system will suggest foods with lower amount of calories.
	 * @param username
	 * @return
	 */
	@Path("/{username}")
	@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Foods_Type getSuggestedFoods(@PathParam("username") String username){


		Foods fs = ServicesLocator.getFoodServiceConnection();
		DataService ds = ServicesLocator.getDataServiceConnection();
		
		// Gets the person related to that username
        Person person = ds.getPersonByUsername(username);
        
        // If the username does not exist it throws an error
        if(person==null) {
			return null;
        }
        
        // Gets the current measure and the last 3 available measures
        List<Measure> currentMeasures = person.getHealthProfile().getCurrentHealth().getMeasures();
        
        // Gets all the measures for that user and all the types available
        List<Measure> measureHistory = ds.getMeasureHistory(person.getIdPerson()).getMeasures();
        List<String> measureTypes = ds.getMeasureTypes().getMeasureTypes();
        
        // Lists used to check the count of the measures for each type and if it has been inserted or not
        List<Boolean> measureTypesInserted = new ArrayList<>();
        List<Integer> measureTypesInsertedCount = new ArrayList<>();
        
        // List of the most recent measures
        ArrayList<ArrayList<Double>> lastMeasures = new ArrayList<ArrayList<Double>>();
        
     // Init of the boolean list and the count of the measures for each type
        for(int i=0;i<measureTypes.size();i++) {
        	
        	measureTypesInserted.add(false);
        	measureTypesInsertedCount.add(0);
        	lastMeasures.add(new ArrayList<>());
        	
        }
        
        // Retrieve last 5 measures
        for(int i=0;i<measureHistory.size();i++) {
        	
        	// Gets the measure history of the user
        	Measure extractedMeasure = measureHistory.get(i);

	    	// For each measure type we get all the most recent measures
        	for(int j=0;j<measureTypes.size();j++) {
        		
        		String extractedType = measureTypes.get(j);

	    		// Check if the extracted type is equal to the one of the current selected measure
        		if(extractedMeasure.getMeasureType().equals(extractedType)) {
        			
        			if(!measureTypesInserted.get(j)) {

	    				// Update the type count
        				Integer typeCount = measureTypesInsertedCount.get(j);
	        			typeCount++;
	        			measureTypesInsertedCount.set(j, typeCount);

	        			// Adds the measure in the list
	        			lastMeasures.get(j).add(extractedMeasure.getMeasureValue());

	        			// Updates eventually the boolean list (only if the measures for that type has reached count 5
	        			this.checkMeasuresCount(measureTypesInserted, measureTypesInsertedCount);
	        			
        			}
        		}
        		
        	}
        	
        }
		

	    // Gets the preferred type (the one with the highest slope)
        List<String> preferredType = this.getPreferredSentenceType(lastMeasures, measureTypes);
        System.out.println("Preferred: " + preferredType.get(0) + " " + preferredType.get(1));
        String preferredTypeName = preferredType.get(0);
        Boolean preferredTypeTrend = Boolean.valueOf(preferredType.get(1));
        
        Integer maxCal = 1000;
        
        if(preferredTypeTrend) {
        	maxCal = Integer.MAX_VALUE;
        }
        
        // Gets the foods to return
        Foods_Type foodListToReturn = fs.findFoodByTypeFilteredByCalories(maxCal);
        
        if(foodListToReturn==null) {
        	foodListToReturn = fs.readFoodList();
        }
        
        // Returns the random sentence
		return foodListToReturn;
		
	}
	
	
	/**
	 * Check if the measure count is 5 or more (we are interested in the trend of the last 5 measures
	 * @param measureTypesInserted The list of bools that specify if a type has been inserted or not
	 * @param measureTypesInsertedCount The measures count for each measure type
	 */
	private void checkMeasuresCount(List<Boolean> measureTypesInserted, List<Integer> measureTypesInsertedCount) {
		
		for(int i=0;i<measureTypesInsertedCount.size();i++) {
			
			if(measureTypesInsertedCount.get(i)>4) {
				
				Boolean enough = measureTypesInserted.get(i);
				enough = true;
				measureTypesInserted.set(i, enough);
				
			}
			
		}
		
	}
	
	/**
	 * Gets the preferred measure type that the system will use to retrieve a sentence (the one with the highest slope)
	 * @param lastMeasures The object describing the last measures for each measure type
	 * @param measureTypes The list of measures present in the system
	 * @return The list of preferred measure type (the one with the highest slope)
	 */
	private List<String> getPreferredSentenceType(ArrayList<ArrayList<Double>> lastMeasures, List<String> measureTypes) {
		
		
		List<Double> slopes = new ArrayList<>();
		
		for(int i=0;i<lastMeasures.size();i++) {

			List<Double> dataList = Lists.reverse(lastMeasures.get(i));
			
			// Creating regression object, passing true to have intercept term
	        SimpleRegression simpleRegression = new SimpleRegression(true);
	
	        // Passing data to the model
	        for(int j=0;j<dataList.size();j++) {
	        	System.out.println("Added: " + dataList.get(j));
	        	simpleRegression.addData(j,dataList.get(j));
	        }
	
	        
	        // Querying for model parameters
	        System.out.println("slope = " + simpleRegression.getSlope());
	        Double singleSlope = simpleRegression.getSlope();
	        
        	
        	slopes.add(singleSlope);
	        
	        //System.out.println("intercept = " + simpleRegression.getIntercept());
	
	        // Trying to run model for unknown data
	        //System.out.println("prediction for 1.5 = " + simpleRegression.predict(1.5));
			
		}
		
		List<String> returnValues = new ArrayList<>();
		
        int index = this.findIndexOfMaxValue(slopes);
        System.out.println("Index: " + measureTypes.get(index));
        
        returnValues.add(measureTypes.get(index));
        
        if(slopes.get(index)<0) {
        	returnValues.add("false");
        }
        else {
        	returnValues.add("true");
        }
        
    	return returnValues;
	}
	
	
	public int findIndexOfMaxValue(List<Double> slopes) {
	    

	    int maxIndex = 0;
	    for (int i=1;i<slopes.size()-1;i++) {
	        double newnumber = Math.abs(slopes.get(i));
	        if ((newnumber > Math.abs(slopes.get(maxIndex)))) {
	            maxIndex = i;
	        }
	    }
	    
	    System.out.println(maxIndex);

	    return maxIndex;
	}


	
}
