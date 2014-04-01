package tn.edu.esprit.gl8.tunisianWatch.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Assignement implements Serializable {

	private int idAssignement;
	private int administratorId;
	private int authorityId;

	public Assignement() {
		super();
	}

	private int claimId;
	private String dateAssignement;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdAssignement() {
		return idAssignement;
	}

	public void setIdAssignement(int idAssignement) {
		this.idAssignement = idAssignement;
	}

	public int getAdministratorId() {
		return administratorId;
	}

	public void setAdministratorId(int administratorId) {
		this.administratorId = administratorId;
	}

	public int getIdAuthorityId() {
		return authorityId;
	}

	public void setIdAuthorityId(int idAuthorityId) {
		this.authorityId = idAuthorityId;
	}

	public int getClaimId() {
		return claimId;
	}

	public void setClaimId(int claimId) {
		this.claimId = claimId;
	}

	public String getDateAssignement() {
		return dateAssignement;
	}

	public void setDateAssignement(String dateAssignement) {
		this.dateAssignement = dateAssignement;
	}

	public Assignement(int administratorId, int idAuthorityId, int claimId,
			String dateAssignement) {
		super();
		this.administratorId = administratorId;
		this.authorityId = idAuthorityId;
		this.claimId = claimId;
		this.dateAssignement = dateAssignement;
	}

}
