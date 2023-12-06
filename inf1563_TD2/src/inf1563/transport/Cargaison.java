package inf1563.transport;

public class Cargaison {

	protected double poidsTotal;
	protected double volumeTotal;
	protected Destination destination;
	public static double LIMITE_POIDS=0;
	//en kg
	public static double LIMITE_VOL=0;
	//en m3
	
	public Cargaison(double poidsTotal, double volumeTotal, Destination destination) {
		super();
		this.poidsTotal = poidsTotal;
		this.volumeTotal = volumeTotal;
		this.destination = destination;
	}
	
	public double getLimitePoids() {
		return LIMITE_POIDS;
	}


	public double getLimiteVolume() {
		return LIMITE_VOL;
	}

	boolean ajouter(Marchandise m) {
		if(poidsTotal+m.getPoids()<= getLimitePoids()  && volumeTotal+m.getVolume()<= getLimiteVolume()) {
			poidsTotal=poidsTotal+m.getPoids();
			volumeTotal=volumeTotal+m.getVolume();
			return true;
		}
		else {
			return false;
		}
	}

	
	
	
}
