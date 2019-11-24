package youtube.service;

import youtube.model.Tag;

public interface TagService {
	void addTag(Tag tag);
	void removeTag(int TagId);
}
