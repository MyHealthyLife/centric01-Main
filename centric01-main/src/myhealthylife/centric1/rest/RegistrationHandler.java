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
	
	@POST
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Response register(Person p){
		Person registered=ServicesLocator.getDataServiceConnection().register(p);
		if(p==null)
			/*return conflict due to a incorrect data send by the user*/
			return Utilities.throwConflict();
		
		return Utilities.throwOK(p);
	}

}
