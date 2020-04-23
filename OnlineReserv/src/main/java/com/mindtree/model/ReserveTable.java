package com.mindtree.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ReserveTable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int table_id;
	private int table_no;
	private String Description;

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public int getTable_id() {
		return table_id;
	}

	public void setTable_id(int table_id) {
		this.table_id = table_id;
	}

	public int getTable_no() {
		return table_no;
	}

	public void setTable_no(int table_no) {
		this.table_no = table_no;
	}

}
