package com.sprint.app.repository;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.sprint.app.entity.Author;
@Repository
public class CustomAuthorRepository {
	public List<Author> getAuthorByName(String authorName) {
		return null;
	}

}


//package com.stud.app.repository;

//import java.util.List;

//import org.springframework.stereotype.Repository;

//import com.stud.app.entity.Student;

//@Repository
//public interface CustomStudentRepository {
//	public List<Student> getStudentsByCourse(String courseName);
//}