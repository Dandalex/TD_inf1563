package inf1563_TD2;

public class calculatriceMarathon {
public static void main(String[] args) {
		
		int largeur_m, largeur_cm, heure_de_debut, minutes_de_debut
		, vitesse, minutes_de_deplacement_totaux, heures_de_deplacement,
		heure_arrivee, minutes_de_deplacement, minute_arrivee;
		
		
		largeur_m = 26;
		heure_de_debut = 9;
		minutes_de_debut = 00;
		vitesse = 14;
		
		largeur_cm = largeur_m * 100;
		minutes_de_deplacement_totaux = largeur_cm / vitesse;
		heures_de_deplacement = minutes_de_deplacement_totaux/60;
		minutes_de_deplacement = minutes_de_deplacement_totaux%60;
		heure_arrivee = heures_de_deplacement + heure_de_debut;
		minute_arrivee = minutes_de_debut + minutes_de_deplacement;
		
		
		
		
		System.out.println("Son heure d'arrivée est " + heure_arrivee + ":" + minute_arrivee);
		
		
		
		// TODO Auto-generated method stub

	}
}
