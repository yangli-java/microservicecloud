package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: yangli
 * Date: 2019-04-07
 * Time: 17:03
 */
@AllArgsConstructor//全参构造器
@NoArgsConstructor//空参构造器
@Accessors(chain = true) //链式结构
@Data//setter与getter方法
public class Dept implements Serializable{//必须序列化
    private Long deptno;//主键
    private String dname;//部门名称
    //来自哪个数据库，因为微服务架构可以一个微服务对应一个数据库，同一个信息被存储到不同的数据库。
    private String db_source;
}
