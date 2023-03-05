package com.erickmonteiro.views.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erickmonteiro.views.resources.PostResource;

@Service
public class PostService {
	
	 @Autowired
	 private PostResource repository;

}
