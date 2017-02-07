package myhealthylife.centric1.rest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import myhealthylife.centric1.util.ServicesLocator;
import myhealthylife.centric1.util.Utilities;
import myhealthylife.dataservice.soap.DataService;
import myhealthylife.dataservice.soap.MeasureHistory;
import myhealthylife.dataservice.soap.People;
import myhealthylife.dataservice.soap.Person;

@Path("/measure")
public class UserMeasuresHandler {

	
	/**
	 * 
	 * @param username
	 * @return
	 * @throws MalformedURLException
	 */
	@Path("/{username}/history")
	@GET
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Response getMeasureHistory(@PathParam("username") String username) throws MalformedURLException{
		
		DataService ds = ServicesLocator.getDataServiceConnection();
		Person p=ds.getPersonByUsername(username);
		
        // Gets the person related to that username
        Person person = ds.getPersonByUsername(username);
        
        // If the username does not exist it throws an error
        if(person==null) {
			return Utilities.throwResourceNotFound();
        }
			
        // Gets the measure history
		return Utilities.throwOK(ds.getMeasureHistory(person.getIdPerson()));
        
	}
	
}
