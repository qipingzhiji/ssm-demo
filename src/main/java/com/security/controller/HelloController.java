package com.security.controller;

import com.security.dao.emp.DepartmentsMapper;
import com.security.entity.emp.DepartmentsExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhang_htao on 2019/9/1.
 */

@RestController
public class HelloController {

    @Autowired
    private DepartmentsMapper deptDao;
    @GetMapping("depts")
    public Object depts(){
        return deptDao.selectByExample(new DepartmentsExample());
    }
}
