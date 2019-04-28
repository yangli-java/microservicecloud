package com.atguigu.mySeltRibbonRule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: yangli@elane.cn
 * @Despriction: 自定义Ribbon负载均衡配置类
 * @Package: com.atguigu.mySeltRibbonRule
 * @Date:Created in 2019/4/28 15:38
 * @Modify By:
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule getIRule() {
//        return  new RoundRobinRule();//简单轮询负载均衡，若没有配置该Bean，则Ribbon默认采取该种方式的负载均衡
        return new RandomRule();//随机负载均衡
//        return new RetryRule();//重试轮询负载均衡
    }

}
