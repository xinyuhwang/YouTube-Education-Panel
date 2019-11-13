package youtube.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import youtube.model.NotePad;

@Entity
@Table(name="video")
public class Video implements Serializable {

	private static final long serialVersionUID = 6245772803345049074L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String url;
	private String title;
	
	// the owning side; owns foreign key to he videolist
	@ManyToOne
	@JoinColumn(name="videolistId")
	private VideoList videoList;
	
	@OneToOne
	@JoinColumn(name="notepadId")
	private NotePad notePad;
	
	@OneToOne(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name = "taglistId")
	private TagList tagList;
	
	public int getId() {
		return id;
	}
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public VideoList getVideoList() {
		return videoList;
	}

	public void setVideoList(VideoList videoList) {
		this.videoList = videoList;
	}
}
