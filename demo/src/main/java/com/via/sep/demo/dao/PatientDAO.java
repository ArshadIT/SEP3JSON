package com.via.sep.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.via.sep.demo.model.Patient;

public interface PatientDAO extends CrudRepository<Patient,Integer> {

}
