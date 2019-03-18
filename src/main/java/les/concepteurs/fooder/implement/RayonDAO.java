package les.concepteurs.fooder.implement;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import les.concepteurs.fooder.dao.HibernateUtil;
import les.concepteurs.fooder.metier.Rayon;

public class RayonDAO {

    public void saveRayon(Rayon rayon) {

        Transaction transaction = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            // start a transaction
            transaction = session.beginTransaction();

            // save the student object
            session.save(rayon);

            // commit transaction
            transaction.commit();

        } catch (Exception e) {

            if (transaction != null) {

                transaction.rollback();

            }

            e.printStackTrace();

        }

    }

    public List<Rayon> getRayon() {

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            return session.createQuery("from Rayon", Rayon.class).list();

        }

    }

}