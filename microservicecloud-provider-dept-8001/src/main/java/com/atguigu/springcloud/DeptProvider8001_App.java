package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: yangli
 * Date: 2019-04-07
 * Time: 22:26
 */
@SpringBootApplication //启动类注解
@EnableEurekaClient
public class DeptProvider8001_App {
    public static void main(String[] args){
        SpringApplication.run(DeptProvider8001_App.class,args);
    }
}
