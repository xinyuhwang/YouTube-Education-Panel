package youtube.service;

import youtube.model.Video;

public interface VideoService {
	void addVideo(Video video);
	void removeVideo(String videoId);
}
