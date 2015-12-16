package ksu.nuclear.main;

import ksu.nuclear.trip.PPS;
import ksu.nuclear.trip.RTSS;

public class Main {
	public static void main(String args[]){
		PPS pps = new PPS(10, 0, 0);
		boolean toA1 = pps.toRTSSA1();
		boolean toB1 = pps.toRTSSB1();
		boolean toC1 = pps.toRTSSC1();
		boolean toD1 = pps.toRTSSD1();
		boolean toA2 = pps.toRTSSA2();
		boolean toB2 = pps.toRTSSB2();
		boolean toC2 = pps.toRTSSC2();
		boolean toD2 = pps.toRTSSD2();
		
		System.out.println("RTSS A1 signal: "+ toA1);
		System.out.println("RTSS A2 signal: "+ toA2);
		System.out.println("RTSS B1 signal: "+ toB1);
		System.out.println("RTSS B2 signal: "+ toB2);
		System.out.println("RTSS C1 signal: "+ toC1);
		System.out.println("RTSS C2 signal: "+ toC2);
		System.out.println("RTSS D1 signal: "+ toD1);
		System.out.println("RTSS D2 signal: "+ toD2);
		
		RTSS rtss = new RTSS(toA1, toA2, toB1, toB2, toC1, toC2, toD1, toD2);
		
		System.out.println("\nReactor tripped: "+rtss.checkTrip());
	}
}