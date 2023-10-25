package inf1563_TD2;

import java.util.Scanner;

public class Hotel {

	public static void main(String[] args) {
		
				 // créer l'objet Scanner
			    Scanner clavier = new Scanner(System.in);
			    
			    // afficher un message à l'utilisateur:
			    System.out.println("Entrez le nombre d'invités:");
			    // méthode pour lire un int au clavier
			    int invites = clavier.nextInt();
				boolean membre = false;
			    double locationSalle = 0;
			    int choixSalle=0;

				System.out.println("Entrer votre numero de membre Elite Gold Member Supreme:"
			    	+ "\n"
			    	+ "(entrer 0 si vous n'êtes pas membre.)");
					int numeroMembre = clavier.nextInt();
					if (numeroMembre >0){
						membre = true;
					}

				locationSalle = coutReception (invites, choixSalle, membre);
				double locationSalleGrande = coutReception (invites, 1, membre);
				if ((invites < 50) && (locationSalle != locationSalleGrande)) {
					System.out.println("Vous pouvez avoir accès à la grande salle même si vous êtes moins que 50 invitées.");
					System.out.printf("Présentement le cout serait de $ %.2f.\n"+
					"Le cout dans la grande salle serait $%.2f.\n"+
					"Cela vous intérèsse? Oui [1] ou Non[0]", locationSalle, locationSalleGrande);
					choixSalle = clavier.nextInt();
				}
				locationSalle = coutReception (invites, choixSalle, membre);
					
				int nbTables = nombreTables(invites);
			    System.out.println("Le nombre de tables sera " + nbTables);
			    System.out.printf("Votre réception coutera $%.2f.",locationSalle);  
				clavier.close();
				
	}

		public static double coutReception (int invites, int choixSalle, boolean membre){
			double locationSalle;
			if (invites < 50) {
			    locationSalle = 300;
			 } 	else {
				locationSalle = 500;
			}
			int nbTables = nombreTables(invites);
			int locationMobilier = 90*nbTables + 16*invites;
			locationSalle = locationSalle + locationMobilier;
			if (choixSalle == 1) {
						locationSalle = locationSalle + 200;

			if (membre == true) {
				System.out.println("Merci de votre fidelité");
				if (locationSalle*0.90 > locationMobilier + 300) {
					System.out.println("Vous vous qualifier pour un upgrade gratuit de salle!");
					locationSalle = locationSalle - 200; 
				}	
				else {
					locationSalle = (locationSalle *.90);
					System.out.println("Vous qualifier pour un Rabais de 10%");
				}
			}			
						}	

		return locationSalle;
		}

		public static int nombreTables (int invites){
			int invitesParTable = 8;
			int nbTables = invites/invitesParTable;
			int invitesTrop = invites%invitesParTable;
			if (invitesTrop > 0) {
			    nbTables = nbTables + 1;
			}
		return nbTables;
		}	
}
