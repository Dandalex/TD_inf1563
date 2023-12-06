package inf1563.transport;

public class CargaisonMaritime extends Cargaison{

	public static double LIMITE_POIDS=30000;
	//en kg
	public static double LIMITE_VOL=30;
	//en m3
	double COUT_PAR_TONNE=0.12;
	
	
	
	public CargaisonMaritime(double poidsTotal, double volumeTotal, Destination destination) {
		super (poidsTotal,volumeTotal,destination);
		
	}
	
	public double getLimitePoids() {
		return LIMITE_POIDS;
	}

	public double getLimiteVolume() {
		return LIMITE_VOL;
	}

	double coutTransport() {
		return (COUT_PAR_TONNE*(poidsTotal/1000)*destination.getDistance());
	}
	
	
	
}
	


