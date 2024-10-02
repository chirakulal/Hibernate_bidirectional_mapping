package org.University.carmanagement.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Bus {

	@Id
	private int no;
	private String place;
	private int capacity;
	@ManyToOne
	private College college;
	
	public Bus() {
		// TODO Auto-generated constructor stub
	}

	public Bus(int no, String place, int capacity, College college) {
		super();
		this.no = no;
		this.place = place;
		this.capacity = capacity;
		this.college = college;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}
	
}
