package com.howard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.howard.common.Result;
import com.howard.common.ResultGenerator;

@Controller
@RequestMapping("/service")
public class HelloController {
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public Result index() {
        return ResultGenerator.genSuccessResult();
    }
}