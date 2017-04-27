package myhealthylife.centric1.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import myhealthylife.centric1.util.ServicesLocator;
import myhealthylife.centric1.util.Utilities;
import myhealthylife.dataservice.soap.DataService;
import myhealthylife.dataservice.soap.People;

@Path("/people")
public class PeopleHandler {

	/**
	 * Returns all the people present in the database of service01. The list of people is returned in a PeopleList
	 * @return A list of all the people present in the database of service 01
	 */
	@GET
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public People getPeople(){
		DataService ds=ServicesLocator.getDataServiceConnection();
		People people=ds.listPeople();
		
		return people;
	}
}
