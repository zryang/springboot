package cn.yzr.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
public class HelloApplication {
    @RequestMapping("/index")
    public String index(){
        return "success";
    }

    @RequestMapping("/getMap")
    public Map<String,Object> getMap(){
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("errorCode","500");
        result.put("errorMsg","fail ...");
        return result;
    }

}
