package in.smartbox.springcms.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.smartbox.springcms.model.Post;

@Repository
public interface PostRespository extends JpaRepository<Post, Long> {
	
	

}
