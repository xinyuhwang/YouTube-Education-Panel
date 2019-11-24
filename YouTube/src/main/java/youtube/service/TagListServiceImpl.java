package youtube.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import youtube.dao.TagListDao;
import youtube.model.TagList;

/* 
 * This class implements tagListService and enables tagList dao access in the controller
 */
@Service
public class TagListServiceImpl implements TagListService {
	@Autowired
	private TagListDao tagListDao;
	
	public TagList getTagListById(int tagListId) {
		return tagListDao.getTagListById(tagListId);
	}
}
