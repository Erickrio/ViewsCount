package com.erickmonteiro.views.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.erickmonteiro.views.dto.ViewDTO;
import com.erickmonteiro.views.entities.View;
import com.erickmonteiro.views.repository.ViewRepository;
import com.erickmonteiro.views.services.exceptions.ResourceNotFoundException;

@Service
public class ViewService {
	
	 @Autowired
    private ViewRepository repository;

    @Transactional(readOnly = true)
    public List<ViewDTO> findAll() {
        List<View> list = repository.findAll();
        return list.stream().map(x -> new ViewDTO(x)).collect(Collectors.toList());
    }
    
	@Transactional
	public ViewDTO insert(ViewDTO dto) {
		View entity = new View();
	    entity.setViews(dto.getViews());
		entity = repository.save(entity);
		return new ViewDTO(entity);
	}
	
	@Transactional(readOnly = true)
	public ViewDTO findById(Long id) {
		Optional<View> obj = repository.findById(id);
		View entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
		return new ViewDTO(entity);
	}

}
