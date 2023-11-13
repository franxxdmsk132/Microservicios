package com.example.demo.controller;


import com.example.demo.entity.Department;
import com.example.demo.service.DepartmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {
    private final DepartmentService departmentService;


    public DepartmentController(DepartmentService departmentService) {

        this.departmentService = departmentService;
    }

    @PostMapping("/save")
    public Department createDepartment(@RequestBody Department department) {
        return departmentService.createDepartment(department);
    }

    @GetMapping("/{id}")
    public Department getById(@PathVariable Integer id) {

        return departmentService.getDepartment(id);
    }

    @GetMapping("/lists")
    public List<Department> findAll() {
        return departmentService.findAll();
    }

    @DeleteMapping("/del/{id}")
    public void delete(@PathVariable Integer id) {
        departmentService.deleteDepartment(id);
    }

}
