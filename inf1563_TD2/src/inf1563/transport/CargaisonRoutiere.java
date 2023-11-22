package inf1563.transport;

public class CargaisonRoutiere {

	private double poidsTotal;
	private double volumeTotal;
	private Destination destination;
	public static double LIMITE_POIDS=11000;
	//en kg
	public static double LIMITE_VOL=19;
	//en m3
	double COUT_VIDE;
	double COUT_PAR_TONNE;
	


	
	
	
	public CargaisonRoutiere(double poidsTotal, double volumeTotal, Destination destination) {
		this.poidsTotal = poidsTotal=0;
		this.volumeTotal = volumeTotal=0;
		this.destination = destination;
		COUT_VIDE =1.4*destination.getDistance();
		COUT_PAR_TONNE=poidsTotal/1000*.2;
		
	}
	
	boolean ajouter(Marchandise m) {
		if(poidsTotal+m.getPoids()<=LIMITE_POIDS  && volumeTotal+m.getVolume()<=LIMITE_VOL) {
			poidsTotal=poidsTotal+m.getPoids();
			volumeTotal=volumeTotal+m.getVolume();
			COUT_PAR_TONNE=(poidsTotal/1000)*.2*destination.getDistance();
			return true;
		}
		else {
			return false;
		}
	}
	

	double coutTransport() {
		return COUT_VIDE + COUT_PAR_TONNE;
	}
	
	
}
