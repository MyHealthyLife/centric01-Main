package myhealthylife.centric1.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import myhealthylife.centric1.util.ServicesLocator;
import myhealthylife.dataservice.soap.MeasureTypes;

@Path("/measuretypes")
public class ListMeasureTypes {

	/**
	 * The result of this request contains a list of measureType object which contains only a string with the name of the category
	 * @return
	 */
	@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public MeasureTypes getMeasureTypes(){
		return ServicesLocator.getDataServiceConnection().getMeasureTypes();
	}
}
