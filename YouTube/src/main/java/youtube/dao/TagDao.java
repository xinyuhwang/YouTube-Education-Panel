package youtube.dao;

import youtube.model.*;

public interface TagDao {
	void addTag(Tag tag);
	void removeTag(int tagId);
}
