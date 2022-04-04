package com.tns.placementManagementSystem.clients;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.tns.placementManagementSystem.entities.Certificate;
import com.tns.placementManagementSystem.entities.College;
import com.tns.placementManagementSystem.entities.Placement;
import com.tns.placementManagementSystem.entities.Student;
import com.tns.placementManagementSystem.service.*;

public class ManyToOneAppTest {
	

	public static void main(String[] args) {
		
		
		// Defining factory manager
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		
		
		em.getTransaction().begin();

//      Defining student class object 
		Student student1 = new Student();
		Student student2 = new Student();
		Certificate cret1 = new Certificate();
		Certificate cret2 = new Certificate();
		College col1 = new College();
		Placement place1 = new Placement();
		StudentServiceImp obj1 = new StudentServiceImp();
		CollegeServiceImp obj2 = new CollegeServiceImp();
		PlacementServiceImp obj3 = new PlacementServiceImp();
	

		student1.setId(4);
		student1.setName("Arjun");
		student1.setCollegeName("IIT Bombay");
		student1.setCourse("CS");
		student1.setHallTicketNo(3332);
		student1.setQualification("B.Tech");
		student1.setRoll(4);
		
		cret1.setC_id(4);
		cret1.setCollegeName(student1.getCollegeName());
		cret1.setYear(2021L);
		student1.setCertificate(cret1);
		
		student2.setId(5);
		student2.setName("Suraj Vishuakarma");
		student2.setCollegeName("IIT Bombay");
		student2.setCourse("EXTC");
		student2.setHallTicketNo(66455);
		student2.setQualification("B.E");
		student2.setRoll(5);
		
		cret2.setC_id(5);
		cret2.setCollegeName(student2.getCollegeName());
		cret2.setYear(2021L);
		student2.setCertificate(cret2);
		
		col1.setC_id(4);
		col1.setCollegeAdmin("Y.K");
		col1.setCollegeName("IIT Bombay");
		col1.setLocation("Mumbai");
		
		student1.setCollege_id(col1);
		student2.setCollege_id(col1);
		
		place1.setCollege_id(col1);
		place1.setCollegeName("IIT Bombay");
		place1.setP_id(3L);
		place1.setpDate("3rd Feb 2022");
		place1.setpName("TATA");
		place1.setQualification("B.Tech");
		place1.setYear(2022L);
		
		
		List<Student> objList = List.of(student1, student2);
		col1.setStudent(objList);
		
		
		em.persist(student1);
		em.persist(student2);
		em.persist(place1);
		
		em.getTransaction().commit();		
		System.out.println("student data added to database.");
		em.close();
		factory.close();
		
	}

}
