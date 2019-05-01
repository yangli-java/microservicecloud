package com.atguigu.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
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


    /**
     * springcloud的Riboon已经配置了七种负载均衡的算法，它们之间可以相互切换。
     * 这七种负载均衡算法都是 IRule 接口的实现类
     * @return
     */
    @Bean
    public IRule getIRule() {
        return  new RoundRobinRule();//简单轮询负载均衡，若没有配置该Bean，则Ribbon默认采取该种方式的负载均衡
//        return new RandomRule();//随机负载均衡
//        return new RetryRule();//重试轮询负载均衡
    }
}
