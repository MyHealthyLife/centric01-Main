package myhealthylife.centric1.rest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
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
import myhealthylife.dataservice.soap.Measure;
import myhealthylife.dataservice.soap.MeasureHystory;
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
	public MeasureHystory getMeasureHistory(@PathParam("username") String username) throws MalformedURLException{
		
		DataService ds = ServicesLocator.getDataServiceConnection();
		
        // Gets the person related to that username
        Person person = ds.getPersonByUsername(username);
        
        // If the username does not exist it throws an error
        if(person==null) {
			return null;
        }
			
        // Gets the measure history
		return ds.getMeasureHistory(person.getIdPerson());
        
	}
	
	


	@Path("/{username}/{mid}")
	@GET
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Measure getMeasureByMid(@PathParam("username") String username, @PathParam("mid") Integer mid) {
		
		DataService ds = ServicesLocator.getDataServiceConnection();
		
        // Gets the person related to that username
        Person person = ds.getPersonByUsername(username);
        
        // If the username does not exist it throws an error
        if(person==null) {
			return null;
        }
		
        // Gets the measure related to that person
        Measure measure = ds.getMeasure(mid);
        
        // Returns the measure
		return measure;
        
	}
	
	
	
	
	@Path("/{username}/{mid}")
	@PUT
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Measure updateMeasureByMid(Measure measureToUpdate, @PathParam("username") String username, @PathParam("mid") Integer mid) {
		
		DataService ds = ServicesLocator.getDataServiceConnection();
		
        // Gets the person related to that username
        Person person = ds.getPersonByUsername(username);
        
        // If the username does not exist it throws an error
        if(person==null) {
			return null;
        }
		
        // Gets the measure related to that person
        Measure measure = ds.getMeasure(mid);
        
        if(measure==null) {
			return null;
        }
        
        if(measureToUpdate.getDateRegistered()!=null) {
        	measure.setDateRegistered(measureToUpdate.getDateRegistered());
        }
        if(measureToUpdate.getMeasureType()!=null) {
        	measure.setMeasureType(measureToUpdate.getMeasureType());
        }
        if(measureToUpdate.getMeasureValue()!=null) {
        	measure.setMeasureValue(measureToUpdate.getMeasureValue());
        }
        
        Measure mUpdated = ds.updateMeasure(measure);
        
        // Returns the measure just updated
		return mUpdated;
        
	}
	
	
	
	
	@Path("/{username}")
	@POST
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Measure createMeasure(Measure measureToCreate, @PathParam("username") String username) {
		
		DataService ds = ServicesLocator.getDataServiceConnection();
		
        // Gets the person related to that username
        Person person = ds.getPersonByUsername(username);
        
        // If the username does not exist it throws an error
        if(person==null || measureToCreate==null) {
			return null;
        }
		
        
        if(measureToCreate.getDateRegistered()==null || measureToCreate.getMeasureType()==null || measureToCreate.getMeasureValue()==null) {
        	return null;
        }
        
        // Creates the measure
        Measure mCreated = ds.saveMeasure(person.getIdPerson(), measureToCreate);
        
        if(mCreated==null)
        	return null;
        
        // Returns the measure just created
		return mCreated;
        
	}
	
	
	
	@Path("/{username}/{mid}")
	@DELETE
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Response deleteMeasure(@PathParam("username") String username, @PathParam("mid") Integer mid) {
		
		DataService ds = ServicesLocator.getDataServiceConnection();
		
        // Gets the person related to that username
        Person person = ds.getPersonByUsername(username);
        
        Measure measureToDelete = ds.getMeasure(mid);
        
        // If the username does not exist it throws an error
        if(person==null || measureToDelete==null) {
			return Utilities.throwResourceNotFound();
        }
		
        // Deletes the measure
        ds.deleteMeasure(person.getIdPerson(), measureToDelete.getMid());
        
        // Returns the measure identifier
		return Utilities.throwOK(mid);
        
	}
	
}
