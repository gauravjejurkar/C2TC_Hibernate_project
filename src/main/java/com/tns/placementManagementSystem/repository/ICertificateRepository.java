package com.tns.placementManagementSystem.repository;

import com.tns.placementManagementSystem.entities.Certificate;

public interface ICertificateRepository {
	
public void addCertificate(Certificate certificate);

public void updateCertificate(Certificate certificate);

public Certificate searchCertificate(long id);
      
public void deleteCertificate(long id);

}
