package com.abcairlines.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abcairlines.model.Abcflightdetails;

public interface FlightRepository extends JpaRepository<Abcflightdetails, Integer> {

}
