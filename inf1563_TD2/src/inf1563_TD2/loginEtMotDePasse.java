package inf1563_TD2;
import java.util.Random;

public class loginEtMotDePasse {
	
static int compteur =0;
static Random r = new Random();

	public static void main(String[] args) {
		String [] noms = {"dandrea,alex","tremblay, Thomas Neveur"};
		String [] logins = new String [noms.length];
		String [] passwords = new String [noms.length];
		for (int i=0;i<noms.length;i++) {
			passwords[i]=genererMDP();
			logins[i]=genererLogin(noms[i]);
			System.out.println(noms[i]+" "+logins[i]+" "+passwords[i]);
		}
		
		/*
		System.out.println(genererLogin("bouchard,david"));
		System.out.println(genererLogin("Ramirez, Alice"));
		System.out.println(genererLogin("Ramallah, Ali"));
		String [] password= {"Allo123#","allo", "allo#Alex0","Al1%"};
		for (int i=0;i<password.length;i++) {
			System.out.print(password[i]+" ");
			System.out.println(verifierMDP(password[i]));
		}
		for (int i=0;i<100;i++) {
			char a = lettreAuHasard(true);
			System.out.print(a);
			a = lettreAuHasard(false);
			System.out.print(a);
		}
		for (int i=0;i<10;i++) {
			String MDP = genererMDP();
			System.out.println(verifierMDP(MDP));
		}
		*/
		
		
	}

	public static String genererLogin(String nom) {
		String login, nomFamille,prenom;
		int placeEspace=0;
		int placeVirgule = nom.indexOf(",");
		placeEspace = nom.indexOf(" ");
		nomFamille = nom.substring(0, placeVirgule);
		if (placeEspace>0) {
			prenom = nom.substring(placeVirgule+2);
		}
		else {
			prenom = nom.substring(placeVirgule+1);
		}
		//System.out.println(prenom + " "+ nomFamille);
		login = nomFamille.substring(0,3)+ prenom.substring(0,3)+ compteur;
		login = login.toLowerCase();
		compteur = compteur +1;
		return login;
		}
	public static boolean verifierMDP(String MDP) {
		int l = MDP.length();
		boolean majuscule=false, minuscule=false, chiffre=false, caractereSpecial=false;
		if (l<8) {
			return false;
		}
		for(int i=0;i<l ;i++) {
			char a= MDP.charAt(i);
				if ((int) a >=65&& (int) a <=90) {
					majuscule=true;
				}
				if ((int) a >=97&& (int) a <=122) {
					minuscule=true;
				}
				if (((int) a >=33 && (int) a <=47)||
						((int) a >=58 && (int) a <=64)||
						((int) a >=91 && (int) a <=96)||
						((int) a >=123 && (int) a <=126)) {
					caractereSpecial=true;
				}
				if ((int) a >=48&& (int) a <=57) {
					chiffre=true;
				}
				if (majuscule==true&&minuscule==true&&caractereSpecial==true&&chiffre==true) {
					return true;
				}
		}
		return false;
	}
	public static char lettreAuHasard(boolean maj) {
		char lettre;
		if (maj==true) {
			lettre = (char) (r.nextInt(26)+65);
			return lettre;
		}
		else {
			lettre = (char) (r.nextInt(26)+97);
			return lettre;
		}
	}
	
	public static char signeAuHasard(boolean chiffre) {
		char lettre;
		if (chiffre==true) {
			lettre = (char) (r.nextInt(10)+48);
			return lettre;
		}
		else {
			lettre = (char) (r.nextInt(12)+47);
			return lettre;
		}	
	}
	
	public static String genererMDP() {
		int longueur = r.nextInt(7)+9;
		String MDP= "";
		while (verifierMDP(MDP)==false) {
			MDP="";
			for (int i= 0; i<longueur;i++) {
				char a;
				int choix = r.nextInt(2);
				boolean maj = r.nextBoolean();
				if (choix==1) {
					a= lettreAuHasard(maj);
				}
				else {
					a=signeAuHasard(maj);
				}
				MDP= MDP + a;
			}
		}
		return MDP;
	}
		
		
		
		
		
}
	
	
	
	

