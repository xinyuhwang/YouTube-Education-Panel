package youtube.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import youtube.external.YouTubeClient;
import youtube.model.User;
import youtube.model.Video;
import youtube.service.TagService;
import youtube.service.UserService;
import youtube.service.VideoService;

@Controller
public class YouTubeManagerController {
	
	@Autowired
	private VideoService videoService;
	
	@Autowired
	private UserService userService;
	
	@ResponseBody
	@RequestMapping(value = "/search/{query}", method = RequestMethod.GET)   
	public ArrayList<Video> getVideoList(@PathVariable("query") String term) {

		ArrayList<Video> videoList = YouTubeClient.getVideoList(term);
		
		return videoList;
		
	}
	

	@ResponseBody
	@RequestMapping(value = "/favorite", method = RequestMethod.GET)
	public ResponseEntity<Boolean> favorite(@RequestParam("name") String name, Video video) {
		User user = userService.getUser(name);
		user.getVideoList().add(video);
		
		video.setUserList(new ArrayList<User>());
		video.getUserList().add(user);
		
		videoService.addVideo(video);
		userService.addUser(user);
		return new ResponseEntity<Boolean>(true, HttpStatus.OK); 
	}
	
}
