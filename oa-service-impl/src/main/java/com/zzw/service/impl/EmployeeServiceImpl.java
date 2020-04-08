package com.zzw.service.impl;

import com.zzw.mapper.EmployeeMapper;
import com.zzw.pojo.Employee;
import com.zzw.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> getEmp() {
        return employeeMapper.selectAll();
    }

}
