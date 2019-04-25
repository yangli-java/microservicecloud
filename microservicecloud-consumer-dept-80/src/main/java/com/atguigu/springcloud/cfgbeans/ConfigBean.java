package com.atguigu.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: yangli
 * Date: 2019-04-08
 * Time: 21:34
 */
@Configuration
public class ConfigBean {
    @Bean
    @LoadBalanced   //开启自动负载均衡，即可以通过微服务名称进行调用微服务，不需要使用ip+端口号进行调用了。
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
