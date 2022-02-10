package com.sprint.app.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sprint.app.entity.Book;


@Repository
public interface IBookServiceRepo extends CrudRepository<Book, Integer>{

	

}
