package inf1563_TD2;
import java.util.Scanner;
import java.util.Random;
public class Devinette {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
		    Random rand = new Random(); 
		    System.out.println("==== Devinette =====");
		    	System.out.println("Je pense à un nombre entre 1 et 20. Saurez-vous le trouver?");
		    	int solution = rand.nextInt(20)+1; // pour avoir un nombre aléatoire entre 1 et 20
		    	int devine = 0; // initialiser le nombre choisi par l'utilisateur
		    	int tentatives = 1;
		    	//System.out.println(solution);
		    	// le programme où l'utilisateur devine va ici
		    	System.out.println("Entrer le nombre:");
		    		devine = scan.nextInt();
		    			while (devine != solution) {
		    				tentatives = tentatives + 1;
		    				if (devine > solution) {
		    					System.out.println("Vous avez devine trop haut, essayer a nouveau.");
		    				}
		    				else {
		    					System.out.println("vous avex devine trop bas, essayer a nouveau");
		    				}
		    				devine = scan.nextInt();
		    			}
		    	System.out.println("Bravo! \nVous avez trouvé en "+ tentatives+" tentatives.");
		    		System.out.println("Mon tour de deviner! Pensez à un nombre entre 1 et 20. Taper entrée quand vous êtes prêt.");
		    		 // ceci sert simplement à attendre que l'utilisateur tape entrée.;
		    		scan.nextLine();
		    		scan.nextLine();
		    		System.out.println("Je vais annoncer des nombres, entrez 0 si c'est trop petit, 1 si c'est trop grand, et 2 si j'ai deviné.");
		    		int tentatives2 = 0;
		    		int reponse = -5;
		    		int min = 1;
		    		int max = 20;
		    		int essaie = rand.nextInt(max-min+1)+ min;
		    		boolean tricheur = false;
		    		 // ordi donne une chance, premières essaie est alléatoire
		    			while (reponse != 2){
		    				System.out.println("Je devine " + essaie + "!");
		    				reponse = scan.nextInt();
		    				tentatives2 = tentatives2 + 1;
		    					while (reponse != 1 && reponse !=2 && reponse!=0) {
		    						System.out.println("Oops, vous avez fait une erreur :O. \nJe devine " + essaie + "!\n"
		    						+ "Entrez 0 si c'est trop petit, 1 si c'est trop grand, et 2 si j'ai deviné.");
		    						reponse = scan.nextInt();
		    					}
		    				if (reponse ==0) {
		    					min = essaie +1 ;
		    				}
		    				if(reponse==1){
		    					max = essaie - 1;
		    				}
		    				
		    				if (min>max){
		    					reponse = 2;
		    					tricheur = true;
		    					System.out.print("Hmm, vous semblez avoir triché. \n");	
		    				}
		    				essaie = ((max-min)/2)+min;
		    				//System.out.print("min: " + min + "max: "+ max + "\n");
		    			}
		    		System.out.println("J'ai trouvé en " + tentatives2 + " coups.");
		    	if (tricheur == true) {
		    		System.out.println("Personne aime un tricheur. Je décide que je gagne.");
		    	}
		    	else {
		    		if (tentatives > tentatives2){
		    			System.out.println("Haha, Je  vous ai battu ;)! J'ai gagné!");
		    		}
		    		else {
		    			System.out.println("Felicitations, vous avez mieux fait que moi! Vous avez gagné!");
		    		}
		    	}
	}

}
