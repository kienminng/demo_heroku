package com.example.demo.controller;

import com.example.demo.model.Branch;
import com.example.demo.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/branch")
public class BranchController {
    @Autowired
    BranchService branchService;

    @GetMapping
    public List<Branch> getAll() {
        return branchService.getAll();
    }
}
