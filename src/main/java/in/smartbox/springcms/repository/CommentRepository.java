package in.smartbox.springcms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.smartbox.springcms.model.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long>{

}
