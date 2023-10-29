package com.estudando.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudando.course.entities.Product;
import com.estudando.course.repositories.ProductRepository;

//@Component <-- registra a classe como componente do Spring


@Service  // <-- reggistra a classe como serviço
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	//metodo para retornar todos os produtos.
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}

}
