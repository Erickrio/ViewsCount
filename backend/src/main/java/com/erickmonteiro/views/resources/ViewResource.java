package com.erickmonteiro.views.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestParam;

import java.net.URI;
import com.erickmonteiro.views.dto.ViewDTO;
import com.erickmonteiro.views.repository.ViewRepository;
import com.erickmonteiro.views.services.ViewService;

@RestController
@RequestMapping(value = "/views")
public class ViewResource {
	
	@Autowired
	private ViewService service;
	
	@Autowired
	private ViewRepository repository;
	
	  @GetMapping  
	    public ResponseEntity<List<ViewDTO>> findAll(){
	        List<ViewDTO> list = service.findAll();
	        return ResponseEntity.ok(list);
	   }
	  
	  @PostMapping
		public ResponseEntity<ViewDTO>insert(@RequestBody ViewDTO dto){
			dto = service.insert(dto);
			URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
					.buildAndExpand(dto.getId()).toUri();
			return ResponseEntity.created(uri).body(dto);
		}
	  
	  @GetMapping(value = "/{id}")
		public ResponseEntity<ViewDTO> findById(@PathVariable Long id) {
		  ViewDTO dto = service.findById(id);
			return ResponseEntity.ok().body(dto);
		}
	  
	  //@GetMapping(value = "/count-por-views/{id}")
	  @GetMapping(value = "/count-por-views")
		public Integer viewsCountToViews() {
			return repository.selectTotals();
		}
	  

	
}
