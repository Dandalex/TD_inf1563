package inf1563.transport;

public class CargaisonAerienne  extends Cargaison{

	
	public static double LIMITE_POIDS=1530;
	//en kg
	public static double LIMITE_VOL=4.3;
	//en m3
	double COUT_FIXE= 800;
	double COUT_PAR_TONNE=.9;
	
	
	
	public CargaisonAerienne(double poidsTotal, double volumeTotal, Destination destination) {
		super (poidsTotal,volumeTotal,destination);
		
	}
	
	
	public double getLimitePoids() {
		return LIMITE_POIDS;
	}


	public double getLimiteVolume() {
		return LIMITE_VOL;
	}




	double coutTransport() {
		return (COUT_PAR_TONNE*(poidsTotal/1000)*destination.getDistance()+COUT_FIXE);
	}
	
	
	
}
