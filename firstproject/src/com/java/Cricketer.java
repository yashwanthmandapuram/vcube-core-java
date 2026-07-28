package com.java;

public class Cricketer {
	String cricketerName;
	int jerseyNo;
	int age;
	
	static String countryName= "india";
	static String boardName="BCCI";

	public static void main(String[] args) {
		Cricketer vk=new Cricketer();
		vk.cricketerName="virat kohli";
		vk.jerseyNo=18;
		vk.age=37;
		System.out.println("cricketerName="+vk.cricketerName);
		System.out.println("jerserNo="+vk.jerseyNo);
		System.out.println("age="+vk.age);
		System.out.println(countryName);
		System.out.println(boardName);
		System.out.println("---------------------------------------------------");
		
		Cricketer rh=new Cricketer();
		rh.cricketerName="rohit";
		rh.jerseyNo=45;
		rh.age=39;
		System.out.println("cricketerName="+rh.cricketerName);
		System.out.println("jerserNo="+rh.jerseyNo);
		System.out.println("age="+rh.age);
		System.out.println(countryName);
		System.out.println(boardName);
		System.out.println("---------------------------------------------------");

		
		Cricketer dn=new Cricketer();
		dn.cricketerName="dhoni";
		dn.jerseyNo=7;
		dn.age=43;
		System.out.println("cricketerName="+dn.cricketerName);
		System.out.println("jerserNo="+dn.jerseyNo);
		System.out.println("age="+dn.age);
		System.out.println(countryName);
		System.out.println(boardName);
		System.out.println("---------------------------------------------------");

		Cricketer gl=new Cricketer();
		gl.cricketerName="gill";
		gl.jerseyNo=77;
		gl.age=28;
		System.out.println("cricketerName="+gl.cricketerName);
		System.out.println("jerserNo="+gl.jerseyNo);
		System.out.println("age="+gl.age);
		System.out.println(countryName);
		System.out.println(boardName);
		System.out.println("---------------------------------------------------");
	}

}
