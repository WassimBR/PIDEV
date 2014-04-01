package tn.edu.esprit.gl8.tunisianWatch.impl;

import java.util.List;

import javax.ejb.Local;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

import tn.edu.esprit.gl8.tunisianWatch.domain.Assignement;

@Local
@Path("/Assignement")
public interface AssignementServicesLocal {

	@GET
	@Path("/addAssignement/{administratorId}/{authorityId}/{claimId}/{dateAssignement}")
	@javax.ws.rs.Produces(MediaType.APPLICATION_JSON)
	public boolean addAssignement(

	@PathParam(value = "administratorId") int administratorId,
			@PathParam(value = "authorityId") int authorityId,
			@PathParam(value = "claimId") int claimId,
			@PathParam(value = "dateAssignement") String dateAssignement);

	@GET
	@Path("/listAllAssignement")
	@javax.ws.rs.Produces(MediaType.APPLICATION_JSON)
	public List<Assignement> getAllAssignements();

	@GET
	@Path("/deleteAssignement/{idassignement}")
	@javax.ws.rs.Produces(MediaType.APPLICATION_JSON)
	public boolean deleteAssignement(
			@PathParam(value = "idassignement") int idAssignement);

}
