package com.abcairlines.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abcairlines.model.Abcflightdetails;
import com.abcairlines.model.Abcuserdetails;
import com.abcairlines.repository.FlightRepository;
import com.abcairlines.repository.UserRepository;

@RestController
@RequestMapping(value="/flights")
public class FlightRetreiveController {
	
	@Autowired
	FlightRepository abcFlightRepo;
	
	@GetMapping(value="/all")
	public List<Abcflightdetails> getAll(){
		return abcFlightRepo.findAll();
	}
	

	@PostMapping(value="/load")
	public List<Abcflightdetails> addFlight(@RequestBody Abcflightdetails user){
		abcFlightRepo.save(user);
		return abcFlightRepo.findAll();
	}


}
