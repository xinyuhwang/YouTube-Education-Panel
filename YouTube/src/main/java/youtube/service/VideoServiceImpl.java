package youtube.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import youtube.dao.VideoDao;
import youtube.model.Video;


/* 
 * This class implements videoService and enables video dao access in the controller
 */
@Service
public class VideoServiceImpl implements VideoService{
	@Autowired
	private VideoDao videoDao;
	
	public void addVideo(Video video) {
		videoDao.addVideo(video);
	}
	
	public void removeVideo(int videoId) {
		videoDao.removeVideo(videoId);
	}
}
