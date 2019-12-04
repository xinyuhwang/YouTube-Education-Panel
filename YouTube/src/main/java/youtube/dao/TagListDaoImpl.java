package youtube.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import youtube.model.*;

@Repository
public class TagListDaoImpl implements TagListDao{
	@Autowired
	private SessionFactory sessionFactory;

	public void addTagList(TagList tagList) {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			session.beginTransaction();
			session.saveOrUpdate(tagList);
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
	public void removeTagList(String tid, String uid, String vid) {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			session.beginTransaction();
			String hql = "DELETE FROM TagList WHERE tid = :tid and uid = :uid and vid = :vid";
			Query qry = session.createQuery(hql)
											.setParameter("tid", tid)
											.setParameter("uid", uid)
											.setParameter("vid", vid);
			int res = qry.executeUpdate();
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
	
}
