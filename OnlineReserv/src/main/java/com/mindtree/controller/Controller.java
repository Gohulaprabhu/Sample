package com.mindtree.controller;

import java.security.Principal;
import java.text.ParseException;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.business.BusinessLayer;
import com.mindtree.model.Book;


@RestController
@RequestMapping("/")
public class Controller {

	@Autowired
	BusinessLayer bL;
	
	@RequestMapping("/Health")
	public Principal message(Principal p) {
		System.out.println(p);
		return p;
		
	}

	@RequestMapping("/getRestaurtant")
	public ResponseEntity getAllRestaurants(Principal p) {
		return ResponseEntity.accepted().body(bL.getAll(p));
	}

	@RequestMapping("/getRestaurantOn")
	public ResponseEntity getRestaurantsOn(@RequestParam String date) {
		return ResponseEntity.accepted().body(bL.getRestaurantOn(date));
	}

	@RequestMapping(value = "/getTable")
	public ResponseEntity getTable(@RequestParam int r_id) {
		return ResponseEntity.accepted().body(bL.getTables(r_id));

	}

	@RequestMapping(value = "/getTableOn")
	public ResponseEntity getTable(@RequestParam int r_id,@RequestParam String date) throws ParseException {
		return ResponseEntity.accepted().body(bL.getTables(r_id, date));

	}

	@RequestMapping(value = "/Book", method = RequestMethod.POST)
	public ResponseEntity Book(@RequestBody Book book) {
		return ResponseEntity.accepted().body(bL.book(book));
	}

}
