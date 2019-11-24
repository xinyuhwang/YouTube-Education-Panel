package youtube.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import youtube.model.*;

@Repository
public class NotePadDaoImpl implements NotePadDao{	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void addNotePad(NotePad notePad) {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			session.beginTransaction();
			session.save(notePad);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
	
	public void deleteNotePad(int notePadId) {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			session.beginTransaction();
			NotePad notepad = (NotePad) session.get(NotePad.class, notePadId);
			session.delete(notepad);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			if (session != null) {
				session.close();
			}
		}

	}
	
	public void updateNotePad(NotePad notePad) {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			session.beginTransaction();
			session.saveOrUpdate(notePad);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			if (session != null) {
				session.close();
			}
		}

	}
	
	public NotePad getNotePadById(int notePadId) {
		try (Session session = sessionFactory.openSession()) {
			session.beginTransaction();
			NotePad product = (NotePad) session.get(NotePad.class, notePadId);
			session.getTransaction().commit();
			return product;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
