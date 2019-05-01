package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Dept;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: yangli
 * Date: 2019-04-07
 * Time: 22:04
 */
public interface DeptService {
    public Boolean add(Dept dept);
    public Dept get(Long id);
    public List<Dept> list();
}
