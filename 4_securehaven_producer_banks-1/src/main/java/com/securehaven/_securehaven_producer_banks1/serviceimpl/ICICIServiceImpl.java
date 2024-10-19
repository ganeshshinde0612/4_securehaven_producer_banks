package com.securehaven._securehaven_producer_banks1.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.securehaven._securehaven_producer_banks1.model.ICICI;
import com.securehaven._securehaven_producer_banks1.repository.ICICIRepository;
import com.securehaven._securehaven_producer_banks1.servicei.ICICIServicei;

@Service
public class ICICIServiceImpl implements ICICIServicei{
	
	@Autowired
	ICICIRepository ir;

	@Override
	public void saveCustomer(ICICI icici) {
		
		ir.save(icici);
		
	}

}
