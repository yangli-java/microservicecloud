package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @Author: yangli@elane.cn
 * @Despriction:
 * @Package: com.atguigu.springcloud.service
 * @Date:Created in 2019/4/29 16:41
 * @Modify By:
 */
//@FeignClient(value = "microservicecloud-dept")
@FeignClient(value = "microservicecloud-dept",fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {

    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
    public Boolean add(@RequestBody Dept dept);

    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id);

    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
    public List<Dept> list();

}
