package com.tns.placementManagementSystem.repository;

// Importing required entity class and interfaces 
import javax.persistence.EntityManager;
import com.tns.placementManagementSystem.entities.Certificate;


public class CertificateRepositoryImp implements ICertificateRepository {
	
	// Declaring instance variable
	private EntityManager entityManager;
	
	// Initializing entity Manager from JPAUtil static method 
	CertificateRepositoryImp()
	{
		entityManager  = JPAUtil.getEntityManager();
	}
	
    // Implementing the abstract methods from interface.
	
	// Create operation
	@Override
	public void addCertificate(Certificate certificate) {
		// persist method will add data from required schema
		entityManager.persist(certificate);
		
	}

	// Update operation
	@Override
	public void updateCertificate(Certificate certificate) {
		// merge method will update data from required schema
		entityManager.merge(certificate);
	}

	// Read operation
	@Override
	public Certificate searchCertificate(long id) {
		Certificate cret = entityManager.find(Certificate.class, id);
		return cret;
	}

	// delete operation 
	@Override
	public void deleteCertificate(long id) {
		Certificate cret = entityManager.find(Certificate.class, id);
		// remove method will  data from required schema
		entityManager.remove(cret);
		
	}
	
	// Methods to commit the data 
	
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}
	
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}

}
