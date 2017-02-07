package myhealthylife.centric1.util;

import javax.ws.rs.core.Response;

import myhealthylife.dataservice.soap.DataService;
import myhealthylife.dataservice.soap.DataService_Service;

public class Utilities {
	  	
	public static Response throwResourceNotFound(){
    	return Response.status(Response.Status.NOT_FOUND).build();
    }
	    
    public static Response throwOK(Object o){
    	//TODO check if code is correct
    	return Response.status(Response.Status.OK).entity(o).build();
    }
    
}
