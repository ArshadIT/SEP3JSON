package com.via.sep.demo.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.via.sep.demo.Service.BranchService;
import com.via.sep.demo.model.Branch;


@RestController
@RequestMapping("/sep3")
public class BranchController {
	@Autowired
	BranchService branchService;
	
@GetMapping("/branch/{id}")
	
	public ResponseEntity<Optional<Branch>> getBranchById(@PathVariable("id") Integer id){
		Optional<Branch> branch = branchService.getBranchById(id);
		return new ResponseEntity<Optional<Branch>>(branch,HttpStatus.OK);
	}
	@PostMapping("/branch")
	public ResponseEntity<Branch> addBranch(@RequestBody Branch branch){
		branchService.addBranch(branch);
		return new ResponseEntity<Branch>(branch, HttpStatus.OK);
	}
	
	@DeleteMapping("/branch/{id}")
	public ResponseEntity<Void> deleteBranchById(@PathVariable("id") Integer id) {
		branchService.deleteBranchById(id);;
		return new ResponseEntity<Void>(HttpStatus.OK);
}
	@GetMapping("/branches")
	public ResponseEntity<Iterable<Branch>> getAllBranch()  {
		
		Iterable<Branch> list = branchService.getAllBranch();
		return new ResponseEntity<Iterable<Branch>>(list, HttpStatus.OK);
	}

}
