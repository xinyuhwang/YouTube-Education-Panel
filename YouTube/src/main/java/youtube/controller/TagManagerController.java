package youtube.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import youtube.model.Tag;
import youtube.model.Video;
import youtube.service.TagService;

@Controller
@RequestMapping(value = "/tag")
public class TagManagerController {
	

    @Autowired
    private TagService tagService;
	
	@ResponseBody
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ResponseEntity<Boolean> addTag(@RequestParam("tagName") String tagName) {
		System.out.print(tagName + "add successfully");
		// add video to db
//		Tag tag = new Tag();
//	   	tag.setName(tagName);
//	   	tag.setId(1);
//	   	tagService.addTag(tag);	
		return new ResponseEntity<Boolean>(true, HttpStatus.OK); 
	}
	
	@ResponseBody
	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)   	
	public ResponseEntity<Boolean> deleteTag(@PathVariable("name") String tagName) {

		// delete tag from database 
				
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}

}
