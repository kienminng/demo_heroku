package com.example.demo.repository;

import com.example.demo.model.Branch;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IBranchRepo extends PagingAndSortingRepository<Branch,Long> {
}
