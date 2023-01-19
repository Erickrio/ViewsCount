package com.erickmonteiro.views.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.erickmonteiro.views.entities.View;

@Repository
public interface ViewRepository extends JpaRepository<View,Long>{

	//int countById(Long id);
	
	@Query("SELECT COUNT(views) FROM View ")
	long countById(Long id);
}
