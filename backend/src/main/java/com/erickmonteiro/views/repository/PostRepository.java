package com.erickmonteiro.views.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erickmonteiro.views.entities.Post;


@Repository
public interface PostRepository extends JpaRepository<Post,Long>{

}
