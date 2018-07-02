package com.howard.controller;

import org.springframework.stereotype.Component;

import com.howard.common.Result;
import com.howard.common.ResultGenerator;
import com.howard.remote.ArticleRemote;

@Component
public class ArticleRemoteHystrix implements ArticleRemote{

	@Override
	public Result loadAllArticles() {
		// TODO Auto-generated method stub
		return ResultGenerator.genFailResult("fail");
	}

}
