package test_fonctionnel;

import personnages.Gaulois;
import personnages.Grade;
import personnages.Soldat;
import sites.Village;
import sites.Camp;

public class TestSites {

	public static void main(String[] args) {
		
		// Création des personnages 
		Gaulois vercingetorix = new Gaulois("Vercingétorix", 5);
		Soldat minus = new Soldat("Minus", Grade.CENTURION, 2);
		
		Gaulois agecanonix = new Gaulois("Agecanonix", 1);
		Gaulois assurancetourix = new Gaulois("Assurancetourix", 2);
		Gaulois asterix = new Gaulois("Astérix", 5);
		Gaulois obelix = new Gaulois("Obélix", 15);
		Gaulois prolix = new Gaulois("Prolix", 2);
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 5);
		
		Soldat brutus = new Soldat("Brutus", Grade.CENTURION, 5);
		Soldat milexcus = new Soldat("Milexcus", Grade.SOLDAT, 2);
		Soldat tulliusOctopus = new Soldat("Tullius Octopus", Grade.TESSERARIUS, 2);
		Soldat ballondebaudrus = new Soldat("Ballondebaudrus", Grade.OPTIO, 3);
		Soldat briseradius = new Soldat("Briseradius", Grade.SOLDAT, 4);
		Soldat chorus = new Soldat("Chorus", Grade.CENTURION, 4);
		
		// Création des sites
		Village village1 = new Village(vercingetorix);
		Camp camp1 = new Camp(minus);
		
		
		// Test des méthodes
		
		// Test ajouterSoldat ajouterVillageois
		System.out.println();
		
		camp1.ajouterSoldat(brutus);
		camp1.ajouterSoldat(milexcus);
		camp1.ajouterSoldat(tulliusOctopus);
		camp1.ajouterSoldat(ballondebaudrus);
		
		village1.ajouterVillageois(agecanonix);
		village1.ajouterVillageois(assurancetourix);
		village1.ajouterVillageois(asterix);
		village1.ajouterVillageois(obelix);
		village1.ajouterVillageois(prolix);
		
		// Test afficherVillageois afficherCamp
		System.out.println();
		
		village1.afficherVillageois();
		camp1.afficherCamp();
		
		// Test changerChef changerCommandent
		System.out.println();
		
		village1.changerChef(abraracourcix);
		System.out.println();
		camp1.changerCommandent(briseradius);
		camp1.changerCommandent(chorus);
		
	}
	
}
