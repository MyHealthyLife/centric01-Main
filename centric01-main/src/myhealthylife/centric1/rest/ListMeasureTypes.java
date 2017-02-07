package myhealthylife.centric1.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import myhealthylife.centric1.util.ServicesLocator;
import myhealthylife.dataservice.soap.MeasureTypeList;

@Path("/measuretypes")
public class ListMeasureTypes {

	@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public MeasureTypeList getMeasureTypes(){
		return ServicesLocator.getDataServiceConnection().getMeasureTypes();
	}
}
