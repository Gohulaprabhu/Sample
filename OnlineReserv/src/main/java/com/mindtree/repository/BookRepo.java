package com.mindtree.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mindtree.model.Book;

public interface BookRepo extends JpaRepository<Book,Long> {

	@Query("select b from Book b where b.date=:date and b.restaurant_id=:id")
	public List<Book> getByDateWithRestaurant(@Param("date") Date date,@Param("id") int id);
	
	public List<Book> findByDate(Date date);
	
}
