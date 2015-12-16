package ksu.nuclear.trip;

public class RTSS {
	//combining both RTSS1 and RTSS2
	
	//inputs to RTSS1
	boolean inputA1, inputB1, inputC1, inputD1;
	//inputs to RTSS2
	boolean inputA2, inputB2, inputC2, inputD2;
	boolean isTrip;
	
	public RTSS(boolean A1fromPPS, boolean A2fromPPS, boolean B1fromPPS, boolean B2fromPPS, 
			boolean C1fromPPS, boolean C2fromPPS, boolean D1fromPPS, boolean D2fromPPS){
		this.inputA1 = A1fromPPS;
		this.inputA2 = A2fromPPS;
		this.inputB1 = B1fromPPS;
		this.inputB2 = B2fromPPS;
		this.inputC1 = C1fromPPS;
		this.inputC2 = C2fromPPS;
		this.inputD1 = D1fromPPS;
		this.inputD2 = D2fromPPS;
		
		RTSScomponent RTSS1 = new RTSScomponent(this.inputA1, this.inputB1, this.inputC1, this.inputD1);
		RTSScomponent RTSS2 = new RTSScomponent(this.inputA2, this.inputB2, this.inputC2, this.inputD2);
		
		this.isTrip = RTSS1.checkTrip() || RTSS2.checkTrip();
	}
	
	public boolean checkTrip(){
		return isTrip;
	}
}
