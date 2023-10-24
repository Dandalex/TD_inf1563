package inf1563_TD2;

public class TD_1_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int distanceTravail, jourDeTravailParSemaine, semainesDeTravailAnnuel, distanceParJour, distanceParSemaine, distanceParAnnee;
		double consommationEssence, prixEssence, consommationEssenceAnnuel, coutEssenceAnnuel;
		
		distanceTravail = 12;
		jourDeTravailParSemaine = 4;
		semainesDeTravailAnnuel = 48;
		consommationEssence = 0.08;
		prixEssence = 1.20;
		
		distanceParJour = distanceTravail * 2;
		distanceParSemaine = distanceParJour * jourDeTravailParSemaine;
		distanceParAnnee = distanceParSemaine * semainesDeTravailAnnuel;
		consommationEssenceAnnuel = distanceParAnnee * consommationEssence;
		coutEssenceAnnuel = consommationEssenceAnnuel * prixEssence;
		
		System.out.println("Cout annuel prévu : $" + coutEssenceAnnuel  + " par année");
	}
}
