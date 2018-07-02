package com.howard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.howard.dao.ArticleDao;
import com.howard.model.Article;

@Component
public class ArticleServiceImpl implements ArticleService{
	
	@Autowired
    private ArticleDao articleDao;

	@Override
	public List<Article> findAllArticle() {
        List<Article> articles = articleDao.findAll();
		return articles;
	}

	@Override
	public void createArticle(Article article) {
		// TODO Auto-generated method stub
		articleDao.save(article);
	}

}
