package com.vivek.dao;

import java.util.List;

import com.vivek.entities.Certifications;

public interface CertificationsDAO {

	List<Certifications> getAllCertifications();

	void addCertification(Certifications Certification);

	void updateCertification(Certifications Certification);

	void deleteCertifications(int CertificationId);

	Certifications getCertificationsById(int CertificationId);
}
