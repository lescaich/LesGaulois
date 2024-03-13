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
		Soldat milexcus = new Soldat("Milexcus",2);
		Soldat tullius_octopus = new Soldat("Tullius Octopus",2);
		
		// Création des sites
		Village village1 = new Village(vercingetorix);
		Camp camp1 = new Camp(minus);
		
		camp1.afficherListeSoldats();
		System.out.println();
		camp1.ajouterSoldat(brutus);
		camp1.afficherListeSoldats();
		System.out.println();
		camp1.ajouterSoldat(milexcus);
		camp1.afficherListeSoldats();
		System.out.println();
		camp1.ajouterSoldat(tullius_octopus);
		camp1.afficherListeSoldats();
		
	}
	
}
