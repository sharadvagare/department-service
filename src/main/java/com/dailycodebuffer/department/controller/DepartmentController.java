package com.dailycodebuffer.department.controller;

import com.dailycodebuffer.department.entity.Department;
import com.dailycodebuffer.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sun.util.logging.resources.logging;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        System.out.println("DepartmentController saveDepartment method");
        return  departmentService.saveDepartment(department);
    }

    @GetMapping("/{departmentId}")
    public Department findDepartmentById(@PathVariable("departmentId") Long departmentId){
        System.out.println("DepartmentController findDepartmentById method");
        return  departmentService.findDepartmentById(departmentId);
    }
}
