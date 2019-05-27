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

import com.via.sep.demo.Service.AppointmentService;
import com.via.sep.demo.model.Appointment;


@RestController
@RequestMapping("/sep3")
public class AppointmentController {

	@Autowired
	public AppointmentService appointmentService;
	
	@GetMapping("/appointment/{id}")
	public ResponseEntity<Optional<Appointment>> getAppointmentById(@PathVariable("id") Integer id){
		Optional<Appointment> appointment = appointmentService.getAppointmentBYId(id);
		return new ResponseEntity<Optional<Appointment>>(appointment, HttpStatus.OK);
	}
	
	@PostMapping("/appoinment")
	public ResponseEntity<Appointment> addAppointmentById(@RequestBody Appointment appointment){
		appointmentService.addAppointment(appointment);
		return new ResponseEntity<Appointment>(appointment, HttpStatus.OK);
	}
	@DeleteMapping
	public ResponseEntity<Void> deleteAppointmentById(@PathVariable("id") Integer id){
		appointmentService.deleteAppointmentById(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	@GetMapping("/appointments")
	public ResponseEntity<Iterable<Appointment>> getAllAppointment()  {
		
		Iterable<Appointment> list = appointmentService.getAllAppointment();
		return new ResponseEntity<Iterable<Appointment>>(list, HttpStatus.OK);
	}
}
