package in.smartbox.springcms.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name= "Post")

public class Post implements Serializable{
	

	private static final long serialVersionUID = 1L;
	@OneToMany( mappedBy = "post")
	private Set<Comment>comments;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(insertable= false)
	private Long id;
	
	
	
	@Temporal(TemporalType.DATE)
	@Column(name= "created_at")
	private Date date;
	
	
	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name= "author_id" , referencedColumnName="id")
	private Author author;
	
	
	@Column(name = "post_content")
	private String postContent;
	
	public Set<Comment> getComments() {
		return comments;
	}
	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public String getPostContent() {
		return postContent;
	}
	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}

	

}
