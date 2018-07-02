package com.howard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.howard.common.Result;
import com.howard.remote.HelloRemote;

@RestController
public class ConsumerController {

    @Autowired
    HelloRemote HelloRemote;
	
    @RequestMapping("service/hello")
    public Result index() {
        return HelloRemote.hello();
    }

}