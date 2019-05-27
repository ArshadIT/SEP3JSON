package com.via.sep.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.via.sep.demo.dao.BranchDAO;
import com.via.sep.demo.model.Branch;

@Service
public class BranchService {
	@Autowired
	public BranchDAO branchdao;
	
	public Optional<Branch> getBranchById(int id){
		return branchdao.findById(id);
	}
	
	public Branch addBranch(Branch branch) {
		return branchdao.save(branch);
	}
	public Iterable<Branch> getAllBranch(){
		return branchdao.findAll();
	}
	
	public void deleteBranchById(int id) {
		branchdao.deleteById(id);
	}
	
	public void deleteBranch(Branch branch) {
		branchdao.delete(branch);
	}

}
