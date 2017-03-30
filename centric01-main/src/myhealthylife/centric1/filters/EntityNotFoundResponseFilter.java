package myhealthylife.centric1.filters;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

@Provider
public class EntityNotFoundResponseFilter
    implements ContainerResponseFilter {


public void filter(ContainerRequestContext requestContext,
        ContainerResponseContext responseContext) throws IOException {
    String method = requestContext.getMethod();

    Object entity = responseContext.getEntity();
	//System.out.println("Filtering..."+requestContext.getMethod());
	if(requestContext.getMethod().equals("GET")){
		if(responseContext.getEntity()==null){
			responseContext.setStatus(Response.Status.NOT_FOUND.getStatusCode());
		}
	}
}
}