package com.java;

public class Restaurant {
	
	static String restaurantname="one eight hotel";
	
	int tablenum;
	int seats;
	String reservation;
	static Restaurant r=new Restaurant();
	
	void reservetable() {
		System.out.println("table reserved");

	}
	void cancelreservation() {
		System.out.println("reservation cancelled");
		
	}
	void displayTableDetails() {
		System.out.println("restaurant name="+restaurantname);
		System.out.println("restaurant table number="+r.tablenum);
		System.out.println("restaurant seats="+r.seats);

	}
	static void changename() {
		String restaurantname="tulips hotel";
		System.out.println("changed name="+restaurantname);
	}
	static void displayrestname() {
		System.out.println("changed name"+restaurantname);
	}
	

	public static void main(String[] args) {
		r.tablenum=1;
		r.seats=4;
		r.reservetable();
		r.displayTableDetails();
		changename();
		System.out.println("----------------------------------------------------");
		
		r.tablenum=2;
		r.seats=6;
		r.cancelreservation();
		r.displayTableDetails();
		changename();


	}

}
