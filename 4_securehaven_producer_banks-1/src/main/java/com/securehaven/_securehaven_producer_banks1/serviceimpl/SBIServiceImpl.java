package com.securehaven._securehaven_producer_banks1.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.securehaven._securehaven_producer_banks1.model.SBI;
import com.securehaven._securehaven_producer_banks1.repository.SBIRepository;
import com.securehaven._securehaven_producer_banks1.servicei.SBIServicei;


@Service
public class SBIServiceImpl implements SBIServicei{
	
	@Autowired
	SBIRepository sr;

	@Override
	public void saveCustomer(SBI sbi) {
		
		sr.save(sbi);
		
	}

	@Override
	public SBI getCustomerDetails(String pancard) {
		
		List<SBI> customers=sr.findAll();
		
		for(SBI a:customers)
		{
			if(a.getCustomer().getPancard() .equals(pancard))
				{
					return a;
				}
			
			else {
				return null;
			}
		}
		return null;  
		
	}

}
