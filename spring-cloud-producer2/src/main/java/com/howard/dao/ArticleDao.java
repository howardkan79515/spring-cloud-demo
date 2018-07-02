package com.howard.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.howard.model.Article;

public interface ArticleDao extends JpaRepository<Article, Integer>{
	
}
