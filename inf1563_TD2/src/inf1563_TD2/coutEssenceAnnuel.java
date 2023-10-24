package inf1563_TD2;

public class coutEssenceAnnuel {
	public static void main(String[] args) {

		int distanceTravail, jourDeTravailParSemaine, distanceParAnnee;
		double consommationEssence, prixEssence, coutEssenceAnnuel;
		
		distanceTravail = 12;
		jourDeTravailParSemaine = 4;
		distanceParAnnee = distanceAnnuelle(jourDeTravailParSemaine, distanceTravail);

		prixEssence = 1.20;
		consommationEssence = 0.08;
		coutEssenceAnnuel = coutTransport(distanceParAnnee, consommationEssence, prixEssence);
		
		System.out.printf("Cout annuel prévu : $ %.2f par année",coutEssenceAnnuel);
	}

	public static int distanceAnnuelle(int joursSemaine, int distance){
		int semainesDeTravailAnnuel = 48;
		int distanceParJour = distance * 2;
		int distanceParSemaine = distanceParJour * joursSemaine;
		int distanceParAnnee = distanceParSemaine * semainesDeTravailAnnuel;
	return distanceParAnnee;
	}
	public static double coutTransport (int distanceAnnuelle, double consommationEssence, double prixEssence) {
		double consommationEssenceAnnuel = distanceAnnuelle * consommationEssence;
		double coutEssenceAnnuel = consommationEssenceAnnuel * prixEssence;
	return coutEssenceAnnuel;
	}
}
