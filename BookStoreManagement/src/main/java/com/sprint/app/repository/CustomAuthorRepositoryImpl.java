package com.sprint.app.repository;
import java.util.List;
import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.sprint.app.entity.Author;
public class CustomAuthorRepositoryImpl implements CustomAuthorRepository {
	@Autowired
	EntityManager entityManager;

	public List<Author> getAuthorByName(String authorName) {
		// TODO Auto-generated method stub
		Session session=entityManager.unwrap(Session.class);
		String str="from Author a where a.course=:qstatus";
		Query<Author> query=session.createQuery(str);
		query.setString("qstatus",authorName);
		List<Author> list=(List<Author>)query.getResultList();
		if(list!=null)
			return list;
		else 
			throw  new javax.persistence.NoResultException("author name records in the db");
		
	}

}
//package com.stud.app.repository;

//import java.util.List;

//import javax.persistence.EntityManager;

/*import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import com.stud.app.entity.Student;

public class CustomStudentRepositoryImpl implements CustomStudentRepository {
	@Autowired
	EntityManager entityManager;
	
	@Override
	public List<Student> getStudentsByCourse(String courseName) {
		// TODO Auto-generated method stub
		Session session=entityManager.unwrap(Session.class);
		String str="from Student s where s.course=:qstatus";
		Query<Student> query=session.createQuery(str);
		query.setString("qstatus",courseName);
		List<Student> list=(List<Student>)query.getResultList();
		if(list!=null)
			return list;
		else 
			throw  new javax.persistence.NoResultException("course name records in the db");
		
	}

}*/