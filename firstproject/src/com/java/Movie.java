package com.java;

public class Movie {
	String movieName;
	int releasedyear;
	static double ticketprice = 300;

	public static void main(String[] args) {
		Movie pb = new Movie();
		pb.movieName = "spirit";
		pb.releasedyear = 2026;
		System.out.println("MovieName=" + pb.movieName);
		System.out.println("MovieName=" + pb.releasedyear);
		System.out.println(ticketprice);

		Movie rc = new Movie();
		rc.movieName = "peddi";
		rc.releasedyear = 2026;
		System.out.println("MovieName=" + rc.movieName);
		System.out.println("MovieName=" + rc.releasedyear);
		System.out.println(ticketprice);
		
		ticketprice = 500;
		Movie mb = new Movie();
		mb.movieName = "varanasi";
		mb.releasedyear = 2028;
		System.out.println("MovieName=" + mb.movieName);
		System.out.println("MovieName=" + mb.releasedyear);
		System.out.println(ticketprice);
	}

}
