package com.bank;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {

		Bank bank = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Which bank 1.SBI | 2.HDFC");
		int bankType = sc.nextInt();
		
		switch (bankType) {
		case 1:
			bank = new SBI();
			break;
		case 2:
			bank = new HDFC();
			break;
		default:
			System.out.println("Invalid input");
		}

		System.out.println(bank.getClass().getName());
		bank.deposit(5000);
		bank.withdraw(1000);

	}

}
