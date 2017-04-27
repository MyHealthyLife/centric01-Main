package myhealthylife.centric1.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import myhealthylife.centric1.util.ServicesLocator;
import myhealthylife.dataservice.soap.Current;
import myhealthylife.dataservice.soap.DataService;
import myhealthylife.dataservice.soap.Person;

@Path("/weather")
public class WeatherForecast {

	/**
	 * This method return the weather forecast for the area into a specific person live.
	 * This method returns a Current object which contains the weather information.
	 * @param username
	 * @return
	 */
	@GET
	@Path("/{username}")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Current getWeatherForecast(@PathParam("username") String username){
		DataService ds=ServicesLocator.getDataServiceConnection();
		
		Person p=ds.getPersonByUsername(username);
		
		if(p==null)
			return null;
		
		Current weather=ds.getWeatherForecast(p.getIdPerson());
		
		return weather;
	}
}
