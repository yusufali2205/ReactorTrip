package ksu.nuclear.trip;

public class AnalogInputModuleBP {
	// takes inputs from APCs and ENFMS
	// gives output to BL
	
	long apcsInput, enfmsInput;

	public AnalogInputModuleBP(long apcsInput, long enfmsInput){
		this.apcsInput = apcsInput;
		this.enfmsInput = enfmsInput;
	}
	
	public long claculateOutput(){
		// use apcs and enfms inputs here.
		// probably it is just converting the analog input to digital

		// currently hardcoding the output (I don't know the logic)
		return 100;
	}
	
	public long getApcsInput() {
		return apcsInput;
	}

	public void setApcsInput(long apcsInput) {
		this.apcsInput = apcsInput;
	}

	public long getEnfmsInput() {
		return enfmsInput;
	}

	public void setEnfmsInput(long enfmsInput) {
		this.enfmsInput = enfmsInput;
	}
}
