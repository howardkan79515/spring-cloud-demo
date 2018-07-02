package com.howard.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.howard.common.Result;
import com.howard.controller.ConsumerController;
import com.howard.controller.RemoteHystrix;

/**
 * Created by summer on 2017/5/11.
 */
@FeignClient(name= "spring-cloud-producer",fallback = RemoteHystrix.class)
public interface HelloRemote {

    @RequestMapping(value = "/service/hello")
    public Result hello();

}
