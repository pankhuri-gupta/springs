package in.smartbox.springcms.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.smartbox.springcms.model.Author;
import in.smartbox.springcms.model.Comment;
import in.smartbox.springcms.model.Post;
import in.smartbox.springcms.repository.AuthorRespository;
import in.smartbox.springcms.repository.CommentRepository;
import in.smartbox.springcms.repository.PostRespository;
import in.smartbox.springcms.service.AssignmentService;

@Service
public class AssignmentServiceImpl implements AssignmentService {
	
	@Autowired
	private AuthorRespository authorRespository;
	@Autowired
	private PostRespository  postRespository;

	@Autowired
	private CommentRepository commentRespository;
	

	@Override
	public void saveAuthor(Author author) {
		
		authorRespository.save(author);
		
	}
	
	@Override
	public void savePost(Post post)
	{
		postRespository.save(post);
	}
	
		
	@Override
	public void saveComment(Comment comment)
	{
		commentRespository.save(comment);
	}

	@Override
	public int addTwoNumber(int numberOne, int numberTwo) {
		return numberOne + numberTwo;
	}
	

}
