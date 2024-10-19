package com.securehaven._securehaven_producer_banks1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private long accountNo;
	
	private String accountHolderName;
	
	private String pancard;
	
	private long aadhar;
	
	private long accountBalance;
	
	private String loanStatus;
	
	private int numberOfLoan;
	
	private long currentLoanAmount;
	
	private long previousLoanAmount;
	
}
