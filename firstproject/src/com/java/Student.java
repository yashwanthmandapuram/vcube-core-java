package com.java;

public class Student {
	static Student s=new Student();
	static String clgname = "SNIST";
     
	String studentname;
	int engmarks;
	int telmarks;
	int hindimarks;
	int totalmarks;
	

	void calculatetotal () {
		int sum= engmarks+telmarks+hindimarks;
		System.out.println("Total marks="+sum);
	}
	void calculatepercentage() {
		double persent=(engmarks+telmarks+hindimarks)/3;

		System.out.println("percentage="+persent);
	}
	void displaystud() {
		System.out.println("clgname="+clgname);
		System.out.println("student name=="+s.studentname);
		System.out.println("marks in english="+s.engmarks);
		System.out.println("marks in telugu="+s.telmarks);
		System.out.println("marks in hindi="+s.hindimarks);

	}
	public static void main(String[] args) {
		s.studentname="Yash";
		s.engmarks=90;
		s.hindimarks=80;
		s.telmarks=90;
		
        s.displaystud();
        s.calculatetotal();
        s.calculatepercentage();
        System.out.println("---------------------------------");
        s.studentname="vinay";
		s.engmarks=10;
		s.hindimarks=20;
		s.telmarks=30;
		
        s.displaystud();
        s.calculatetotal();
        s.calculatepercentage();
        System.out.println("---------------------------------");

	}

}
