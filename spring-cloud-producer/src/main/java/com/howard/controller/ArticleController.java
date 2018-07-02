package com.howard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.howard.common.Result;
import com.howard.common.ResultGenerator;
import com.howard.model.Article;
import com.howard.service.ArticleService;

@Controller
@RequestMapping("/service/article")
public class ArticleController {
	
	@Autowired
	ArticleService articleService;
	
	@RequestMapping(value = "", method = RequestMethod.POST)
    @ResponseBody
    public Result create(@RequestBody Article article) {
		articleService.createArticle(article);
        return ResultGenerator.genSuccessResult();
    }
		
	@RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseBody
    public Result loadAllArticles() {
		List<Article> articles = articleService.findAllArticle();
		Result result = ResultGenerator.genSuccessResult();
		result.setData(articles);
		return result;
    }
	

}
