package com.mindtree.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.model.ReserveTable;

public interface TableRepo extends JpaRepository<ReserveTable, Long> {

}
