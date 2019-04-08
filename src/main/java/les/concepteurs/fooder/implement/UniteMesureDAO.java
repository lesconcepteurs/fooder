package les.concepteurs.fooder.implement;

import java.util.List;

import les.concepteurs.fooder.dao.DAOHibSessionTransaction;
import les.concepteurs.fooder.dao.interfaceDAOHibernate;
import les.concepteurs.fooder.metier.UniteMesure;

public class UniteMesureDAO extends DAOHibSessionTransaction implements interfaceDAOHibernate<UniteMesure, Integer> 
{
	

	@Override
	public UniteMesure findById(Integer id) {
		
		UniteMesure uniteMesure = getSession().get(UniteMesure.class, id);
		
		return null;
	}

	@Override
	public List<UniteMesure> findAll() {
		
		List<UniteMesure> listeUniteMesure = getSession().createQuery("from unite_mesure").getResultList();
		
		return null;
	}

}
