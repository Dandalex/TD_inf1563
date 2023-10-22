package inf1563_TD2;

public class TD_1_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dt, jts, sta, dpj, dps, dpa;
		double ce, pe, cea, coutan;
		
		dt = 12;
		jts = 4;
		sta = 48;
		ce = 0.08;
		pe = 1.20;
		
		dpj = dt * 2;
		dps = dpj * jts;
		dpa = dps * sta;
		cea = dpa * ce;
		coutan = cea * pe;
		
		System.out.println("Cout annuel prévu : $" + coutan  + " par année");
	}
}
