package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: yangli
 * Date: 2019-04-08
 * Time: 21:41
 */
@RestController
@RequestMapping("/consumer")
public class DeptController_Consumer {
    @Value("${providerUrl}")
    private String providerUrl;
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/dept/add")
    public Boolean add(Dept dept) {
        return restTemplate.postForObject(providerUrl+"/dept/add",dept,Boolean.class);
    }
    @RequestMapping("/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        String restUrl = providerUrl + "/dept/get/" + id;
        Dept object = restTemplate.getForObject(restUrl, Dept.class);
        return object;
    }
    @RequestMapping("/dept/list")
    public List<Dept> list(){
        return restTemplate.getForObject(providerUrl+"/dept/list",List.class);
    }
}
