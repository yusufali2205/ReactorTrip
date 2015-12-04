package ksu.nuclear.trip;

public class BistableLogic {
	// gets input from analog input module 1-2 and from digital input module
	// sends output to LCL, which is the BP rack output
	
	long fromAnalogInput1, fromAnalogInput2, fromDigitalInput;
	
	public BistableLogic(long fromAnaInp1, long fromAnaInp2, long fromDigiInp){
		this.fromAnalogInput1 = fromAnaInp1;
		this.fromAnalogInput2 = fromAnaInp2;
		this.fromDigitalInput = fromDigiInp;
	}
	
	public boolean calculateOutput(){
		/* use the above three inputs here to calculate 
		 * if BP rack should send trip signal.
		 * true for sending trip signal
		 */
		
		// currently hardcoding since I don't know the logic inside it.
		return true;
	}
}
