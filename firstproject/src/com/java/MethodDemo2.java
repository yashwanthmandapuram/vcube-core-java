package com.java;

public class MethodDemo2 {
	// static
	static void b1() {
		int a = 10;
		int b = 20;
		System.out.println(a + b);

	}

	static void b2() {
		int a = 10;
		int b = 20;
		System.out.println(a - b);
		MethodDemo2 t = new MethodDemo2();
		t.b3();

	}

	void b3() {
		int a = 10;
		int b = 20;
		System.out.println(a * b);
		MethodDemo2 t = new MethodDemo2();
		t.b4();
	}

	void b4() {

		int a = 10;
		int b = 20;
		System.out.println(b / a);
	}

	public static void main(String[] args) {

		b1();
		b2();

	}

}
