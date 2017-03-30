package myhealthylife.centric1.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import myhealthylife.centric1.util.ServicesLocator;
import myhealthylife.centric1.util.Utilities;
import myhealthylife.dataservice.soap.DataService;
import myhealthylife.dataservice.soap.DataService_Service;
import myhealthylife.dataservice.soap.Person;

@Path("/user/data")
public class DataHandler {

	@GET
	@Path("/{username}")
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Person getPerson(@PathParam("username") String username){
		DataService ds = ServicesLocator.getDataServiceConnection();
		Person p=ds.getPersonByUsername(username);
		
		return p;
	}

	@GET
	@Path("/telegram/{username}")
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Response getPersonByTelegramUsername(@PathParam("username") String username){
		DataService ds=ServicesLocator.getDataServiceConnection();
		Person person=ds.getPersonByTelegramUsername(username);
		
		if(person==null)
			return Utilities.throwResourceNotFound();
		
		return Utilities.throwOK(person);
	}
	
	@GET
	@Path("/telegram/id/{telegramId}")
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Response getPersonByTelegramID(@PathParam("telegramId")String telegramId){
		DataService ds=ServicesLocator.getDataServiceConnection();
		
		Person p=ds.getPersonByTelegramId(telegramId);
		
		if(p==null){
			Utilities.throwResourceNotFound();
		}
		
		return Utilities.throwOK(p);
	}
	
	@PUT
	@Path("/{username}")//the username in path in this way also the username of the person can be update by the body
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Response updatePerson(Person p, @PathParam("username") String username){
		DataService ds = ServicesLocator.getDataServiceConnection();
		Person stored=ds.getPersonByUsername(username);
		
		if(stored==null)
			return Utilities.throwResourceNotFound();
		
		if(p.getBirthdate()!=null)
			stored.setBirthdate(p.getBirthdate());
		
		if(p.getFirstname()!=null)
			stored.setFirstname(p.getFirstname());
		
		if(p.getLastname()!=null)
			stored.setLastname(p.getLastname());
		
		if(p.getPassword()!=null)
			stored.setPassword(p.getPassword());
		
		if(p.getTelegramUsername()!=null)
			stored.setTelegramUsername(p.getTelegramUsername());
		
		if(p.getUsername()!=null)
			stored.setUsername(p.getUsername());
		
		if(p.getSex()!=null){
			stored.setSex(p.getSex());
		}
		
		if(p.getTelegramID()!=null){
			stored.setTelegramID(p.getTelegramID());
		}
		
		if(p.isUsernameVisible()!=null){
			stored.setUsernameVisible(p.isUsernameVisible());
		}
		
		Person updated=ds.updatePerson(stored);
		
		if(updated==null)
			return Utilities.throwResourceNotFound();
		
		return Utilities.throwOK(updated);
	}
	
	@DELETE
	@Path("/{username}")//the username in path in this way also the username of the person can be update by the body
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Response deleteUserInformations(@PathParam("username") String username){
		Person p=ServicesLocator.getDataServiceConnection().getPersonByUsername(username);
		long id=ServicesLocator.getDataServiceConnection().deletePerson(p.getIdPerson());
		
		return Utilities.throwOK(id);
	}
	
}
