package com.mindtree.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.model.Bill;

public interface BillRepo extends JpaRepository<Bill, Long> {

}
