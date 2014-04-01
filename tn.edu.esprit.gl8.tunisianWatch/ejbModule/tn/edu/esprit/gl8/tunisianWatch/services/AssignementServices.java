package tn.edu.esprit.gl8.tunisianWatch.services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.edu.esprit.gl8.tunisianWatch.domain.Assignement;
import tn.edu.esprit.gl8.tunisianWatch.impl.AssignementServicesLocal;

/**
 * Session Bean implementation class AssignementServices
 */
@Stateless
@LocalBean
public class AssignementServices implements AssignementServicesLocal {

	/**
	 * Default constructor.
	 */

	@PersistenceContext
	EntityManager entityManager;

	public AssignementServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean addAssignement(int administratorId, int authorityId,
			int claimId, String dateAssignement) {
		boolean b = false;
		try {
			entityManager.persist(new Assignement(administratorId, authorityId,
					claimId, dateAssignement));
			b = true;
		} catch (Exception e) {
			// TODO: handle exception
		}

		return b;
	}

	@Override
	public boolean deleteAssignement(int idAssignement) {
		boolean b = false;
		try {
			Assignement assignement = entityManager.find(Assignement.class,
					idAssignement);
			entityManager.remove(assignement);
			b = true;
		} catch (Exception exception) {
			exception.printStackTrace();

		}

		return b;
	}

	@Override
	public List<Assignement> getAllAssignements() {
		Query query = (Query) entityManager
				.createQuery("select a from Assignement a");
		return ((javax.persistence.Query) query).getResultList();
	}

}
