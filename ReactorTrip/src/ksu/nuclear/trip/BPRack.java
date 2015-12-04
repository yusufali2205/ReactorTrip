package ksu.nuclear.trip;

public class BPRack {
	// gets input from APC-S, ENFMS, CPCS
	// has 2 Analog input modules
	// has 1 digital input module
	// has 1 BL (bistable logic) processors
	// gives one output which is sent to all LCLs
	
	long apcsInput, enfmsInput, cpcsInput;
	AnalogInputModuleBP analogInputModule1, analogInputModule2;
	DigitalInputModuleBP digitalInputModule;
	BistableLogic blProcessor;
	
	public BPRack(long apcsInput, long enfmsInput, long cpcsInput){
		this.apcsInput = apcsInput;
		this.enfmsInput = enfmsInput;
		this.cpcsInput = cpcsInput;
		
		this.analogInputModule1 = new AnalogInputModuleBP(apcsInput, enfmsInput);
		this.analogInputModule2 = new AnalogInputModuleBP(apcsInput, enfmsInput);
		this.digitalInputModule = new DigitalInputModuleBP(cpcsInput);
	}
	
	public boolean calculateOutput(){
		long blInp1 = this.analogInputModule1.claculateOutput();
		long blInp2 = this.analogInputModule2.claculateOutput();
		long blInp3 = this.digitalInputModule.calculateOutput();
		
		this.blProcessor = new BistableLogic(blInp1, blInp2, blInp3);
		
		return this.blProcessor.calculateOutput();
	}
}
