package com.via.sep.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.via.sep.demo.model.Branch;

public interface BranchDAO extends CrudRepository<Branch,Integer> {

}
