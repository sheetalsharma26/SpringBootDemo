package com.abcairlines.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.abcairlines.model.Abcuserdetails;

public interface UserRepository extends JpaRepository<Abcuserdetails, Integer>{

	
}
