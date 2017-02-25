package myhealthylife.centric1.filters;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;

public class CorsHeaders  implements ContainerResponseFilter{
	@Override
	public void filter(ContainerRequestContext requestContext,   ContainerResponseContext responseContext)
	    throws IOException {
	        responseContext.getHeaders().add("Access-Control-Allow-Origin","*");
	        responseContext.getHeaders().add("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT, OPTIONS");

	  }
}
