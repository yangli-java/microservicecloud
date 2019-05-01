package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: yangli
 * Date: 2019-04-07
 * Time: 18:13
 */
@Mapper
public interface DeptDao {
    public Boolean addDept(Dept dept);
    public Dept findById(Long id);
    public List<Dept> findAll();
}
