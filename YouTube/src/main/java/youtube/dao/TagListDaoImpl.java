package youtube.dao;

import java.io.IOException;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import youtube.model.*;

@Repository
public class TagListDaoImpl implements TagListDao{
	@Autowired
	private SessionFactory sessionFactory;
	
	public TagList getTagListById(int TagListId) {
		TagList taglist = null;
		try (Session session = sessionFactory.openSession()) {
			session.beginTransaction();
			taglist = (TagList) session.get(TagList.class, TagListId);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return taglist;
	}
}
