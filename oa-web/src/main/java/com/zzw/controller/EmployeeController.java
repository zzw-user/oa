package com.zzw.controller;

import com.zzw.pojo.Employee;
import com.zzw.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("main")
    public List<Employee> getEmp(){
        return employeeService.getEmp();
    }
}
