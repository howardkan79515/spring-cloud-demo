package com.howard.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;

public class ResultGenerator {
    private static final String DEFAULT_SUCCESS_MESSAGE = "Hello world.";
    private static final String DEFAULT_FAIL_MESSAGE = "FAIL";
    

    public static Result genSuccessResult() {
        Result result = new Result();
        result.setResultCode(Constant.RESULT_CODE_SUCCESS);
        result.setResp(DEFAULT_SUCCESS_MESSAGE);
        return result;
    }

    public static Result genFailResult(String message) {
        Result result = new Result();
        result.setResultCode(Constant.RESULT_CODE_SERVER_ERROR);
        if (message == null || message.length() < 1) {
            message = DEFAULT_FAIL_MESSAGE;
        }
        result.setResp(message);
        return result;
    }
    
    public static Result genSuccessResult(Object data) {
        Result result = new Result();
        result.setResultCode(Constant.RESULT_CODE_SUCCESS);
        result.setResp(DEFAULT_SUCCESS_MESSAGE);
        result.setData(data);
        return result;
    }

}
