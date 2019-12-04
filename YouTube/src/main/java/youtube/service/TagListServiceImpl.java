package youtube.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import youtube.dao.TagListDao;
import youtube.model.TagList;

@Service
public class TagListServiceImpl implements TagListService{

	@Autowired
	private TagListDao tagListDao;
	
	public void addTagList(TagList tagList) {
		tagListDao.addTagList(tagList);
	}
	public void removeTagList(String tid, String uid, String vid) {
		tagListDao.removeTagList(tid, uid, vid);
	}
	
}
