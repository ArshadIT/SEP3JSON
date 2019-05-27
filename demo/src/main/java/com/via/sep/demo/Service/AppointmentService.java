package com.via.sep.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.via.sep.demo.dao.AppointmentDAO;
import com.via.sep.demo.model.Appointment;

@Service
public class AppointmentService {

	@Autowired
	public AppointmentDAO appointmentDAO;
	
	public Optional<Appointment> getAppointmentBYId(int id){
		
		return appointmentDAO.findById(id);
	}
	
	public Appointment addAppointment(Appointment appointment) {
		return appointmentDAO.save(appointment);
	}
	public void deleteAppointmentById(int id) {
		 
		appointmentDAO.deleteById(id);
	}
	public Iterable<Appointment> getAllAppointment(){
		return appointmentDAO.findAll();
	}
}
