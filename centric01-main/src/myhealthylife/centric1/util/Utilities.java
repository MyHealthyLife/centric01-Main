package myhealthylife.centric1.util;

import javax.ws.rs.core.Response;

public class Utilities {
	  	
	public static Response throwResourceNotFound(){
    	return Response.status(Response.Status.NO_CONTENT).build();
    }
	    
    public static Response throwOK(Object o){
    	//TODO check if code is ccorrect
    	return Response.status(Response.Status.OK).entity(o).build();
    }
}
