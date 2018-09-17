package in.smartbox.springcms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.smartbox.springcms.model.Post;
import in.smartbox.springcms.repository.AuthorRespository;
import in.smartbox.springcms.repository.PostRespository;
import in.smartbox.springcms.service.AssignmentService;

@RestController
@RequestMapping("/post")

public class PostController {

	@Autowired
	private AssignmentService assignmentService;
	
	@Autowired
	AuthorRespository authorRepository;
	@Autowired
	PostRespository postRepository;
	
	@PostMapping(value = "/savepost", consumes = "application/json", produces = "application/json")
	public void savePost(@RequestBody Post post) {
		
		assignmentService.savePost(post);
		
	}
	
	

}
