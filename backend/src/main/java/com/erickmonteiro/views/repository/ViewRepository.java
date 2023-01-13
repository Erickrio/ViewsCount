package com.erickmonteiro.views.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erickmonteiro.views.entities.View;

public interface ViewRepository extends JpaRepository<View,Long>{

}
