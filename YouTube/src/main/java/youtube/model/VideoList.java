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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import youtube.model.Video;
import youtube.model.User;

@Entity
@Table(name="videolist")
public class VideoList implements Serializable {

	private static final long serialVersionUID = -2781491429949496943L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@OneToOne(mappedBy = "videoList")
	@JsonIgnore
	private User user;
	
	// referencing side; The inverse side maps to the owning side
	@OneToMany(mappedBy = "videoList", cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	private List<Video> videoList;
	
	
	public int getId() {
		return id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public List<Video> getVideoList() {
		return videoList;
	}


	public void setVideoList(List<Video> videoList) {
		this.videoList = videoList;
	}


	
}
