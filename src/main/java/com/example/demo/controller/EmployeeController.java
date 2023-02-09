package com.example.demo.controller;


import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAll() {
        return employeeService.getAll();
    }

    @PostMapping
    public Employee create(@RequestBody Employee employee){

        return  employeeService.save(employee);
    }

    @GetMapping("/{id}")
    public Employee showEdit(@PathVariable long id){

        return employeeService.findById(id);
    }

    @PutMapping("/{id}")
    public  Employee edit(@RequestBody Employee employee){

        return employeeService.save(employee);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){

        employeeService.delete(id);
    }


}
