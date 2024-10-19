package com.securehaven._securehaven_producer_banks1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.securehaven._securehaven_producer_banks1.model.ICICI;
import com.securehaven._securehaven_producer_banks1.servicei.ICICIServicei;


@RestController
public class ICICIController {
	
	@Autowired
	ICICIServicei isi;
	
	@PostMapping("/save_icici_customer")
	public void save_Customer(@RequestBody ICICI icici)
	{
		isi.saveCustomer(icici);
	}

}
