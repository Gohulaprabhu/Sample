package com.mindtree.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.model.Restaurant;


public interface RestaurantRepo extends JpaRepository<Restaurant, Integer>{
	
		
}
