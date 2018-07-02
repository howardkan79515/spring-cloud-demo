package com.howard.controller;

import org.springframework.stereotype.Component;

import com.howard.common.Result;
import com.howard.common.ResultGenerator;
import com.howard.remote.HelloRemote;

@Component
public class RemoteHystrix implements HelloRemote{

	@Override
	public Result hello() {
		// TODO Auto-generated method stub
		return ResultGenerator.genFailResult("fail");
	}

}
