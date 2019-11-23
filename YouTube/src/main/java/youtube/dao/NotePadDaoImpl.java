package youtube.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import youtube.model.*;

@Repository
public class NotePadDaoImpl implements NotePadDao{	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void addNotePad(NotePad notepad) {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			session.beginTransaction();
			session.save(notepad);
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
	
	public void deleteNotePad(int NotePadId) {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			session.beginTransaction();
			NotePad notepad = (NotePad) session.get(NotePad.class, NotePadId);
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
	
	public void updateNotePad(NotePad notepad) {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			session.beginTransaction();
			session.saveOrUpdate(notepad);
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
	
	public NotePad getNotePadById(int NotePadId) {
		try (Session session = sessionFactory.openSession()) {
			session.beginTransaction();
			NotePad product = (NotePad) session.get(NotePad.class, NotePadId);
			session.getTransaction().commit();
			return product;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
