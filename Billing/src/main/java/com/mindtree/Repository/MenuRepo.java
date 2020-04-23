package com.mindtree.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.model.Menu;

public interface MenuRepo extends JpaRepository<Menu, Long> {

}
