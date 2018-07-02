package com.howard.common;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j  
@Data 
public class Result<T> {
    private int resultCode;
    private String resp;   
    private T data;
    public Result(){
    	
    }
}
