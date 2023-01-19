package com.bank;

import org.openqa.selenium.By;

public class SBI implements Bank{

	@Override
	public void deposit(float amt) {
		System.out.println("Rs:"+amt+" Credited to your SBI account");
		
	}

	@Override
	public void withdraw(float amt) {
		System.out.println("Rs:"+amt+" Debet to your SBI account");
		
	}

	
	
	
}
