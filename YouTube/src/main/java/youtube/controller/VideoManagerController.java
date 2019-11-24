package youtube.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import youtube.model.Video;

@Controller
@RequestMapping("/video")
public class VideoManagerController {
	
	@ResponseBody
	@RequestMapping("/result")
	public Video getVedio(@PathVariable("query") String id) {
		// search video in the db
		return new Video();
	}
	
	
	@ResponseBody
	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)   
	public ResponseEntity<Boolean> deleteVideo(@PathVariable("id") String videoID) {

		// delete video from database 
		
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
		
	}
	
}
