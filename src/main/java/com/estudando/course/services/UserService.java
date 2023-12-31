package com.estudando.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudando.course.entities.User;
import com.estudando.course.repositories.UserRepository;

//@Component <-- registra a classe como componente do Spring


@Service  // <-- reggistra a classe como serviço
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	//metodo para retornar todos os usuarios.
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}

}
