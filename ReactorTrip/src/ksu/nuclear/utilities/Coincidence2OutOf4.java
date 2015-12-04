package ksu.nuclear.utilities;

public class Coincidence2OutOf4 {
	public static boolean calculate(boolean inp1, boolean inp2, boolean inp3, boolean inp4){
		if ((inp1 && inp2) || (inp1 && inp3) || (inp1 && inp4) 
				|| (inp2 && inp3) || (inp2 && inp4) || (inp3 && inp4)){
			return true;
		} else return false;
	}
}
