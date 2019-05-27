package com.via.sep.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.via.sep.demo.dao.DentistDAO;
import com.via.sep.demo.model.Dentist;

@Service
public class DentistService {
	
	@Autowired
	public DentistDAO dentistdao;
	
	public Optional<Dentist> getDentistById(int id){
		return dentistdao.findById(id);
	}
	
	public Dentist addDentist(Dentist dentist) {
		return dentistdao.save(dentist);
	}
	public Iterable<Dentist> getAllDentist(){
		return dentistdao.findAll();
	}
	
	public void deleteDentistById(int id) {
		dentistdao.deleteById(id);
	}
	
	public void deleteDentist(Dentist dentist) {
		dentistdao.delete(dentist);
	}
	
}
