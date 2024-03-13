package test_fonctionnel;

import personnages.Gaulois;
import personnages.Grade;
import personnages.Soldat;
import sites.Village;
import sites.Camp;

public class TestSites {

	public static void main(String[] args) {
		
		// Création des personnages 
		Gaulois vercingetorix = new Gaulois("Vercingétorix",5);
		Soldat minus = new Soldat("Minus", Grade.CENTURION, 2);
		
		Soldat brutus = new Soldat("Brutus", Grade.CENTURION, 5);
		Soldat milexcus = new Soldat("Milexcus", Grade.SOLDAT, 2);
		Soldat tullius_octopus = new Soldat("Tullius Octopus", Grade.TESSERARIUS, 2);
		Soldat ballondebaudrus = new Soldat("Ballondebaudrus", Grade.OPTIO, 3);
		
		// Création des sites
		Village village1 = new Village(vercingetorix);
		Camp camp1 = new Camp(minus);
		
		System.out.println();
		
		camp1.ajouterSoldat(brutus);
		camp1.ajouterSoldat(milexcus);
		camp1.ajouterSoldat(tullius_octopus);
		camp1.ajouterSoldat(ballondebaudrus);
		
	}
	
}
