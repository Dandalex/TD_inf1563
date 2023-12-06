package inf1563.transport;

public class CargaisonRoutiere extends Cargaison{

	
	public static double LIMITE_POIDS=11000;
	//en kg
	public static double LIMITE_VOL=19;
	//en m3
	double COUT_VIDE= 1.4;
	double COUT_PAR_TONNE=.2;
	


	
	
	
	public CargaisonRoutiere(double poidsTotal, double volumeTotal, Destination destination) {
		super (poidsTotal,volumeTotal,destination);
	}
	
	
	public double getLimitePoids() {
		return LIMITE_POIDS;
	}

	public double getLimiteVolume() {
		return LIMITE_VOL;
	}




	public static void setLIMITE_VOL(double lIMITE_VOL) {
		LIMITE_VOL = lIMITE_VOL;
	}




	double coutTransport() {
		return (COUT_VIDE+COUT_PAR_TONNE*(poidsTotal/1000))*destination.getDistance();
	}
	
	
}
