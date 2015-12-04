package ksu.nuclear.trip;

import ksu.nuclear.utilities.Selective2OutOf4;

/*
 * Page: 194(7.2-123), Figure 7.2-10
 * */

public class PPS {
	// gets input from APC-S, ENFMS, CPCS
	// has two BP racks
	// has two LCL racks
	// has two selective 2/4 modules
	// gives two boolean outputs: to RTSS1 and RTSS2
	
	long apcsInput, enfmsInput, cpcsInput;
	BPRack bpRackA1, bpRackA2, bpRackB1, bpRackB2, bpRackC1, bpRackC2, bpRackD1, bpRackD2;
	LCLRack lclRackA1, lclRackA2, lclRackB1, lclRackB2, lclRackC1, lclRackC2, lclRackD1, lclRackD2;
	boolean RTSSA1, RTSSA2, RTSSB1, RTSSB2, RTSSC1, RTSSC2, RTSSD1, RTSSD2;
	
	public PPS(long apcsInput, long enfmsInput, long cpcsInput){
		this.apcsInput = apcsInput;
		this.enfmsInput = enfmsInput;
		this.cpcsInput = cpcsInput;
		
		/* for PPS channel A */
		this.bpRackA1 = new BPRack(apcsInput, enfmsInput, cpcsInput);
		this.bpRackA2 = new BPRack(apcsInput, enfmsInput, cpcsInput);
		boolean BPA1 = this.bpRackA1.calculateOutput();
		boolean BPA2 = this.bpRackA1.calculateOutput();
		
		/* for PPS channel B */
		this.bpRackB1 = new BPRack(apcsInput, enfmsInput, cpcsInput);
		this.bpRackB2 = new BPRack(apcsInput, enfmsInput, cpcsInput);
		boolean BPB1 = this.bpRackB1.calculateOutput();
		boolean BPB2 = this.bpRackB1.calculateOutput();
		
		/* for PPS channel C */
		this.bpRackC1 = new BPRack(apcsInput, enfmsInput, cpcsInput);
		this.bpRackC2 = new BPRack(apcsInput, enfmsInput, cpcsInput);
		boolean BPC1 = this.bpRackC1.calculateOutput();
		boolean BPC2 = this.bpRackC1.calculateOutput();
		
		/* for PPS channel D */
		this.bpRackD1 = new BPRack(apcsInput, enfmsInput, cpcsInput);
		this.bpRackD2 = new BPRack(apcsInput, enfmsInput, cpcsInput);
		boolean BPD1 = this.bpRackD1.calculateOutput();
		boolean BPD2 = this.bpRackD1.calculateOutput();
		
		/* forwarding outputs of BPs to LCLs */
		/* for PPS channel A */
		this.lclRackA1 = new LCLRack(BPA1, BPA2, BPB1, BPB2, BPC1, BPC2, BPD1, BPD2);
		this.lclRackA2 = new LCLRack(BPA1, BPA2, BPB1, BPB2, BPC1, BPC2, BPD1, BPD2);
		boolean A1 = this.lclRackA1.getDigitalOutput1();
		boolean A3 = this.lclRackA1.getDigitalOutput3();
		boolean A2 = this.lclRackA2.getDigitalOutput2();
		boolean A4 = this.lclRackA2.getDigitalOutput4();
		
		/* for PPS channel B */
		this.lclRackB1 = new LCLRack(BPA1, BPA2, BPB1, BPB2, BPC1, BPC2, BPD1, BPD2);
		this.lclRackB2 = new LCLRack(BPA1, BPA2, BPB1, BPB2, BPC1, BPC2, BPD1, BPD2);
		boolean B1 = this.lclRackB1.getDigitalOutput1();
		boolean B3 = this.lclRackB1.getDigitalOutput3();
		boolean B2 = this.lclRackB2.getDigitalOutput2();
		boolean B4 = this.lclRackB2.getDigitalOutput4();
		
		/* for PPS channel C */
		this.lclRackC1 = new LCLRack(BPA1, BPA2, BPB1, BPB2, BPC1, BPC2, BPD1, BPD2);
		this.lclRackC2 = new LCLRack(BPA1, BPA2, BPB1, BPB2, BPC1, BPC2, BPD1, BPD2);
		boolean C1 = this.lclRackC1.getDigitalOutput1();
		boolean C3 = this.lclRackC1.getDigitalOutput3();
		boolean C2 = this.lclRackC2.getDigitalOutput2();
		boolean C4 = this.lclRackC2.getDigitalOutput4();
		
		/* for PPS channel D */
		this.lclRackD1 = new LCLRack(BPA1, BPA2, BPB1, BPB2, BPC1, BPC2, BPD1, BPD2);
		this.lclRackD2 = new LCLRack(BPA1, BPA2, BPB1, BPB2, BPC1, BPC2, BPD1, BPD2);
		boolean D1 = this.lclRackD1.getDigitalOutput1();
		boolean D3 = this.lclRackD1.getDigitalOutput3();
		boolean D2 = this.lclRackD2.getDigitalOutput2();
		boolean D4 = this.lclRackD2.getDigitalOutput4();
		
		/* Final PPS outputs */
		/* from PPS-A */
		this.RTSSA1 = Selective2OutOf4.calculate(A1, A2, A3, A4);
		this.RTSSA2 = Selective2OutOf4.calculate(A1, A2, A3, A4);
		
		/* from PPS-B */
		this.RTSSB1 = Selective2OutOf4.calculate(B1, B2, B3, B4);
		this.RTSSB2 = Selective2OutOf4.calculate(B1, B2, B3, B4);
		
		/* from PPS-C */
		this.RTSSC1 = Selective2OutOf4.calculate(C1, C2, C3, C4);
		this.RTSSC2 = Selective2OutOf4.calculate(C1, C2, C3, C4);
		
		/* from PPS-D */
		this.RTSSD1 = Selective2OutOf4.calculate(D1, D2, D3, D4);
		this.RTSSD2 = Selective2OutOf4.calculate(D1, D2, D3, D4);
	}
	
	public boolean getRTSSA1out(){
		return this.RTSSA1;
	}
	public boolean getRTSSA2out(){
		return this.RTSSA2;
	}
	public boolean getRTSSB1out(){
		return this.RTSSB1;
	}
	public boolean getRTSSB2out(){
		return this.RTSSB2;
	}
	public boolean getRTSSC1out(){
		return this.RTSSC1;
	}
	public boolean getRTSSC2out(){
		return this.RTSSC2;
	}
	public boolean getRTSSD1out(){
		return this.RTSSD1;
	}
	public boolean getRTSSD2out(){
		return this.RTSSD2;
	}
}
