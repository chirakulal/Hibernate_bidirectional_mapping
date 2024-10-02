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
public class Departement {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String deptname;
	private int stafno;
	@ManyToOne
	private College college;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Students> students;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Teacher> teachers; 	
	public Departement() {
		// TODO Auto-generated constructor stub
	}
	public Departement(String deptname, int stafno, College college, List<Students> students, List<Teacher> teachers) {
		super();
		this.deptname = deptname;
		this.stafno = stafno;
		this.college = college;
		this.students = students;
		this.teachers = teachers;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public int getStafno() {
		return stafno;
	}
	public void setStafno(int stafno) {
		this.stafno = stafno;
	}
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	public List<Students> getStudents() {
		return students;
	}
	public void setStudents(List<Students> students) {
		this.students = students;
	}
	public List<Teacher> getTeachers() {
		return teachers;
	}
	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}

	
	

}
