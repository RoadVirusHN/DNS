package com.roadvirushn.dns.repositories;

import org.springframework.data.repository.CrudRepository;

import com.roadvirushn.dns.entities.Article;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface ArticleRepository extends CrudRepository<Article, Integer> {

}
