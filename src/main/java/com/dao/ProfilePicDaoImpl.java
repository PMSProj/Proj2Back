package com.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.ProfilePic;
@Repository
@Transactional
public class ProfilePicDaoImpl implements ProfilePicDao {
	@Autowired
	private SessionFactory sessionFactory;
	public void uploadProfilePic(ProfilePic profilePic){
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(profilePic);
	}
	public ProfilePic getImage(String email) {
		Session session=sessionFactory.getCurrentSession();
		ProfilePic profilePic=(ProfilePic) session.get(ProfilePic.class,email);
		return profilePic;
	}

}
