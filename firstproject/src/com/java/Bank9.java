package com.java;

public class Bank9 {
	static String IFSC="SBI9088";
	static String branchname="Ghanpur";
	static int accountnumber=343543658;
	
	String accountholdername;
	int balance;
	{
		accountnumber=accountnumber+1;
	}
	
	void show() {
	    System.out.println("IFSC="+IFSC);
	    System.out.println("branchname="+branchname);
	    System.out.println("accountnumber="+accountnumber);
	    System.out.println("accountholdername="+accountholdername);
	    System.out.println("balance="+balance);
	}

	public static void main(String[] args) {
 
    
    Bank9 b=new Bank9();
    b.accountholdername="a";
    b.balance=50;
    b.show();
    
    Bank9 b1=new Bank9();
    b1.accountholdername="c";
    b1.balance=500;
    b1.show();
    
    
    Bank9 b2=new Bank9();
    b2.accountholdername="d";
    b2.balance=5;
    b2.show();

	}

}
