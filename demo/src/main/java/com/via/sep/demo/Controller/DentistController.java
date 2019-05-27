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

import com.via.sep.demo.Service.DentistService;
import com.via.sep.demo.model.Dentist;


@RestController
@RequestMapping("/sep3")
public class DentistController {

	@Autowired
	public DentistService dentistService;
	
	@GetMapping("/dentist/{id}")
	
	public ResponseEntity<Optional<Dentist>> getDentistById(@PathVariable("id") Integer id){
		Optional<Dentist> dentist = dentistService.getDentistById(id);
		return new ResponseEntity<Optional<Dentist>>(dentist,HttpStatus.OK);
	}
	@PostMapping("/dentist")
	public ResponseEntity<Dentist> addDentist(@RequestBody Dentist dentist){
		dentistService.addDentist(dentist);
		return new ResponseEntity<Dentist>(dentist, HttpStatus.OK);
	}
	
	@DeleteMapping("/dentist/{id}")
	public ResponseEntity<Void> deleteDentistById(@PathVariable("id") Integer id) {
		 dentistService.deleteDentistById(id);;
		return new ResponseEntity<Void>(HttpStatus.OK);
}
	@GetMapping("/dentists")
	public ResponseEntity<Iterable<Dentist>> getAllPatient()  {
		
		Iterable<Dentist> list = dentistService.getAllDentist();
		return new ResponseEntity<Iterable<Dentist>>(list, HttpStatus.OK);
	}
}
