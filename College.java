package org.University.carmanagement.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class College {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String location;
	@ManyToOne
	private University uni;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Departement> departement;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Bus> bus;
	

	public College() {
		// TODO Auto-generated constructor stub
	}


	public College(String name, String location, University uni, List<Departement> departement, List<Bus> bus) {
		super();
		this.name = name;
		this.location = location;
		this.uni = uni;
		this.departement = departement;
		this.bus = bus;
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


	public University getUni() {
		return uni;
	}


	public void setUni(University uni) {
		this.uni = uni;
	}


	public List<Departement> getDepartement() {
		return departement;
	}


	public void setDepartement(List<Departement> departement) {
		this.departement = departement;
	}


	public List<Bus> getBus() {
		return bus;
	}


	public void setBus(List<Bus> bus) {
		this.bus = bus;
	}


	
	
	
}
