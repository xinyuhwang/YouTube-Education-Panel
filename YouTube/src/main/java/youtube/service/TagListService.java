package youtube.service;

import youtube.model.TagList;

public interface TagListService {
	void addTagList(TagList tagList);
	void removeTagList(String tid, String uid, String vid);
}
