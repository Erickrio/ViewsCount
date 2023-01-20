package com.erickmonteiro.views.entities;
import java.io.Serializable;




import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_view")
public class View implements Serializable  {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer views;
	
	@ManyToOne
	@JoinColumn(name = "post_id")
	private Post post;
	
	public View () {
		
	}

	public View(Long id, Integer views,Post post) {
		this.id = id;
		this.views = views;
		this.post =post;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getViews() {
		return views;
	}

	public void setViews(Integer views) {
		this.views = views;
	}
	

	public Post getPost() {
		return post;
	}

	

}
