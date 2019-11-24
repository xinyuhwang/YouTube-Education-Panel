package youtube.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import youtube.model.*;

@Repository
public class VideoDaoImpl implements VideoDao{
	@Autowired
	private SessionFactory sessionFactory;
	
	public void addVideo(Video video) {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			session.beginTransaction();
			session.saveOrUpdate(video);
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
	
	public void removeVideo(String videoId) {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			Video video = (Video) session.get(Video.class, videoId);
			VideoList videolist = video.getVideoList();
			List<Video> videos = videolist.getVideoList();
			videos.remove(video);
			session.beginTransaction();
			session.delete(video);
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
