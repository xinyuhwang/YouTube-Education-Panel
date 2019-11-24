package youtube.controller;

import java.util.ArrayList;

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

@Controller
public class HomePageController {
	
	
	@ResponseBody
	@RequestMapping(value = "/login", method = RequestMethod.GET)   
	// path variable with {username} in the url @PathVariable("username") String name
	// @PathVariabl Map<String, String> pathVars key- "username" value - input in url
	
	public ResponseEntity<Boolean> login(@RequestParam("name") String name, @RequestParam("pwd") String pwd) {

		// check if the user if our user and password is correct
		if (name.equals("1111") && pwd.equals("2222")) {
			return new ResponseEntity<Boolean>(true, HttpStatus.OK);
		} else {
			return new ResponseEntity<Boolean>(false, HttpStatus.BAD_REQUEST);
		}		
		
	}
}
