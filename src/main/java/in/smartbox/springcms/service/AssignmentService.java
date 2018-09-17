package in.smartbox.springcms.service;

import in.smartbox.springcms.model.Author;
import in.smartbox.springcms.model.Comment;
import in.smartbox.springcms.model.Post;

public interface AssignmentService {
	
	void saveAuthor(Author author);
	void savePost(Post post);
	void saveComment(Comment comment);
	int addTwoNumber(int numberOne, int numberTwo);
}
