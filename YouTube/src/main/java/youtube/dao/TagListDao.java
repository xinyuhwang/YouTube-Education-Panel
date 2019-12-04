package youtube.dao;

import youtube.model.*;

public interface TagListDao {
	void addTagList(TagList tagList);
	void removeTagList(String tid, String uid, String vid);
}
