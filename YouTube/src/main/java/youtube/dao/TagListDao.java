package youtube.dao;

import java.util.*;

import youtube.model.*;

public interface TagListDao {
	void addTagList(TagList tagList);
	List<Tag> getTags(String uid, String vid);
	void removeTagList(String tid, String uid, String vid);
}
