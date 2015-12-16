package ksu.nuclear.trip;

public class RTSG {
	//receives two inputs. 
	//Keeping input from DPS false because we are only dealing with PPS
	boolean fromDPS, fromPPS;
	boolean out;
	
	public RTSG(boolean dps, boolean pps){
		this.fromDPS = false;
		this.fromPPS = pps;
		this.out = this.fromDPS || this.fromPPS;
	}
	
	public boolean checkCircuitBroke(){
		return out;
	}
}
