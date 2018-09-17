package in.smartbox.springcms.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;

@Entity
@Table(name = "author")

public class Author implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(insertable = false)
	private Long id;
	@CreatedDate

	@Column(name = "created_at", insertable = false)
	private LocalDate date;

	@Column(name = "author_name", nullable = false)
	private String name;
	@Column(name = "author_email", nullable = false)
	private String email;
	@OneToMany(mappedBy = "author")

	private Set<Post> posts;

	public String getEmail() {
		return email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public Set<Post> getPosts() {
		return posts;
	}

	public void setPosts(Set<Post> posts) {
		this.posts = posts;
	}

	public void setName(String name) {
		this.name = name;
	}

}
