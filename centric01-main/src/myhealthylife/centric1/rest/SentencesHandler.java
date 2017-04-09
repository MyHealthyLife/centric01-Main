package myhealthylife.centric1.rest;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashMap;
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
import myhealthylife.centric1.model.WeatherSentence;
import myhealthylife.centric1.util.ServicesLocator;
import myhealthylife.centric1.util.Utilities;
import myhealthylife.dataservice.soap.Current;
import myhealthylife.dataservice.soap.CurrentHealth;
import myhealthylife.dataservice.soap.DataService;
import myhealthylife.dataservice.soap.Measure;
import myhealthylife.dataservice.soap.Person;
import myhealthylife.sentencegenerator.soap.Sentence;
import myhealthylife.sentencegenerator.soap.SentenceService;
import myhealthylife.sentencegenerator.soap.Sentences;


@Path("/sentence")
public class SentencesHandler {

	
	@Path("/random")
	@GET
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Sentence getMeasureHistory() {
		
		Sentences ss = ServicesLocator.getSentenceGeneratorConnection();
		
        // Gets a random sentence
		Sentence randomSentence = ss.readRandomSentence();
        
        // If the sentence is null it returns an error
        if(randomSentence==null) {
			return null;
        }
			
        // Returns the random sentence
		return randomSentence;
        
	}
	
	
	

	
	@Path("/weather/{username}")
	@GET
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Response getSentenceBasedOnWeather(@PathParam("username") String username) {
		
		Sentences ss = ServicesLocator.getSentenceGeneratorConnection();
		DataService ds = ServicesLocator.getDataServiceConnection();
		
		// Gets the person related to that username
        Person person = ds.getPersonByUsername(username);
        
        // If the username does not exist it throws an error
        if(person==null) {
        	return null;
        }
        
        Current weather=ds.getWeatherForecast(person.getIdPerson());
        Float weatherCode = weather.getWeather().getNumber();
        
        Sentence sentenceFirst;
        WeatherSentence weatherSentenceToReturn = new WeatherSentence();
        

        
        if(!this.rainingCondition(weatherCode) && !this.snowCondition(weatherCode) && !this.thunderstormCondition(weatherCode) && !this.drizzleCondition(weatherCode) && !this.extremeCondition(weatherCode)) {
        	
        	// Creates a composite sentence
        	sentenceFirst = ss.readRandomSentenceByTypeAndTrend("steps", true);

            weatherSentenceToReturn.setTextWeather(weather.getWeather().getValue());            
            weatherSentenceToReturn.setTextSentence(sentenceFirst.getText());
            
        }
        else {
        	
        	// Creates a composite sentence
        	sentenceFirst = ss.readRandomSentenceByTypeAndTrend("indoor", true);

            weatherSentenceToReturn.setTextWeather(weather.getWeather().getValue());
            weatherSentenceToReturn.setTextSentence(sentenceFirst.getText());
            
        }
        
        weatherSentenceToReturn.setIdWeatherSentence(weather.getCity().getId());
        weatherSentenceToReturn.setWeatherCode(weatherCode);
        weatherSentenceToReturn.setCity(weather.getCity().getName() + " " + weather.getCity().getCountry());
        weatherSentenceToReturn.setPrecipitation(weather.getPrecipitation().getMode());
        weatherSentenceToReturn.setTemperature(weather.getTemperature().getValue());
        weatherSentenceToReturn.setWindSpeed(weather.getWind().getSpeed().getValue());
        weatherSentenceToReturn.setWindDirection(weather.getWind().getDirection().getName());
        
        return Utilities.throwOK(weatherSentenceToReturn);
	}
	
	
	private Boolean rainingCondition(Float statusCode) {
		
		if(statusCode>=500 && statusCode<=531) {
			return true;
		}
		
		return false;
	}
	
	private Boolean snowCondition(Float statusCode) {
		
		if(statusCode>=600 && statusCode<=622) {
			return true;
		}
		
		return false;
	}
	
