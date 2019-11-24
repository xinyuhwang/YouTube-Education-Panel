package youtube.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import youtube.model.*;

@Repository
public class VideoListDaoImpl implements VideoListDao{
	@Autowired
	private SessionFactory sessionFactory;

	public VideoList getVideoListById(int VideoListId) {
		VideoList videolist = null;
		try (Session session = sessionFactory.openSession()) {
			session.beginTransaction();
			videolist = (VideoList) session.get(VideoList.class, VideoListId);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return videolist;
	}
}
