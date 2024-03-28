package com.vivek.service;

import java.util.List;

import com.vivek.entities.Certifications;

public interface CertificationsService {

	List<Certifications> getAllCertifications();

	void addCertification(Certifications Certification);

	void updateCertification(Certifications Certification);

	void deleteCertifications(int CertificationId);

	Certifications getCertificationsById(int CertificationId);
}
