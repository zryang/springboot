package cn.yzr.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Map<String,Object> resultError(){
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("errorCode","500");
        result.put("errorMsg","system fail ...");
        return result;
    }
//
//    @ExceptionHandler(RuntimeException.class)
//    public String resultError(){
//        return "/index";
//    }
}
