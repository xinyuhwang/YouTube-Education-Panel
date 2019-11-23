package youtube.dao;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import youtube.model.*;

@Repository
public class UserDaoImpl implements UserDao{
	@Autowired
	private SessionFactory sessionFactory;
	public void addUser(User user) {
		VideoList videoList = new VideoList();
		videoList.setUser(user);
		user.setVideoList(videoList);
		
		try (Session session = sessionFactory.openSession()) {
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
