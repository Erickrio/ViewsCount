package com.erickmonteiro.views.dto;

import java.io.Serializable;
import java.util.Objects;

import com.erickmonteiro.views.entities.View;

public class ViewDTO   implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Integer views;
	
	 public ViewDTO (){}
	 
	 

	public ViewDTO(Long id, Integer views) {
		this.id = id;
		this.views = views;
	}

	public ViewDTO(View entity) {
		id = entity.getId();
		views = entity.getViews();
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

	
}
