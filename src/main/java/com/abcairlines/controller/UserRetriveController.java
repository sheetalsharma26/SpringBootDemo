package com.abcairlines.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.abcairlines.model.Abcuserdetails;
import com.abcairlines.model.UserRegistration;
import com.abcairlines.repository.UserRepository;

@RestController
@RequestMapping(value="/user")
public class UserRetriveController {

	
	@Autowired
	UserRepository userRepository;
	
//	@GetMapping(value="/all")
//	public List<Abcuserdetails> getAll(){
//		return userRepository.findAll();
//	}
//	
////	@GetMapping(value="/findByfname")
////	public List<Abcuserdetails> getByFname(Integer id){
////	
////		return userRepository.findById(id)
////	}
//	
//	@PostMapping(value="/load")
//	public List<Abcuserdetails> persist(Abcuserdetails user){
//		userRepository.save(user);
//		return userRepository.findAll();
//	}
	
	
	
	
}
