package myhealthylife.centric1.rest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import myhealthylife.centric1.model.Goal;
import myhealthylife.centric1.model.GoalList;
import myhealthylife.centric1.util.ServicesLocator;
import myhealthylife.centric1.util.Utilities;
import myhealthylife.dataservice.soap.DataService;
import myhealthylife.dataservice.soap.Measure;
import myhealthylife.dataservice.soap.Person;
import myhealtylife.optimalparamters.soap.OptimalParameters;
import myhealtylife.optimalparamters.soap.Parameter;

@Path("/user/goals")
public class GoalHandler {

	@Path("/{username}")
	@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Response getUserGoal(@PathParam("username") String username){
		
		DataService ds=ServicesLocator.getDataServiceConnection();
		OptimalParameters op=ServicesLocator.getOptimalParameterConnection();
		
		Person p=ds.getPersonByUsername(username);
		
		/*if person do not exists throw an error*/
		if(p==null)
			return Utilities.throwResourceNotFound();
		
		/*if the person do no have a birthdate throw an error*/
		if(p.getBirthdate()==null)
			return Utilities.throwNoContent();
		
		if(p.getHealthProfile()==null)
			return Utilities.throwNoContent();
		
		if(p.getSex()==null)
			return Utilities.throwNoContent();
		
		List<Measure> measures=p.getHealthProfile().getCurrentHealth().getMeasure();
		
		//downloads the optimal parameter
		List<Parameter> parameters=op.readOptimalParametersByAgeAndSex(Utilities.getAgeByDateOfBorn(p.getBirthdate()),p.getSex()).getParameters();
		
		Iterator<Parameter> it=parameters.iterator();
		
		List<Goal> goals=new ArrayList<Goal>();
		
		//compute goals
		while(it.hasNext()){
			Parameter par=it.next();
			
			Iterator<Measure> itMeasure=measures.iterator();
			
			boolean find=false;
			
			while(itMeasure.hasNext()){
				Measure m=itMeasure.next();
				if(m.getMeasureType().equals(par.getParameterName())){
					goals.add(new Goal(par.getValue(), m.getMeasureValue(),par.getParameterName()));
					find=true;
					break;
				}
			}
			
			//if a person do not have a value for the parameter set it has a goal.
			if(!find){
				goals.add(new Goal(par.getValue(), 0,par.getParameterName()));
			}
		}
		
		GoalList list=new GoalList();
		list.setGoals(goals);
		
		return Utilities.throwOK(list);
	}
}
