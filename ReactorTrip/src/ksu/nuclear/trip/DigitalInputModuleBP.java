package ksu.nuclear.trip;

public class DigitalInputModuleBP {
	// gets input from CPCS
	// sends output to BL
	
	long cpcsInput;

	public DigitalInputModuleBP(long cpcsInput){
		this.cpcsInput = cpcsInput;
	}
	
	public long calculateOutput(){
		// use cpcs input here.

		// currently hardcoding the output (I don't know the logic)
		return 100;
	}
	
	public long getCpcsInput() {
		return cpcsInput;
	}

	public void setCpcsInput(long cpcsInput) {
		this.cpcsInput = cpcsInput;
	}
	
	
}
