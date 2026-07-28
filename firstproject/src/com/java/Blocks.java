package com.java;

public class Blocks {
	static {
		System.out.println("static block executed");
	}
	{
		System.out.println("instance block executed");
	}

	public static void main(String[] args) {
        Blocks b=new Blocks();
        System.out.println("main method ended");
	}

}
