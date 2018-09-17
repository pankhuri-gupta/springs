package in.smartbox.springcms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.smartbox.springcms.model.Comment;
import in.smartbox.springcms.repository.CommentRepository;
import in.smartbox.springcms.repository.PostRespository;
import in.smartbox.springcms.service.AssignmentService;
@RestController
@RequestMapping("/comment")

public class CommentController {
	
	@Autowired
	private AssignmentService assignmentService;
	
	@Autowired
	PostRespository postRepository;
	
	@Autowired
	CommentRepository commentRepository;
	
	
	@GetMapping("/viewcomments")
	public List<Comment> retrieveAllComments() {
		return commentRepository.findAll();
	}
	
	
	@PostMapping(value = "/savecomment", consumes = "application/json", produces = "application/json")
	public void saveComment(@RequestBody Comment comment) {
		
		assignmentService.saveComment(comment);
		
	}
	
	

}
