package com.atguigu.springcloud.service.Impl;

import com.atguigu.springcloud.dao.DeptDao;
import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: yangli
 * Date: 2019-04-07
 * Time: 22:05
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao deptDao;

    @Override
    public Boolean add(Dept dept) {
        Boolean aBoolean = deptDao.addDept(dept);
        return aBoolean;
    }

    @Override
    public Dept get(Long id) {
        Dept dept = deptDao.findById(id);
        return dept;
    }

    @Override
    public List<Dept> list() {
        List<Dept> deptList = deptDao.findAll();
        return deptList;
    }
}
