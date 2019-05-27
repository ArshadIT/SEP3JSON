package com.via.sep.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.via.sep.demo.dao.PatientDAO;
import com.via.sep.demo.model.Patient;

@Service
public class PatientService {
	@Autowired
	public PatientDAO dao;

	public Optional<Patient> getDentistById(int id) {
		return dao.findById(id);
	}

	public Patient addPatient(Patient patient) {
		return dao.save(patient);
	}

	public void deletePatientById(int id) {
		dao.deleteById(id);
	}

	public Iterable<Patient> getAllPatient() {
		return dao.findAll();
	}

	public void deletePatient(Patient patient) {
		dao.delete(patient);
	}
}
