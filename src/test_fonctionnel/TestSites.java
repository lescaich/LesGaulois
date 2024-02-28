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
		
		// Création des sites
		Village village1 = new Village(vercingetorix);
		Camp camp1 = new Camp(minus);
		
	}
	
}
