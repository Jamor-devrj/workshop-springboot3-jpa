package com.estudando.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudando.course.entities.Order;
import com.estudando.course.repositories.OrderRepository;

//@Component <-- registra a classe como componente do Spring


@Service  // <-- reggistra a classe como serviço
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	//metodo para retornar todos os usuarios.
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}

}
