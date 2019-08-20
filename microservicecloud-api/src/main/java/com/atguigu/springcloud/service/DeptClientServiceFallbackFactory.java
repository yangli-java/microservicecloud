package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: yangli
 * Date: 2019-08-20
 * Time: 20:18
 */
@Component //这个注解必须添加，不能缺乏，否则不能注入该bean
//FallbackFactory<DeptClientService> 中的DeptClientService可由泛型接收，
// DeptClientService表示该类/接口绑定熔断
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public Dept get(Long id)
            {
                Dept dept = new Dept();
                dept.setDeptno(id);
                dept.setDname("该ID：" + id + "没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭");
                dept.setDb_source("no this database in MySQL");
                return dept;

            }

            @Override
            public List<Dept> list()
            {
                return null;
            }

            @Override
            public Boolean add(Dept dept)
            {
                return false;
            }
        };
    }
}
