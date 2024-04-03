package com.vivek.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vivek.dao.CertificationsDAOImpl;
import com.vivek.entities.Certifications;

@Service
public class CertificationsServiceImpl implements CertificationsService{

	@Autowired
	private CertificationsDAOImpl certificationsDAO;
	@Override
	public List<Certifications> getAllCertifications() {
		return certificationsDAO.getAllCertifications();
	}

	@Override
	public void addCertification(Certifications certification) {
		certificationsDAO.addCertification(certification);
	}

	@Override
	public void updateCertification(Certifications certification) {
		certificationsDAO.updateCertification(certification);		
	}

	@Override
	public void deleteCertifications(Certifications Certification) {
		certificationsDAO.deleteCertifications(Certification);		
	}

	@Override
	public Certifications getCertificationsById(int certificationId) {
		return certificationsDAO.getCertificationsById(certificationId);
	}

}
