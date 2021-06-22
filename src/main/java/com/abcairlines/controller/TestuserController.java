package com.abcairlines.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abcairlines.model.Abcuserdetails;
import com.abcairlines.model.Testuser;
import com.abcairlines.repository.TestuserRepository;

@RestController
@RequestMapping(value = "/testuser")
public class TestuserController {

	@Autowired
	TestuserRepository testuserRepo;

	@GetMapping(value = "/all")
	public List<Testuser> getTestuser() {

		return testuserRepo.findAll();
	}

	@PostMapping(value="/addUser")
	public List<Testuser> addnewuser(@RequestBody Testuser t){
		testuserRepo.save(t);
		return testuserRepo.findAll();
	}
	
	
}
