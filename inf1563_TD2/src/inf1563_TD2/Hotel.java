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

			    double estimation;
			    double locationSalle = 0;
			    int choixSalle=0;
				System.out.println("Entrer votre numero de membre Elite Gold Member Supreme:"
			    	+ "\n"
			    	+ "(entrer 0 si vous n'êtes pas membre.)");
					int numeroMembre = clavier.nextInt();

				locationSalle = coutReception (invites, choixSalle, numeroMembre);
				double locationSalleGrande = coutReception (invites, 1, numeroMembre);
				if (invites < 50 ) {
					System.out.println("Vous pouvez avoir accès à la grande salle même si vous êtes moins que 50 invitées.");
					System.out.println("Présentement le cout serait de $"+locationSalle+".\n"+
					"Le cout dans la grande salle serait $"+locationSalleGrande+".\n"+
					"Cela vous intérèsse? Oui [1] ou Non[0]");
					choixSalle = clavier.nextInt();
				}

				locationSalle = coutReception (invites, choixSalle, numeroMembre);
			    estimation = locationSalle;
					
				int nbTables = nombreTables(invites);
			    System.out.println("Le nombre de tables sera " + nbTables);
			    System.out.println("Votre réception coutera $"+estimation+".");  
				clavier.close();
				
	}



		public static double coutReception (int invites, int choixSalle, int numeroMembre){
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

			if (numeroMembre > 0) {
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
