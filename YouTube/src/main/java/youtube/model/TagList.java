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

import youtube.model.Tag;
import youtube.model.Video;

@Entity
@Table(name="taglist")
public class TagList implements Serializable{

	private static final long serialVersionUID = 2467505249168351129L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@OneToOne(mappedBy = "tagList")
	private Video video;


	@OneToMany(mappedBy = "tagList", cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	private List<Tag> tagList;
	
	public int getId() {
		return id;
	}
	
	public void setTagList(List<Tag> tagList) {
		this.tagList = tagList;
	}
	
	public List<Tag> getTagList() {
		return tagList;
	}
	
	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}
}
