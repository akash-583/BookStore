package com.sprint.app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import com.sprint.app.entity.Author;

public class IAuthorRepository {
	public interface IAuthorRepository extends CurdRepository<Author,String>,CustomAuthorRepository{
		List<Author>getAuthorByName(String authorName);
	}
}
