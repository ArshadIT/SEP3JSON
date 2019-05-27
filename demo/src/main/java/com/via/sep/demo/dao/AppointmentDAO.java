package com.via.sep.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.via.sep.demo.model.Appointment;

public interface AppointmentDAO extends CrudRepository<Appointment, Integer> {

	
}
