package youtube.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import youtube.dao.TagDao;
import youtube.model.Tag;

/* 
 * This class implements tagService and enables tag dao access in the controller
 */
@Service
public class TagServiceImpl implements TagService {
	@Autowired
	private TagDao tagDao;
	
	public void addTag(Tag tag) {
		tagDao.addTag(tag);
	}
	
	public void removeTag(int tagId) {
		tagDao.removeTag(tagId);
	}
}
