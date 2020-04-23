package com.mindtree.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.business.Business;
import com.mindtree.model.Bill;

@RestController
public class Controller {

	@Autowired
	Business bl;
	
	@RequestMapping(value="/bill", method = RequestMethod.POST)
	public ResponseEntity createBill(@RequestBody Bill bill ) {
		return ResponseEntity.accepted().body(bl.createBill(bill));
	}
	@RequestMapping("/Health")
	public String message() {
		return "up and running";
	}
}
