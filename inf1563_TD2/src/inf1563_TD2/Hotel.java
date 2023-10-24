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
			    int locationSalle = 0;
			    int invitesParTable = 8;
			    
			    	if (invites < 50) {
			    	locationSalle = 300;
			    } 	else {
			    	locationSalle = 500;
			    }
			    
			    	if (invites < 50 ) {
			    	System.out.println("Vous pouvez avoir accès à la grande salle même si vous êtes moins que 50 invitées.\nCela vous intérèsse? Oui [10] Non [0]");
			    	int choixSalle = clavier.nextInt();
			    		if (choixSalle > 0) {
			    		locationSalle = 500;
			    		}	
			    	}		
			   
			    int nbTables = invites/invitesParTable;
			    int invitesTrop = invites%invitesParTable;
			    if (invitesTrop > 0) {
			    	nbTables = nbTables + 1;
			    }
			    
			    	
			    
			    int locationMobilier = 90*nbTables + 16*invites;
			    estimation = locationMobilier + locationSalle;
			    
			    System.out.println("Entrer votre numero de membre Elite Gold Member Supreme:"
			    		+ "\n"
			    		+ "(entrer 0 si vous n'êtes pas membre.)");
				int numeroMembre = clavier.nextInt();
					if (numeroMembre > 0) {
						System.out.println("Merci de votre fidelité");
						if (estimation*0.90 > locationMobilier + 300) {
							System.out.println("Vous vous qualifier pour un upgrade gratuit de salle!");
							estimation = estimation - 200; 
							}
							
							else {
								estimation = estimation *.90;
								System.out.println("Vous qualifier pour un Rabais de 10%");
								}
					}
					
					
			    System.out.println("Le nombre de tables sera " + nbTables);
			    System.out.println("Votre réception coutera $"+estimation+".");  
				clavier.close();
				
	}

}
