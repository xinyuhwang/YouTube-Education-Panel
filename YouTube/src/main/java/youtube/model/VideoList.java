package youtube.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import youtube.model.Video;

@Entity
@Table(name="videolist")
public class VideoList implements Serializable {

	private static final long serialVersionUID = -2781491429949496943L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	// referencing side; The inverse side maps to the owning side
	@OneToMany(mappedBy = "videoList", cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	private List<Video> videoList;
	
	
	public int getId() {
		return id;
	}

	public List<Video> getVideoList() {
		return videoList;
	}


	public void setVideoList(List<Video> videoList) {
		this.videoList = videoList;
	}


	
}
