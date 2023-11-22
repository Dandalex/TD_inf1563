package inf1563.transport;

public class Logistique {

	public static void main(String[] args) {
		Marchandise farine = new Marchandise(4000, 8, "farine");
		Marchandise carrelages = new Marchandise(5000, 2.5, "en ceramique");
		Marchandise pneus = new Marchandise(800, 8, "pneus d'hiver Michelin");
		Marchandise lego = new Marchandise(1000, 2.8, "Legos variees");
		Marchandise bacon = new Marchandise(500, .9, "Bacon Frais");
		
		Destination ymt = new Destination("Chibougamau", 780);
		Destination ywg = new Destination("Winnipeg", 2200);
		
		CargaisonRoutiere trip1= new CargaisonRoutiere(0,0,ywg);
		
		System.out.println(trip1.ajouter(farine));
		System.out.println(trip1.ajouter(carrelages));
		System.out.println(trip1.ajouter(pneus));
		System.out.println(trip1.ajouter(lego));
		System.out.println(trip1.ajouter(bacon));
		
		System.out.println(trip1.coutTransport());
		
	}

}
