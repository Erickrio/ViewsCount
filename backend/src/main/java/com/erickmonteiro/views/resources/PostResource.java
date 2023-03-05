package com.erickmonteiro.views.resources;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.erickmonteiro.views.entities.Post;
import com.erickmonteiro.views.repository.PostRepository;
import com.erickmonteiro.views.services.PostService;


@RestController
@RequestMapping(value = "/post")
public class PostResource {
	
	@Autowired
	private PostService service;
	
	@Autowired
	private PostRepository postRepository;
	
	@PostMapping("/posts/{id}/views")
	public void incrementPostViews(@PathVariable Long id) {
	    Optional<Post> optionalPost = postRepository.findById(id);
	    if (optionalPost.isPresent()) {
	        Post post = optionalPost.get();
	        post.setView(post.getView() + 1);
	        postRepository.save(post);
	    } else {
	        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
	    }
	}

}
