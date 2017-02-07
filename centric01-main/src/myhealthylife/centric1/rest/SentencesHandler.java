package myhealthylife.centric1.rest;

import java.net.MalformedURLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import myhealthylife.centric1.util.ServicesLocator;
import myhealthylife.centric1.util.Utilities;
import myhealthylife.dataservice.soap.DataService;
import myhealthylife.dataservice.soap.Person;
import myhealthylife.sentencegenerator.soap.Sentence;
import myhealthylife.sentencegenerator.soap.SentenceService;
import myhealthylife.sentencegenerator.soap.Sentences;


@Path("/sentence")
public class SentencesHandler {

	
	@Path("/random")
	@GET
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Response getMeasureHistory(@PathParam("username") String username) throws MalformedURLException{
		
		Sentences ss = ServicesLocator.getSentenceGeneratorConnection();
		
        // Gets a random sentence
		Sentence randomSentence = ss.readRandomSentence();
        
        // If the sentence is null it returns an error
        if(randomSentence==null) {
			return Utilities.throwResourceNotFound();
        }
			
        // Returns the random sentence
		return Utilities.throwOK(randomSentence);
        
	}
	
}
