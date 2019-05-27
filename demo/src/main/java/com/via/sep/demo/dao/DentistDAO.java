package com.via.sep.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.via.sep.demo.model.Dentist;

public interface DentistDAO extends CrudRepository<Dentist, Integer> {

}
