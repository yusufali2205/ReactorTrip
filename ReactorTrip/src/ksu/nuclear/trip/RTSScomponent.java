package ksu.nuclear.trip;

public class RTSScomponent {
	//contains 4 RTSG A,B,C,D
	//(A and C) or (B and D) should break to create trip
	boolean inputA, inputB, inputC, inputD;
	boolean isTrip;
	
	public RTSScomponent(boolean inputA, boolean inputB, boolean inputC, boolean inputD){
		this.inputA = inputA;
		this.inputB = inputB;
		this.inputC = inputC;
		this.inputD = inputD;
			
		//keeping inputs from DPS to RTSG false
		RTSG rtsgA = new RTSG(false, this.inputA);
		RTSG rtsgB = new RTSG(false, this.inputB);
		RTSG rtsgC = new RTSG(false, this.inputC);
		RTSG rtsgD = new RTSG(false, this.inputD);
		
		boolean breakA = rtsgA.checkCircuitBroke();
		boolean breakB = rtsgB.checkCircuitBroke();
		boolean breakC = rtsgC.checkCircuitBroke();
		boolean breakD = rtsgD.checkCircuitBroke();
		
		this.isTrip = (breakA && breakB) || (breakC && breakD); 
	}
	
	public boolean checkTrip(){
		return isTrip;
	}
}
