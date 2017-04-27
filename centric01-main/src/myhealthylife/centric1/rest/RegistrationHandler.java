package myhealthylife.centric1.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import myhealthylife.centric1.util.ServicesLocator;
import myhealthylife.centric1.util.Utilities;
import myhealthylife.dataservice.soap.Person;

@Path("user/register")
public class RegistrationHandler {
	
	/**
	 * Register a new user into the system
	 * @param p The Person object with the user data
	 * @return The Person object just created
	 */
	@POST
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Response register(Person p){
		
		/*check if the user send the username*/
		if(p.getUsername()==null)
			return Utilities.throwBadRequest();
		/* check for conflicts on the username*/
		if(ServicesLocator.getDataServiceConnection().getPersonByUsername(p.getUsername())!=null)
			return Utilities.throwConflict();
		
		/* check for conflicts on the telegram username*/
		if(p.getTelegramUsername()!=null)
			if(ServicesLocator.getDataServiceConnection().getPersonByTelegramUsername(p.getTelegramUsername())!=null)
				return Utilities.throwConflict();
		
		Person registered=ServicesLocator.getDataServiceConnection().register(p);
		
		
		if(registered==null)
			return Utilities.throwBadRequest();
		
		return Utilities.throwOK(p);
	}

}
