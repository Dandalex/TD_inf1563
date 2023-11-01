package inf1563_TD2;

public class Recursivite {

	public static void main(String[] args) {
		int n= sommeTotale(213455);
		System.out.println(n);
	}
	
	public static int sommeTotale(int n) {
		if (n<10) {
			return n;
		}
		else {
		int somme= sommeTotale (sommeDesChiffres(n));
		return somme;
		}
	}
	
	
	
	public static int sommeDesChiffres (int n) {
		
		// a comprendre j<ai un peu fait n'importe quoi
		int somme=0;
		if (n/10==0) {
			somme=n%10;
			return somme;
		}
		else {
			somme= sommeDesChiffres(n%10) + sommeDesChiffres(n/10);
		}
		
		
		return somme;
	}
	public static int somme1(int n) {
		int somme;
		somme = n%10;
		return somme;
	}
	
	public static int somme2(int n) {
		int somme1 = somme1(n);
		int somme2 = somme1(n/10);
		int somme= somme1+somme2;
		return somme;
	}
	
	public static int somme3(int n) {
		int somme1= somme2(n);
		int somme3= somme1(n/100);
		int somme= somme1+somme3;
		return somme;
	}
	
	public static int somme4(int n) {
		int somme1 = somme3 (n);
		int somme2 = somme1(n/1000);
		int somme = somme1+somme2;
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
