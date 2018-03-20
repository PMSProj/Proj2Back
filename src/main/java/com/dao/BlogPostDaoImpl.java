package com.dao;



import javax.transaction.Transactional;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.BlogPost;


@Repository
@Transactional
public class BlogPostDaoImpl  implements BlogPostDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	 public BlogPostDaoImpl() {
		System.out.println("BlogPostDaoImpl Created");
	}

	public void  addBlogPost(BlogPost blogPost )
	 {
		 Session session=sessionFactory.getCurrentSession();
		 session.save(blogPost); //insert into blogPost_Details values(?...
	 }
	
}
