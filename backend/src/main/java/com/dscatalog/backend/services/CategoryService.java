package com.dscatalog.backend.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dscatalog.backend.dto.CategoryDTO;
import com.dscatalog.backend.entities.Category;
import com.dscatalog.backend.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	@Transactional(readOnly = true)
	public List<CategoryDTO> findAll() {
		List<Category> list =  repository.findAll();
		
//		List<CategoryDTO> listDto = new ArrayList<>();
//		for(Category cat : list) {
//			listDto.add(new CategoryDTO(cat));
//		}
		
		return list.stream().map(x -> new CategoryDTO(x)).collect(Collectors.toList());
	
	}

}
