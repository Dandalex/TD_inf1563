package inf1563_TD2;

import java.util.Random;
import java.util.Scanner;

public class Casino {

	public static void main(String[] args) {
		
				// pour exécuter seulement le code d'un des deux exercices, commenter 
			    // la ligne correspondant à l'autre.
				 //exercice1();
			     exercice2();
			  }
			/////////////////////////////////////////////
			  public static void exercice1() {
			    
			    Random rand = new Random(); 
			    int egal=0;
			    System.out.println("==== Lancer dun dé (10 fois) =====");
			    for (int i=1; i<=10000000; i++){
			      int lancer1 = rand.nextInt(6)+1;
			      int lancer2 = rand.nextInt(6)+1;
			      int lancer3 = rand.nextInt(6)+1;
			      	if (lancer1==lancer2&&lancer3==lancer2) {
			      		egal = egal+1;
			      	}
			        //System.out.println("Dé #1 = " +lancer1 + ", dé #2 = " + lancer2 + ", dé # 3 = " +lancer3);
			      
			    }
			    double probabilite = (double) egal/10000000*100.0;
			    System.out.printf(" Pourcentage de lancers pareils: %.1f %% ",(probabilite));
			  }

			/////////////////////////////////////////////
			  public static void exercice2() {
			    int nombreEchec=0, nombreSucces=0;
			    Random rand = new Random();
			    Scanner scan = new Scanner(System.in);
			    System.out.println("==== Jeu de Roulette =====");
			    System.out.println("Ceci est une calculatrice de probabilité.\nNous voulons regarder votre chance de gagner à la roulette :)\n"
			    		+ "Commençons par déterminé le nombre de parties que vous allez jouer:\n"
			    		+ "(le plus haut le nombre, le plus précis l'exercise, mais le plus long l'exercice)");
			    int nparties = scan.nextInt();
			    System.out.println("Maintenant, que'elle est votre budget pour le jeu?");
			    int budgetInitial = scan.nextInt();
			    int but=0;
			    while (but < budgetInitial) {
			    	System.out.println("Maintenant, que'elle est votre but pour le jeu?\n"
			    			+ "(combien souhaitez vous avoir dans vos poches en sortant)");
			    	but = scan.nextInt();
			    	if (but> budgetInitial){
			    		break;
			    	}
			    	System.out.println("Oops, votre but est en dessu de votre budget, il doit le dépasser.");
			    }	
			    int mise,mise1=-1,mise2=-1,mise3=-1,mise4=-1;
			    for (int j=1 ; j<=4 ; j++) {
				    System.out.println("Quelles seront vos mises:\n"
				    		+ "(chaque mise est de 5$)\n"
				    		+ "1 = numero(s) uniquement\n"
				    		+ "2 = couleur(s) uniquement\n"
				    		+ "3 = mises terminés");
				    mise = scan.nextInt();
				    if (mise ==3) {
				    	break;
				    }
				    if (mise1<0) {	
					    if (mise==1){
					    		System.out.println("Quelle numero?\n"
					    				+ "(numero doit être entre 0 et 36 sinon vous allez perdre)");
					    	    mise1 = scan.nextInt();
					    		}
					    if (mise==2) {
					    	System.out.println("Quelle couleur?\n"
				    				+ "37 = rouge (pairs)\n"
				    				+ "38 = noir (impairs\n"
				    				+ "0 = vert (0)");
				    	    mise1 = scan.nextInt();
					    }
					    mise=-1;
				    }
				    if (mise1>0&&mise2<0) {	
					    if (mise==1){
					    		System.out.println("Quelle numero?\n"
					    				+ "(numero doit être entre 0 et 36 sinon vous allez perdre)");
					    	    mise2 = scan.nextInt();
					    		}
					    if (mise==2) {
					    	System.out.println("Quelle couleur?\n"
				    				+ "37 = rouge (pairs)\n"
				    				+ "38 = noir (impairs\n"
				    				+ "0 = vert (0)");
				    	    mise2 = scan.nextInt();
					    }
					    mise=-1;
				    }
				    if (mise1>0&&mise2>0&&mise3<0){	
					    if (mise==1){
					    		System.out.println("Quelle numero?\n"
					    				+ "(numero doit être entre 0 et 36 sinon vous allez perdre)");
					    	    mise3 = scan.nextInt();
					    		}
					    if (mise==2) {
					    	System.out.println("Quelle couleur?\n"
				    				+ "37 = rouge (pairs)\n"
				    				+ "38 = noir (impairs\n"
				    				+ "0 = vert (0)");
				    	    mise3 = scan.nextInt();
					    }
					    mise=-1;
				    }
					    if (mise1>0&&mise2>0&&mise3>0&&mise4<0){	
						    if (mise==1){
						    		System.out.println("Quelle numero?\n"
						    				+ "(numero doit être entre 0 et 36 sinon vous allez perdre)");
						    	    mise4 = scan.nextInt();
						    		}
						    if (mise==2) {
						    	System.out.println("Quelle couleur?\n"
					    				+ "37 = rouge (pairs)\n"
					    				+ "38 = noir (impairs\n"
					    				+ "0 = vert (0)");
					    	    mise4 = scan.nextInt();
						    }
					    }
			    }
			    for (int i=1 ; i<=nparties ; i++){
			    	int budget = budgetInitial;
				    while (budget>0 && budget<but){
				      int numero = rand.nextInt(37);
				      budget= budget-10;
				      if (numero==0) {
				    	 // System.out.println("Le numéro "+ numero+ " est sorti, il est vert!");		 
				      }
				      	else {
				    	  if (numero%2==0) {
				    	 // System.out.println("Le numéro "+ numero+ " est sorti, il est rouge!");		 
				    	  }
				    	  if((numero+1)%2==0) {
				    		 // System.out.println("Le numéro "+ numero+ " est sorti, il est noir!");		 
				    	  }
				      
				      	}
				      if (numero==mise1||numero==mise2||numero==mise3||numero==mise4) {
				    	 // System.out.println("Félicitations, vous avez gagner!");
				    	  budget = budget + 180;
				      }
				      if (((numero%2==0&&mise1==37)||(numero%2==0&&mise2==37)||(numero%2==0&&mise3==37)||(numero%2==0&&mise4==37))&&numero!=0) { //rouge
				    	  //System.out.println("Félicitations, vous avez gagner!");
				    	  budget = budget + 10;
				      }
				      if ((((numero+1)%2==0&&mise1==38)||((numero+1)==0&&mise2==38)||((numero+1)==0&&mise3==38)||((numero+1)==0&&mise4==38))&&mise1!=-1&&mise2!=-1&&mise3!=-1&&mise4!=-1){ //rouge
				    	  //System.out.println("Félicitations, vous avez gagner!");
				    	  budget = budget + 10;
				      }
				      }
				    if (budget<=0) {
				    	nombreEchec= nombreEchec+1;
				    	//System.out.println("***************************************ECHEC********************************"); // à la fin de tout
				   }
				   else {
				    nombreSucces= nombreSucces+1;
				   // System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$Victoire$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$"); // à la fin de tout
				    }
				     // System.out.println("Votre budget restant est de "+ budget+"$"); // à la fin de tout
				      	
			    }
			    double probabiliteVictoire = (double) nombreSucces/nparties*100;
			    double probabilitePerdre = (double) nombreEchec/nparties*100;
			    System.out.println("Vous aurez gagné " +nombreSucces+" fois, et perdu "+ nombreEchec+ " fois."); // à la fin de tout
			    System.out.printf(" Pourcentage chances de gagné: %.1f %% et %.1f %% de perdre.", probabiliteVictoire, probabilitePerdre);
				
				scan.close();
				

	}
	
}
