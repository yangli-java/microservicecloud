package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.Dept;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author: yangli@elane.cn
 * @Despriction:
 * @Package: com.atguigu.springcloud.controller
 * @Date:Created in 2019/4/30 14:18
 * @Modify By:
 */
public class BaseController {

    public Dept errorMsg(@PathVariable("id") Long id, Throwable e) {
        Dept dept = new Dept();
        dept.setDeptno(id);
        dept.setDname("抱歉，该id:"+id+"没有对应的人员！");
        dept.setDb_source(e.toString());
        return dept;
    }

}
