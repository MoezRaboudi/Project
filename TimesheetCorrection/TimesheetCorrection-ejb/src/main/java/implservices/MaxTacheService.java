package implservices;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.MaxTache;
import interfservices.MaxTacheServiceRemote;

@Stateless
@LocalBean
public class MaxTacheService implements MaxTacheServiceRemote {
	
	@PersistenceContext(unitName= "TimesheetCorrection-ejb")
	EntityManager em ;

	

	@Override
	public List<MaxTache> allmaxtache() {
		
		return em.createQuery("from MaxTache w").getResultList();
	}

}
