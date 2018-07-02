package com.howard.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.howard.common.Result;
import com.howard.controller.ArticleRemoteHystrix;
import com.howard.controller.RemoteHystrix;


@FeignClient(name= "spring-cloud-producer",fallback = ArticleRemoteHystrix.class)
public interface ArticleRemote {
	
	 @RequestMapping(value = "/service/article",method = RequestMethod.GET)
	 public Result loadAllArticles();

}
