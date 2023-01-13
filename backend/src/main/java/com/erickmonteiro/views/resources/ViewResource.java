package com.erickmonteiro.views.resources;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erickmonteiro.views.dto.ViewDTO;

@RestController
@RequestMapping(value = "/views")
public class ViewResource {
	
//	  @GetMapping  
//	    public ResponseEntity<List<ViewDTO>> findAll(){
//	        List<ViewDTO> list = service.findAll();
//	        return ResponseEntity.ok(list);
//	   }

}
