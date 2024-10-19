package com.securehaven._securehaven_producer_banks1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.securehaven._securehaven_producer_banks1.model.SBI;
import com.securehaven._securehaven_producer_banks1.servicei.SBIServicei;

@RestController
public class SBIController {
	
	@Autowired
	SBIServicei ssi;
	
	
	@PostMapping("/save_sbi_customer")
	public void save_Customer(@RequestBody SBI sbi)
	{
		ssi.saveCustomer(sbi);
	}
	
	@GetMapping("getCustomer/{pancard}")
	public ResponseEntity<SBI> forwardCustomerDetails(@PathVariable("pancard") String pancard)
	{
		SBI customer=ssi.getCustomerDetails(pancard);
		
		return new ResponseEntity<SBI> (customer, HttpStatus.OK);
	}
	
	@GetMapping(value = "/passotp")
	public ResponseEntity<Integer> passOTP()
	{
		int min = 1000;
		int max = 9999;

		int f = min + (int) (Math.random() * ((max - min) + 1));
		
		return new ResponseEntity<Integer> (f, HttpStatus.OK);
	}

}