	private Boolean thunderstormCondition(Float statusCode) {
		
		if(statusCode>=200 && statusCode<=232) {
			return true;
		}
		
		return false;
	}
	
	private Boolean drizzleCondition(Float statusCode) {
		
		if(statusCode>=300 && statusCode<=321) {
			return true;
		}
		
		return false;
	}
	
	private Boolean extremeCondition(Float statusCode) {
		
		if(statusCode>=900 && statusCode<=962) {
			return true;
		}
		
		return false;
	}
	
	
	

	
	@Path("/{username}")
	@GET
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Response getSpecificSentence(@PathParam("username") String username) {
		
		Sentences ss = ServicesLocator.getSentenceGeneratorConnection();
		DataService ds = ServicesLocator.getDataServiceConnection();
		
		// Gets the person related to that username
        Person person = ds.getPersonByUsername(username);
        
        // If the username does not exist it throws an error
        if(person==null) {
			return Utilities.throwResourceNotFound();
        }
        
        // Gets the current measure and the last 3 available measures
        List<Measure> currentMeasures = person.getHealthProfile().getCurrentHealth().getMeasures();
        
        // Gets all the measures for that user and all the types available
        List<Measure> measureHistory = ds.getMeasureHistory(person.getIdPerson()).getMeasures();
        List<String> measureTypes = ds.getMeasureTypes().getMeasureTypes();
        
        
        List<Boolean> measureTypesInserted = new ArrayList<>();
        List<Integer> measureTypesInsertedCount = new ArrayList<>();
        
        ArrayList<ArrayList<Double>> lastMeasures = new ArrayList<ArrayList<Double>>();
        
        for(int i=0;i<measureTypes.size();i++) {
        	
        	measureTypesInserted.add(false);
        	measureTypesInsertedCount.add(0);
        	lastMeasures.add(new ArrayList<>());
        	
        }
        
        // Retrieve last 3 measures
        for(int i=0;i<measureHistory.size();i++) {
        	System.out.println("Cycle: " + i);
        	Measure extractedMeasure = measureHistory.get(i);
        	
        	for(int j=0;j<measureTypes.size();j++) {

            	System.out.println("Cycle [J]: " + j);
        		String extractedType = measureTypes.get(j);
        		
        		if(extractedMeasure.getMeasureType().equals(extractedType)) {
        			
        			if(!measureTypesInserted.get(j)) {
	        			
        				Integer typeCount = measureTypesInsertedCount.get(j);
	        			typeCount++;
	        			measureTypesInsertedCount.set(j, typeCount);
	        			
	        			lastMeasures.get(j).add(extractedMeasure.getMeasureValue());
	        			
	        			this.checkMeasuresCount(measureTypesInserted, measureTypesInsertedCount);
	        			
        			}
        		}
        		
        	}
        	
        }
		
        
        List<String> preferredType = this.getPreferredSentenceType(lastMeasures, measureTypes);
        String preferredTypeName = preferredType.get(0);
        Boolean preferredTypeTrend = Boolean.valueOf(preferredType.get(1));
        
        
        // Gets the sentence to return
        Sentence sentenceToReturn = ss.readRandomSentenceByTypeAndTrend(preferredTypeName, preferredTypeTrend);
        
        if(sentenceToReturn==null) {
        	sentenceToReturn = ss.readRandomSentence();
        }
        
        // Returns the random sentence
		return Utilities.throwOK(sentenceToReturn);
        
	}
	
	
	private void checkMeasuresCount(List<Boolean> measureTypesInserted, List<Integer> measureTypesInsertedCount) {
		
		for(int i=0;i<measureTypesInsertedCount.size();i++) {
			
			if(measureTypesInsertedCount.get(i)>4) {
				
				Boolean enough = measureTypesInserted.get(i);
				enough = true;
				measureTypesInserted.set(i, enough);
				
			}
			
		}
		
	}
	
	
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
