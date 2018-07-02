package com.howard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.cloud.netflix.zuul.filters.route.ZuulFallbackProvider;
import com.howard.common.Result;
import com.howard.common.ResultGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
@RequestMapping("/service")
public class HelloController {
	private final Logger logger = LoggerFactory.getLogger(ZuulFallbackProvider.class);
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public Result index() {
		logger.info("request retry");
	    try{
	        Thread.sleep(1000000);
	    }catch ( Exception e){
	        logger.error(" hello two error",e);
	    }
        return ResultGenerator.genSuccessResult();
    }
}