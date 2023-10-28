package com.estudando.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudando.course.entities.Category;
import com.estudando.course.repositories.CategoryRepository;

//@Component <-- registra a classe como componente do Spring


@Service  // <-- reggistra a classe como serviço
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	//metodo para retornar todos os usuarios.
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}

}
