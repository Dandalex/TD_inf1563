package inf1563_TD2;

public class Recursivite {

	public static void main(String[] args) {
		construireRegle(10,3);
	}
	
	public static int sommeDesChiffres (int n) {
		int somme=0;
		
		
		return somme;
	}
	public static int somme1(int n) {
		int somme;
		somme 
		
		
		return somme;
	}
	
	public static void construireRegle (int l, int n){
		for (int i =0;i<l; i++) {
		System.out.println("-----"+i+"-----");
		graduations(n);
		}	
	}
	
	
	public static void graduations (int n) {
		if (n==1) {
			System.out.println("-");			
		}
		else {
			graduations (n-1);
			for (int i=0; i<(n-1);i++) {
				System.out.print("-");
			}
			System.out.println("-");
			graduations (n-1);
		}
	}
    
	public static void graduation1 () {
		System.out.println("-");
	}
	
	public static void graduation2 () {
		graduation1();
		System.out.print("-");
		graduation1();
		graduation1();
	}
	
	public static void graduation3 () {
		graduation2();
		System.out.print("--");
		graduation1();
		graduation2();
	}
	
	public static void graduation4 () {
		graduation3();
		System.out.print("---");
		graduation1();
		graduation3();
	}
}
