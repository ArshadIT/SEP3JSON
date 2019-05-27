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

import com.via.sep.demo.Service.PatientService;
import com.via.sep.demo.model.Patient;

@RestController
@RequestMapping("/sep3")
public class PatientController {
	@Autowired
	PatientService service;
	
	@GetMapping("/patient/{id}")
	public ResponseEntity<Optional<Patient>> getPatientById(@PathVariable("id") Integer id) {
		Optional<Patient> patient = service.getDentistById(id);
		return new ResponseEntity<Optional<Patient>>(patient,HttpStatus.OK);
	}
	@PostMapping("/patient")
	public ResponseEntity<Patient> addPatientById(@RequestBody Patient patient) {
		 service.addPatient(patient);
		return new ResponseEntity<Patient>(patient,HttpStatus.OK);
	}
	@DeleteMapping("/patient/{id}")
	public ResponseEntity<Void> deletePatientById(@PathVariable("id") Integer id) {
		 service.deletePatientById(id);;
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

//	@GetMapping("/patient/{patientList}")
//	public ResponseEntity<List<Patient>> getAllPatientById(@PathVariable("patientList") ){
	
	@GetMapping("/patients")
	public ResponseEntity<Iterable<Patient>> getAllPatient()  {
		
		Iterable<Patient> list = service.getAllPatient();
		return new ResponseEntity<Iterable<Patient>>(list, HttpStatus.OK);
	}
}