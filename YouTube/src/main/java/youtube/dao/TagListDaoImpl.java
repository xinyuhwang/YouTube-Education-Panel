package youtube.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import youtube.model.*;

@Repository
public class TagListDaoImpl implements TagListDao{
	@Autowired
	private SessionFactory sessionFactory;
	
	public TagList getTagListById(int tagListId) {
		TagList taglist = null;
		try (Session session = sessionFactory.openSession()) {
			session.beginTransaction();
			taglist = (TagList) session.get(TagList.class, tagListId);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return taglist;
	}
}
