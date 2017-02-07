package myhealthylife.centric1.util;

import myhealthylife.dataservice.soap.DataService;
import myhealthylife.dataservice.soap.DataService_Service;
import myhealthylife.nutritionservice.soap.FoodService;
import myhealthylife.nutritionservice.soap.Foods;
import myhealthylife.sentencegenerator.soap.SentenceService;
import myhealthylife.sentencegenerator.soap.Sentences;
import myhealtylife.optimalparamters.soap.OptimalParameters;
import myhealtylife.optimalparamters.soap.OptimalParamteres;

public class ServicesLocator {
	
	private static DataService_Service dataservice=null;
	private static SentenceService sentencegenerator=null;
	private static OptimalParamteres optimalParameters=null;
	private static FoodService foodService=null;
	
	public static DataService getDataServiceConnection(){
		/*it will be initialized on the first use*/
		if(dataservice==null)
			dataservice=new DataService_Service();
		
		return dataservice.getDataServiceImplPort();
	}
	
	public static Sentences getSentenceGeneratorConnection(){
		/*it will be initialized on the first use*/
		if(sentencegenerator==null)
			sentencegenerator=new SentenceService();
		return sentencegenerator.getSentencesImplPort();
	}
	
	public static OptimalParameters getOptimalParameterConnection(){
		/*it will be initialized on the first use*/
		if(optimalParameters==null)
			optimalParameters=new OptimalParamteres();
		
		return optimalParameters.getOptimalParametersImpPort();
	}
	
	public static Foods getFoodServiceConnection(){
		if(foodService==null)
			foodService=new FoodService();
		
		return foodService.getFoodsImplPort();
	}
	
}
