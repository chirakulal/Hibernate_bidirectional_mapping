package org.University.carmanagement.driver;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.University.carmanagement.entity.Bus;
import org.University.carmanagement.entity.College;
import org.University.carmanagement.entity.Departement;
import org.University.carmanagement.entity.Students;
import org.University.carmanagement.entity.University;

public class Driver {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pavan");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Students st = new Students();
		st.setName("chira");
		st.setPhno(43712873);
		
		Students st1 = new Students();
		st1.setName("cdgh");
		st1.setPhno(25713692);
		
		ArrayList<Students> aa = new ArrayList<Students>();
		aa.add(st);
		aa.add(st1);
		
		Students st2 = new Students();
		st2.setName("dbvif");
		st2.setPhno(43712873);
		
		Students st3 = new Students();
		st3.setName("cnjkfjv");
		st3.setPhno(25713692);
		
		ArrayList<Students> aaa = new ArrayList<Students>();
		aaa.add(st);
		aaa.add(st1);
		
		
		Bus b = new Bus();
		b.setNo(1);
		b.setPlace("bcroad");
		b.setCapacity(30);
		
		Bus b1 = new Bus();
		b1.setNo(2);
		b1.setPlace("mglr");
		b1.setCapacity(50);
		
	     ArrayList<Bus> a1 = new ArrayList<Bus>();
	     a1.add(b);
	     a1.add(b1);
		
		
		Departement dp = new Departement();
		dp.setDeptname("csbs");
		dp.setStafno(6);
		Departement dp1 = new Departement();
		dp1.setDeptname("csd");
		dp1.setStafno(8);
		
		ArrayList<Departement> ad = new ArrayList<Departement>();
		ad.add(dp);
		ad.add(dp1);
		
		st.setDepartement(dp);
		st1.setDepartement(dp);
		dp.setStudents(aa);
		
		
		
		
		st2.setDepartement(dp1);
		st3.setDepartement(dp1);
		dp.setStudents(aaa);
		
		
		College cg = new College();
		cg.setName("cec");
		cg.setLocation("bantwal");
		
		dp.setCollege(cg);
		dp1.setCollege(cg);
		b.setCollege(cg);
		b1.setCollege(cg);
		cg.setDepartement(ad);
		cg.setBus(a1);
		
		Bus b2 = new Bus();
		b2.setNo(4);
		b2.setPlace("bcroad");
		b2.setCapacity(50);
		
		Bus b3 = new Bus();
		b3.setNo(6);
		b3.setPlace("mglr");
		b3.setCapacity(100);
		
	     ArrayList<Bus> a11 = new ArrayList<Bus>();
	     a11.add(b2);
	     a11.add(b3);
		
		
		
		Departement dp2 = new Departement();
		dp2.setDeptname("csbs");
		dp2.setStafno(6);
		Departement dp3 = new Departement();
		dp3.setDeptname("csd");
		dp3.setStafno(8);
		
		ArrayList<Departement> add = new ArrayList<Departement>();
		add.add(dp2);
		add.add(dp3);
		
		dp2.setCollege(cg);
		dp3.setCollege(cg);
		b2.setCollege(cg);
		b3.setCollege(cg);
		
		College cg1 = new College();
		cg1.setName("svs");
		cg1.setLocation("manglore");
		cg1.setDepartement(add);
		cg1.setBus(a11);
		
		ArrayList<College> al = new ArrayList<College>();
		al.add(cg);
		al.add(cg1);
		
		
		
		
		University uv = new University();
		uv.setName("vtu");
		uv.setLocation("belgavi");
		
		
		cg.setUni(uv);
		cg1.setUni(uv);
		uv.setCollege(al);
		
		et.begin();
		
		em.persist(uv);
		et.commit();
		
		
	}

}
