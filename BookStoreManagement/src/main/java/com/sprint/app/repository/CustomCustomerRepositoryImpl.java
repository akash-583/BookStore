package com.sprint.app.repository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sprint.app.entity.Book;
import com.sprint.app.entity.Customer;
import com.sprint.app.entity.User;

@Repository
public class CustomCustomerRepositoryImpl implements CustomCustomerRepository{
	 @Autowired
	   EntityManager entityManager;


	@Override
	public List<Customer> getCustomerByName(String fullName) {
Session session=entityManager.unwrap(Session.class); 
		
		String queryString ="from Customer cus where cus.fullName=:fullName";
		
		Query<Customer> query=session.createQuery(queryString);
		query.setString("fullName",fullName);
	
		List<Customer> list = query.getResultList();
		return list;
	}


	@Override
	public List<Customer> getCustomerByDate(Date date) {
        Session session=entityManager.unwrap(Session.class); 
		
		String queryString ="from Customer cus where cus.registerOn=:date";
		
		Query<Customer> query=session.createQuery(queryString);
		query.setDate("registerOn",date);
		
		List<Customer> list = query.getResultList();
		return list;
	}


	@Override
	public Customer getCustomerByPhoneNumber(long number) {

       Session session=entityManager.unwrap(Session.class);
		
		String queryString ="from Customer cus where cus.mobileNumber=:number";
		
		Query<Customer> query=session.createQuery(queryString);
		query.setLong("mobileNumber",number);
		
		 Customer cus=query.getSingleResult();
		return cus;	
	}

	




}
