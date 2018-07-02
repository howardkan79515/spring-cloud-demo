package com.howard.service;

import java.util.List;

import com.howard.model.Article;

public interface ArticleService {
		
	public List<Article> findAllArticle();	
	
	public void createArticle(Article article);
	
}
