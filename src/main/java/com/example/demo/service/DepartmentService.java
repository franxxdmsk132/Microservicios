package com.example.demo.service;

import com.example.demo.entity.Department;
import com.example.demo.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    private final DepartmentRepository departmentRepository;


    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public Department createDepartment(Department department) {
        return departmentRepository.save(department);

    }

    public Department getDepartment(Integer id) {
        return departmentRepository.findById(id).get();
    }

    public List<Department> findAll() {
        return departmentRepository.findAll();
    }

    public void deleteDepartment(Integer id) {
        departmentRepository.deleteById(id);
    }
}
                                                                     