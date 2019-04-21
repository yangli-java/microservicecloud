package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
}
