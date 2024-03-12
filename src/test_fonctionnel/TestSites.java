package test_fonctionnel;

import personnages.Gaulois;
import personnages.Soldat;
import sites.Village;
import sites.Camp;

public class TestSites {

	public static void main(String[] args) {
		
		// Création des personnages 
		Gaulois vercingetorix = new Gaulois("Vercingétorix",5);
		Soldat minus = new Soldat("Minus",2);
		
		Soldat brutus = new Soldat("Brutus",5);
		
		// Création des sites
		Village village1 = new Village(vercingetorix);
		Camp camp1 = new Camp(minus);
		
		camp1.afficherListeSoldats();
		camp1.ajouterSoldat(brutus);
		camp1.afficherListeSoldats();
		
		System.out.println(minus.getNom());
		System.out.println(brutus.getNom());
		
	}
	
}
