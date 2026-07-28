package com.java;

public class StaticMethod {
	static StaticMethod t=new StaticMethod();
	static void m1() {
		System.out.println("m1 called");
		m2();
	}
	static void m2() {
		System.out.println("m2 called");
		t.m3();
	}
	void m3() {
		t.m4();
		System.out.println("m3 called");
	}
	void m4() {
		System.out.println("m4 called");
	}
	
	public static void main(String[] args) {
   System.out.println("main method called");
   m1();
	}

//	static {
//		System.out.println("static block called");
//	}
//	{
//		System.out.println("static block called");
//	}
//
//	public static void main(String[] args) {
//		System.out.println("main method called");
//	}

}
