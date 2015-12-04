package ksu.nuclear.trip;

import ksu.nuclear.utilities.Coincidence2OutOf4;

public class LCLProcessor {
	// gets 8 inputs from all 8 BPs
	// gives 2 outputs: to two Digital Output Modules
	
	boolean a1, a2, b1, b2, c1, c2, d1, d2;
	
	public LCLProcessor(boolean a1, boolean a2, boolean b1, boolean b2, 
			boolean c1, boolean c2, boolean d1, boolean d2){
		this.a1 = a1;
		this.a2 = a2;
		this.b1 = b1;
		this.b2 = b2;
		this.c1 = c1;
		this.c2 = c2;
		this.d1 = d1;
		this.d2 = d2;
	}
	
	public boolean calculateOutput(){
		boolean gateA = this.a1 || this.a2;
		boolean gateB = this.b1 || this.b2;
		boolean gateC = this.c1 || this.c2;
		boolean gateD = this.d1 || this.d2;
		
		boolean coincidenceLogicOutput = Coincidence2OutOf4.calculate(gateA, gateB, gateC, gateD);
		return coincidenceLogicOutput;
	}
	
}
