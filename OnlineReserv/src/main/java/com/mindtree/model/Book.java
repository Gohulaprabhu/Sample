package com.mindtree.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@OneToOne
	private ReserveTable table;
	private Date date;
	private int restaurant_id;

	@ManyToMany
	private List<Menu> menu;

	@ManyToOne(cascade=CascadeType.ALL)
	private User user;

	@Override
	public String toString() {
		return "Book [id=" + id + ", table=" + table + ", date=" + date + ", restaurant_id=" + restaurant_id + ", menu="
				+ menu + ", user=" + user + "]";
	}

	public int getRestaurant_id() {
		return restaurant_id;
	}

	public void setRestaurant_id(int restaurant_id) {
		this.restaurant_id = restaurant_id;
	}

	public ReserveTable getTable() {
		return table;
	}

	public void setTable(ReserveTable table) {
		this.table = table;
	}

	public List<Menu> getMenu() {
		return menu;
	}

	public void setMenu(List<Menu> menu) {
		this.menu = menu;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
