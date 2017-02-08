package myhealthylife.centric1.util;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.ws.rs.core.Response;
import javax.xml.datatype.XMLGregorianCalendar;

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
    
    public static Response throwBadRequest(){
    	return Response.status(Response.Status.BAD_REQUEST).build();
    }
    
    public static Response throwNoContent(){
    	return Response.status(Response.Status.NO_CONTENT).build();
    }
    
    public static Response throwConflict(){
    	return Response.status(Response.Status.CONFLICT).build();
    }
    
    
    public static int getAgeByDateOfBorn(XMLGregorianCalendar bornDate){
    	
    	Date date=new Date(System.currentTimeMillis());
    	GregorianCalendar now=new GregorianCalendar();
    	now.setTime(date);
    	
    	GregorianCalendar bDate=new GregorianCalendar();
    	bDate.setTime(new Date(bornDate.getMillisecond()));
    	
    	return now.get(GregorianCalendar.YEAR)-bDate.get(GregorianCalendar.YEAR);
    }
    
}
