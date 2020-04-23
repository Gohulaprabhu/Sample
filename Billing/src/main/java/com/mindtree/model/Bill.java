package com.mindtree.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Bill {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int Book_id;
	private String user_name;
	private String user_email;
	private String res_name;
	private int res_cost;
	private int table_id;
	private Date date;
	@OneToMany(cascade=CascadeType.ALL)
	private  List<Menu> menu=new ArrayList<Menu>();
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Bill [id=" + id + ", Book_id=" + Book_id + ", user_name=" + user_name + ", user_email=" + user_email
				+ ", res_name=" + res_name + ", res_cost=" + res_cost + ", table_id=" + table_id + ", menu=" + menu
				+ ", total_cost=" + total_cost + "]";
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	private int total_cost;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBook_id() {
		return Book_id;
	}
	public void setBook_id(int book_id) {
		Book_id = book_id;
	}
	public String getRes_name() {
		return res_name;
	}
	public void setRes_name(String res_name) {
		this.res_name = res_name;
	}
	public int getRes_cost() {
		return res_cost;
	}
	public void setRes_cost(int res_cost) {
		this.res_cost = res_cost;
	}
	public int getTable_id() {
		return table_id;
	}
	public void setTable_id(int table_id) {
		this.table_id = table_id;
	}
	public List<Menu> getMenu() {
		return menu;
	}
	public void setMenu(List<Menu> menu) {
		this.menu = menu;
	}
	public int getTotal_cost() {
		return total_cost;
	}
	public void setTotal_cost(int total_cost) {
		this.total_cost = total_cost;
	}
	
	
}
