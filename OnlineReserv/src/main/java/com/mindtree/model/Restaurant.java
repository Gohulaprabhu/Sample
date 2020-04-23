package com.mindtree.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Restaurant {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int r_id;
	private String r_Name;
	private int r_cost;

	@OneToMany
	private List<ReserveTable> table;

	@OneToMany
	private List<Menu> menu;

	public List<Menu> getMenu() {
		return menu;
	}

	public void setMenu(List<Menu> menu) {
		this.menu = menu;
	}

	public List<ReserveTable> getTable() {
		return table;
	}

	public void setTable(List<ReserveTable> table) {
		this.table = table;
	}

	public int getR_id() {
		return r_id;
	}

	public void setR_id(int r_id) {
		this.r_id = r_id;
	}

	public String getR_Name() {
		return r_Name;
	}

	public void setR_Name(String r_Name) {
		this.r_Name = r_Name;
	}

	public int getR_cost() {
		return r_cost;
	}

	public void setR_cost(int r_cost) {
		this.r_cost = r_cost;
	}

}
