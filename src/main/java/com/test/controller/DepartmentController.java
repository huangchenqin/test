package com.test.controller;

import com.test.dao.DepartmentMapper;
import com.test.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/dep")
public class DepartmentController {
    @Autowired()
    @Qualifier("departmentMapper")
    private DepartmentMapper departmentMapper;

    @PostMapping("/add")
    public  Integer addDepartment(@RequestBody Department dep) {

        if (null == dep || StringUtils.isEmpty(dep.getName())) {
            return 0;
        }

        return this.departmentMapper.insert(dep);
    }

    @GetMapping("/get/{id}")
    public Department getDepartment(@PathVariable("id") Integer id) {
        if (null == id) {
            return null;
        }

        Department dep = this.departmentMapper.getById(id);
        return dep;
    }

    @PostMapping("/update")
    public Integer updateDepartment(@RequestBody Department dep){
        if (null == dep || null == dep.getId()) {
            return 0;
        }

        return this.departmentMapper.update(dep);
    }

    @DeleteMapping("/del/{id}")
    public Integer delDepartment(@PathVariable("id") Integer id) {
        if (null == id) {
            return null;
        }

        return this.departmentMapper.deleteById(id);
    }
}


