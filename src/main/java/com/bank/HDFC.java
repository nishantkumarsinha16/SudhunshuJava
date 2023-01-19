package com.bank;

import java.awt.Desktop.Action;

public class HDFC implements Bank {

	@Override
	public void deposit(float amt) {
		System.out.println("Rs:" + amt + " Credited to your HDFC account");

	}

	@Override
	public void withdraw(float amt) {
		System.out.println("Rs:" + amt + " Debet to your HDFC account");

	}

}
