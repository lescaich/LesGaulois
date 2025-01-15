package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	public static void main(String[] args) {
		
		Gaulois asterix = new Gaulois("Astérix", 8);
		//System.out.println(asterix.getNom());
		asterix.parler("Bonjour à tous");
		
		Romain minus = new Romain("Minus", 6);
		minus.parler("UN GAU... UN GAUGAU...");
	}
}
