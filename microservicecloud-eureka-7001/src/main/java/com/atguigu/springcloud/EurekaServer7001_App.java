package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: yangli
 * Date: 2019-04-10
 * Time: 21:28
 */
@SpringBootApplication
@EnableEurekaServer //表示Eureka服务端启动类，接受其他微服务注册进来
public class EurekaServer7001_App {
    public static void main(String[] args){
        SpringApplication.run(EurekaServer7001_App.class,args);
    }
}
