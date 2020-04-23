package com.mindtree.business;

import java.security.Principal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.model.Book;
import com.mindtree.model.ReserveTable;
import com.mindtree.model.Restaurant;
import com.mindtree.repository.BookRepo;
import com.mindtree.repository.RestaurantRepo;

@Service
public class BusinessLayer {

	@Autowired
	RestaurantRepo restaurantRepo;
	@Autowired
	BookRepo bookRepo;

	public List<Restaurant> getAll(Principal p) {
		System.out.println(p);
		List<Restaurant> res = restaurantRepo.findAll();
		return res;

	}
	public List<Restaurant> getRestaurantOn(String date) {
		List<Restaurant> r = restaurantRepo.findAll();
		List<Restaurant> res = new ArrayList<Restaurant>();
		for (Restaurant rt : r) {
			List<ReserveTable> rst;
			try {
				rst = getTables(rt.getR_id(), date);
			if (rst.isEmpty()) {
				continue;
			} else {
				rt.setTable(rst);
				res.add(rt);
			}
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		return res;
	}

	public List<ReserveTable> getTables(int r_id) {
		Optional<Restaurant> res = restaurantRepo.findById(r_id);
		return res.get().getTable();
	}

	public List<ReserveTable> getTables(int r_id, String date) throws ParseException {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date d = simpleDateFormat.parse(date);
		List<Book> b = bookRepo.getByDateWithRestaurant(d, r_id);
		Optional<Restaurant> res = restaurantRepo.findById(r_id);
		List<ReserveTable> resTable = new ArrayList<ReserveTable>();
		boolean flag;
		for (ReserveTable rt : res.get().getTable()) {
			flag = false;
			for (Book bk : b) {
				if (rt.getTable_id() == bk.getTable().getTable_id()) {
					flag = true;
				}
			}
			if (!flag) {
				resTable.add(rt);
			}
		}
		return resTable;
	}
	public int book(Book book) {
		int id=bookRepo.save(book).getId();
		return id;
	}

}
