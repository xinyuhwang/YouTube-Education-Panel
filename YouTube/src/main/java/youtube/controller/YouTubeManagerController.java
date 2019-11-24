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
import youtube.model.Video;
import youtube.service.VideoService;

@Controller
public class YouTubeManagerController {
	
	@ResponseBody
	@RequestMapping(value = "/search/{query}", method = RequestMethod.GET)   
	// path variable with {username} in the url @PathVariable("username") String name
	// @PathVariabl Map<String, String> pathVars key- "username" value - input in url
	
	public ArrayList<Video> getVideoList(@PathVariable("query") String term) {

		ArrayList<Video> videoList = YouTubeClient.getVideoList(term);
		
		return videoList;
		
	}
	
	@ResponseBody
	@RequestMapping(value = "/favorite", method = RequestMethod.POST)
	public ResponseEntity<Boolean> favorite(@RequestParam("video") Video v) {
		// add video to db
		//videoService.addVideo(v);
		return new ResponseEntity<Boolean>(true, HttpStatus.OK); 
	}
}
