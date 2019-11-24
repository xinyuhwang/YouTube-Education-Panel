package youtube.dao;

import youtube.model.*;

public interface VideoDao {
	void addVideo(Video video);
	void removeVideo(int videoId);
}
