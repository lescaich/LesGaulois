package test_fonctionnel;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	public static void main(String[] args) {
		
		// Test Gaulois Romain Personnage (TP2)
		Gaulois asterix = new Gaulois("Astérix",8);
		//System.out.println(asterix.getNom());
		asterix.parler("Bonjour à tous");
		
		Romain minus = new Romain("Minus", 6);
		minus.parler(" UN GAU... UN GAUGAU...");
		
		/*for(int i=0; i<2; i++) {
			minus.recevoirCoup(3);
		}*/
		
		for(int i=0; i<3; i++) {
			asterix.frapper(minus);
			minus.frapper(asterix);
		}
		
		System.out.println();
		
		
		// Test Druide (TP3)
		Druide panoramix = new Druide("Panoramix", 2);
		panoramix.fabriquerPotion(3);
		
		
	}
	
}
