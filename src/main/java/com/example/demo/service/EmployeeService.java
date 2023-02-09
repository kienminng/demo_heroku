package com.example.demo.service;


import com.example.demo.model.Employee;
import com.example.demo.repository.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeService {
    @Autowired
    IEmployeeRepo iEmployeeRepo;

    public List<Employee> getAll() {
        return (List<Employee>) iEmployeeRepo.findAll();
    }

    public Employee save(Employee employee) {
        return iEmployeeRepo.save(employee);
    }

    public Employee findById(long id) {
        return iEmployeeRepo.findById(id).get();
    }

    public Employee delete(long id) {
        Employee employee = findById(id);
        iEmployeeRepo.deleteById(id);
        return employee;

    }
}
