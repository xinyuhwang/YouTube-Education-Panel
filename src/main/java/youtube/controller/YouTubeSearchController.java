package youtube.controller;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import youtube.external.YouTubeClient;
import youtube.model.Video;

@Controller
public class YouTubeSearchController {
	
	@ResponseBody
	@RequestMapping(value = "/search", method = RequestMethod.GET)   
	// path variable with {username} in the url @PathVariable("username") String name
	// @PathVariabl Map<String, String> pathVars key- "username" value - input in url
	
	public ArrayList<Video> getVideoList() {

		
		ArrayList<Video> videoList = YouTubeClient.getVideoList("CS");
		
		
		return videoList;
		
	}
}
