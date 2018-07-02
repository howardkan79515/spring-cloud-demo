package com.howard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.howard.common.Result;
import com.howard.remote.ArticleRemote;

@RestController
public class CosumerArticleController {
	
	@Autowired
	ArticleRemote articleRemote;
	
	@RequestMapping(value = "/service/article",method = RequestMethod.GET)
    public Result loadAllArticles() {
        return articleRemote.loadAllArticles();
    }

}
