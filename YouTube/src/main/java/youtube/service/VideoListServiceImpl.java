package youtube.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import youtube.dao.VideoListDao;
import youtube.model.VideoList;

/* 
 * This class implements videoListService and enables VideoList dao access in the controller
 */

@Service
public class VideoListServiceImpl implements VideoListService {

	@Autowired
	private VideoListDao videoListDao;
	
	public VideoList getVideoListById(int videoListId) {
		return videoListDao.getVideoListById(videoListId);
	}

}
