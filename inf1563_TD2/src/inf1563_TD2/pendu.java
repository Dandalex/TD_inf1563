package inf1563_TD2;
import java.util.Random;
import java.util.Scanner;

public class pendu {



		//Tableau contenant tous les mots a trouver.
		static String tabMots[] = {"ABLATION", "ASCENSION", "WAGON", "MINUSCULE", "PLAINTIF", "RUBICOND", "CLOWNESQUE", "KILOGRAMME", "ZOULOU", "HYPOCRISIE", "INTERMINABLE", "REVOLUTION", "DUBITATIF", "FERMENTATION", "RUTABAGA", "ACCUEIL", "BROUTER", "GIGOT", "EXPLOSION", "RELIURE", "NIAIS", "PETIT", "PIQUET", "BLOND", "PUNK",	"FRAPPANT", "RADOTER", "BORBORYGME", "FOURMI", "TAJINE"};
	
		public static void main(String[] args) {
			Random rand = new Random();

			// initialisations ------
	    //choisir un mot au hasard
			int numero = rand.nextInt(30);
	    String motATrouver =tabMots[numero]; 
	    //**********importrant de rechanger mot apres ici******************

			// initialiser le tableau des lettres à deviner
			char [] lettres = motATrouver.toCharArray();
			
	    // initialiser le tableau trouve
			boolean[] trouve = new boolean[lettres.length];
	    for (int i=0; i<trouve.length; i++) {
				trouve[i]=false; //pour l'instant aucune lettre n'a été trouvée
			}
	    //---------

			System.out.println("Bienvenue au jeu du pendu!");
			System.out.println("Devinez un mot en français en tapant des lettres au clavier.");
	    Scanner clavier = new Scanner(System.in);
			// initialiser la liste des lettres déjà dites
			String dejaDit = "Déjà dit: ";
			int nbErreurs = 0;
	    //------------------------------------------- boucle de jeu
			while(!toutTrouve(trouve) && nbErreurs <7) {
				afficherPendu(nbErreurs); // affiche le dessin du pendu
				afficherMot(lettres, trouve); // afficher le mot à deviner, sous la forme "_ L E _ _ E"
		
	      System.out.println(dejaDit);
				System.out.print("Entrer une lettre:");

				char lettre = clavier.next().charAt(0);
				lettre = Character.toUpperCase(lettre); // prend la majuscule correspondante (ne fait rien si c'était déjà une majuscule)
				
	      // vérifier si la lettre est dans le mot à deviner.
	      if (! verifierLettres(lettre, lettres, trouve)){
	        nbErreurs = nbErreurs+1;
	         // ajouter la lettre aux lettres déjà devinées
	        dejaDit = dejaDit + " "+lettre;
	      }
	     
			} // fin boucle de jeu
			
			if(toutTrouve(trouve)) { // si la fonction "tout trouvé" retourne true...
	      afficherMotSolution(lettres);
				System.out.println("Bravo! Vous avez gagné!");
	    }	else {
				afficherPendu(nbErreurs);
				afficherMotSolution(lettres);

				System.out.println("Vous avez perdu!");
			}
				clavier.close();
		} // fin main -------------------------------
	  
		/**
		 * Affiche le mot, avec seulement les lettres déjà devinées
		 * 
		 * */
		public static void afficherMot(char[] mot, boolean[] trouvees) {
			for(int i =0;i<mot.length;i++) {
				if (trouvees[i]==true) {
					System.out.print(" "+mot[i]);
				}
				else {
					System.out.print(" _");
				}
			}
			System.out.println();
		}
		
	
		public static void afficherMotSolution(char[] mot) {
			/**r
			 * Affiche la solution
			 * */
			for (int i=0; i<mot.length; i++) {
					System.out.print(mot[i]);
				
			}
			System.out.println();
		}
		
	  /** Verifier si la lettre donnée (c) apparait dans le mot.
	  * si elle y est, il faut modifier le tableau trouve, et retourner true
	  * si elle n'y est pas, retourner false
	  */
	  public static boolean verifierLettres(char c, char [] lettres, boolean [] trouve){
		  for (int i=0; i<lettres.length;i++) {
			  if (c==lettres[i]&&trouve[i]==false) {
				  trouve[i]=true;
				  verifierLettres(c,lettres,trouve);
				  return true;
			  }
		  }
		  return false;
	  }

		/**
		 * Détermine si l'utilisateur a gagné
		 * @return true si toutes les lettres ont été devinées, sinon false
		 * 
		 * */
		public static boolean toutTrouve(boolean[] lettresTrouvees) {
			for(int i =0; i<lettresTrouvees.length;i++) {
				if (lettresTrouvees[i]==false) {
					return false;
				}
			}
			return true;
		}

	
	public static void afficherPendu (int erreurs) {
		System.out.println("__________");
		System.out.println("|/       "+(erreurs>=1?"|":" "));
		System.out.println("|        "+(erreurs>=2?"O":" "));
		System.out.println("|       "+(erreurs>=4?"/":" ")+(erreurs>=3?"|":" ")+(erreurs>=5?"\\":" "));
		System.out.println("|       "+(erreurs>=6?"/ ":" ")+(erreurs>=7?"\\":" "));
		System.out.println("|");
		System.out.println("|____________");
		
	}
}
