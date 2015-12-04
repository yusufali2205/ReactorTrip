package ksu.nuclear.trip;

public class LCLRack {
	// gets input from all the BP racks
	// has 4 LCL processors
	// has 2 digital output module (duplicates output, no need of creating a class)
	// gives 4 boolean outputs: to two selective 2/4 modules
	
	boolean a1, a2, b1, b2, c1, c2, d1, d2;
	LCLProcessor lclProcessor1, lclProcessor2, lclProcessor3, lclProcessor4;
	boolean out1, out2, out3, out4;
	
	public LCLRack(boolean a1, boolean a2, boolean b1, boolean b2, 
			boolean c1, boolean c2, boolean d1, boolean d2){
		this.a1 = a1;
		this.a2 = a2;
		this.b1 = b1;
		this.b2 = b2;
		this.c1 = c1;
		this.c2 = c2;
		this.d1 = d1;
		this.d2 = d2;
		
		this.lclProcessor1 = new LCLProcessor(a1, a2, b1, b2, c1, c2, d1, d2);
		this.lclProcessor2 = new LCLProcessor(a1, a2, b1, b2, c1, c2, d1, d2);
		this.lclProcessor3 = new LCLProcessor(a1, a2, b1, b2, c1, c2, d1, d2);
		this.lclProcessor4 = new LCLProcessor(a1, a2, b1, b2, c1, c2, d1, d2);
		
		this.out1 = this.lclProcessor1.calculateOutput();
		this.out2 = this.lclProcessor1.calculateOutput();
		this.out3 = this.lclProcessor1.calculateOutput();
		this.out4 = this.lclProcessor1.calculateOutput();
		
	}
	
	public boolean getDigitalOutput1(){
		return this.out1;
	}
	
	public boolean getDigitalOutput2(){
		return this.out2;
	}
	
	public boolean getDigitalOutput3(){
		return this.out3;
	}
	
	public boolean getDigitalOutput4(){
		return this.out4;
	}
}
