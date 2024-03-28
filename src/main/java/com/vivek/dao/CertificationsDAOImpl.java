package com.vivek.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vivek.entities.Certifications;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CertificationsDAOImpl implements CertificationsDAO{

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Certifications> getAllCertifications() {
		return entityManager.unwrap(Session.class).createQuery("from Certifications",Certifications.class).getResultList();
	}

	@Override
	public void addCertification(Certifications certification) {
		entityManager.unwrap(Session.class).persist(certification);
		
	}

	@Override
	public void updateCertification(Certifications certification) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCertifications(int certificationId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Certifications getCertificationsById(int certificationId) {
		// TODO Auto-generated method stub
		return null;
	}

}
