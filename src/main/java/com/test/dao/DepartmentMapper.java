package com.test.dao;

import com.test.model.Department;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DepartmentMapper {

    Integer insert(Department entity);

    Department getById(Integer id);

    Integer update(Department entity) ;

    Integer deleteById(Integer id) ;

}
