package com.securehaven._securehaven_producer_banks1.servicei;

import com.securehaven._securehaven_producer_banks1.model.SBI;

public interface SBIServicei {

	public void saveCustomer(SBI sbi);

	public SBI getCustomerDetails(String pancard);
	
	

}
