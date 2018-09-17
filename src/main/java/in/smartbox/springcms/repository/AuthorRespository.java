package in.smartbox.springcms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.smartbox.springcms.model.Author;


@Repository
public interface AuthorRespository extends JpaRepository<Author, Long> {

}

	


