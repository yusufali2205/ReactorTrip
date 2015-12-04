package ksu.nuclear.main;

import ksu.nuclear.trip.PPS;

public class Main {
	public static void main(String args[]){
		PPS pps = new PPS(10, 0, 0);
		System.out.println("RTSS A1 signal: "+ pps.getRTSSA1out());
		System.out.println("RTSS A2 signal: "+ pps.getRTSSA2out());
		System.out.println("RTSS B1 signal: "+ pps.getRTSSB1out());
		System.out.println("RTSS B2 signal: "+ pps.getRTSSB2out());
		System.out.println("RTSS C1 signal: "+ pps.getRTSSC1out());
		System.out.println("RTSS C2 signal: "+ pps.getRTSSC2out());
		System.out.println("RTSS D1 signal: "+ pps.getRTSSD1out());
		System.out.println("RTSS D2 signal: "+ pps.getRTSSD2out());
	}
}