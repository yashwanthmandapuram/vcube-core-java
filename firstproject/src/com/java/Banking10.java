package com.java;

public class Banking10 {
	static String bankname = "state bank of india";
	static int accountnumber = 24483492;
	int balance;
	void deposit() {
		balance = balance + 100;
		System.out.println("bank balance after deposit=" + balance);
	}
	void withdraw() {
		balance = balance - 200;
		System.out.println("bank balance after withdraw=" + balance);
	}

	void checkBalance() {
		System.out.println("bank balance=" + balance);
	}
	{
		accountnumber = accountnumber + 1;
		System.out.println("accountnumber=" + accountnumber);
	}
	public static void main(String[] args) {
		Banking10 b = new Banking10();
		b.balance = 1000;
		System.out.println("bank balance=" + b.balance);
		b.deposit();
		b.withdraw();
		b.checkBalance();
		
		Banking10 b1 = new Banking10();
		b1.balance = 5000;
		b1.deposit();
		b1.withdraw();
		b1.checkBalance();

	}

}
