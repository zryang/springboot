package cn.yzr.app;

import cn.yzr.controller.HelloApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan("cn.yzr.controller")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
