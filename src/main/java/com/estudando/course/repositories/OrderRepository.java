package com.estudando.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudando.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
	/*nao precisa implementar essa interface
	 * pq o spring Data JPA ja tem implementação padrao para essa interface
	 * 
	 * 
	 */

}
