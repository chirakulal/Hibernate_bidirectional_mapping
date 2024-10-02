package org.University.carmanagement.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class University {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String location;
	@OneToMany(cascade = CascadeType.ALL)
	private List<College> college;

  public University() {
	// TODO Auto-generated constructor stub
}

public University(String name, String location, List<College> college) {
	super();
	this.name = name;
	this.location = location;
	this.college = college;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

public List<College> getCollege() {
	return college;
}

public void setCollege(List<College> college) {
	this.college = college;
}
  
	
}
