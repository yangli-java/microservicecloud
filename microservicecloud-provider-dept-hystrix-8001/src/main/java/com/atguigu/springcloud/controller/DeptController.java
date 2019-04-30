package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: yangli
 * Date: 2019-04-07
 * Time: 22:11
 */
@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
    public Boolean add(@RequestBody Dept dept) {
        Boolean aBoolean = deptService.add(dept);
        return aBoolean;
    }
    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id) {
        Dept dept = deptService.get(id);
        return dept;
    }
    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
    public List<Dept> list() {
        List<Dept> deptList = deptService.list();
        return deptList;
    }

    @RequestMapping(value = "/dept/discovery",method = RequestMethod.GET)
    public Object getDiscovery() {//http://192.168.1.106:8001/dept/discovery
        List<String> services = discoveryClient.getServices();
        System.out.println("发现并获取到的微服务有："+services);
        //参数是具体的某一个微服务的名字==>discoveryClient.getInstances("MICROSERVICECLOUD-DEPT");
        //获取某一个微服务的详情
        List<ServiceInstance> instances = discoveryClient.getInstances("MICROSERVICECLOUD-DEPT");
        for (ServiceInstance instance:instances) {
            System.out.println(instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri());
        }
        return this.discoveryClient;
    }
}
