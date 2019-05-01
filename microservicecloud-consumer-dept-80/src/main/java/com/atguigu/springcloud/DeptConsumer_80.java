package com.atguigu.springcloud;

import com.atguigu.mySeltRibbonRule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: yangli
 * Date: 2019-04-08
 * Time: 22:18
 */
@SpringBootApplication
@EnableEurekaClient
//在消费端(客户端)的启动类上添加@RibbonClient注解，即可在启动的时候去加载自定义的Ribbon配置类，从而使配置生效
//name--表示针对于某一个微服务，填的是微服务的名称
//configuration--表示的自定义的配置文件
@RibbonClient(name = "microservicecloud-dept",configuration = MySelfRule.class)
public class DeptConsumer_80 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_80.class,args);
    }
}
