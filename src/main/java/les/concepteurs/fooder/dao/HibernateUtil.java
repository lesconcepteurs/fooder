package les.concepteurs.fooder.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import les.concepteurs.fooder.metier.Denree;
import les.concepteurs.fooder.metier.Recette;
import les.concepteurs.fooder.metier.ThemeRecette;
import les.concepteurs.fooder.metier.TypeRecette;
import les.concepteurs.fooder.metier.UniteMesure;


public class HibernateUtil {
	
	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {
			// Create the SessionFactory from hibernate.cfg.xml

			return new Configuration().configure().addAnnotatedClass(Recette.class)
													.addAnnotatedClass(ThemeRecette.class)
													.addAnnotatedClass(TypeRecette.class)
													.addAnnotatedClass(Denree.class)
													.addAnnotatedClass(UniteMesure.class)
													.buildSessionFactory();


		} catch (Throwable ex) {
			// Make sure you log the exception, as it might be swallowed
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
