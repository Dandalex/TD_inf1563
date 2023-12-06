package inf1563.transport;

public class Logistique {

	public static void main(String[] args) {
		Marchandise farine = new Marchandise(4000, 8, "farine");
		Marchandise carrelages = new Marchandise(5000, 2.5, "en ceramique");
		Marchandise pneus = new Marchandise(800, 8, "pneus d'hiver Michelin");
		Marchandise lego = new Marchandise(1000, 2.8, "Legos variees");
		Marchandise bacon = new Marchandise(500, .9, "Bacon Frais");
		Marchandise bananes = new Marchandise (12000,14, "Banances");
		
		Destination ymt = new Destination("Chibougamau", 780);
		Destination ywg = new Destination("Winnipeg", 2200);
		Destination rkv = new Destination("Reykjavik",4000);
		
		CargaisonRoutiere trip1= new CargaisonRoutiere(0,0,ywg);
		
		System.out.println(trip1.ajouter(farine));
		System.out.println(trip1.ajouter(carrelages));
		System.out.println(trip1.ajouter(pneus));
		System.out.println(trip1.ajouter(lego));
		System.out.println(trip1.ajouter(bacon));
		
		CargaisonAerienne trip2 = new CargaisonAerienne(0,0,ywg);
		System.out.println(trip2.ajouter(lego));
		System.out.println(trip2.ajouter(bacon));
		
		CargaisonMaritime trip3 = new CargaisonMaritime(0,0,rkv);
		System.out.println(trip3.ajouter(bananes));
		System.out.println(trip3.ajouter(bananes));
		System.out.println(trip3.ajouter(bananes));
		
		
		System.out.println(trip3.coutTransport());
		
	}

}
