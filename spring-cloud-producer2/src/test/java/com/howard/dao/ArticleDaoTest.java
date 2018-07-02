package com.howard.dao;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.howard.model.Article;
import com.howard.util.DateUtil;

import org.junit.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ArticleDaoTest {
	
	@Autowired
    private ArticleDao articleDao;
	
	@Test
	public void insertArticleTest() throws Exception {
		Article article = new Article();		
		article.setAddName("howard631");
		article.setArticleContent("I am so happy22");
		article.setArticleCreateDate(DateUtil.getCurrentDateStr());
		System.out.println("date:"+DateUtil.getCurrentDateStr());
		article.setArticleTitle("My diary");
		articleDao.save(article);
		Assert.assertTrue(article.getId()!=0);
        System.out.println("articleId:"+article.getId());
	}
	
	@Test
	public void updateArticleTest() throws Exception {
		
		Article article = articleDao.findOne(1063);
		article.setArticleContent("I'm so miss you!");
		articleDao.save(article);
		Assert.assertTrue(article.getId()!=0);
        System.out.println("articleId:"+article.getId());
	}

}
