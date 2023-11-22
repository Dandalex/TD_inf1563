package inf1563.transport;

public class Logistique {

	public static void main(String[] args) {
		Marchandise farine = new Marchandise(4000, 8, "farine");
		Marchandise carrelages = new Marchandise(5000, 2.5, "en ceramique");
		Marchandise pneus = new Marchandise(800, 8, "pneus d'hiver Michelin");
		Marchandise lego = new Marchandise(1000, 2.8, "Legos variees");
		Marchandise bacon = new Marchandise(500, .9, "Bacon Frais");
		System.out.println(farine.toString());
		System.out.println(carrelages.toString());
		
		Destination ymt = new Destination("Chibougamau", 780);
		Destination ywg = new Destination("Winnipeg", 2200);
		System.out.println(ywg.toString());
		
		
	}

}
