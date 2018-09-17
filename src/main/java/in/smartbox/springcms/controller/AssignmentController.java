package in.smartbox.springcms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import in.smartbox.springcms.model.Author;
import in.smartbox.springcms.repository.AuthorRespository;
import in.smartbox.springcms.repository.PostRespository;
import in.smartbox.springcms.service.AssignmentService;

@RestController
@RequestMapping("/assignment")
public class AssignmentController {
	
	

	@Autowired
	private AssignmentService assignmentService;
	
	@Autowired
	AuthorRespository authorRepository;
	@Autowired
	PostRespository postRepository;
	
	
	
	@GetMapping("/viewauthor")
	public List<Author> retrieveAllAuthors() {
		return authorRepository.findAll();
	}
	
	
	@GetMapping("/author/{id}")
	public Author retrieveAuthor(@PathVariable long id) throws Exception {
		java.util.Optional<Author> author = authorRepository.findById(id);

		if (!author.isPresent())
			throw new Exception("id-" + id);

		return author.get();
	}
	
	
	@PostMapping(value = "/saveauthor", consumes = "application/json", produces = "application/json")
	public void saveAuthor(@RequestBody Author author) {
		
		assignmentService.saveAuthor(author);
		
	}

	
	
	
}
