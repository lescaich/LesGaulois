package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	public static void main(String[] args) {
		
		Gaulois asterix = new Gaulois("Astérix",8);
		//System.out.println(asterix.getNom());
		asterix.parler("Bonjour à tous");
		
		Romain minus = new Romain("Minus", 6);
		minus.parler(" UN GAU… UN GAUGAU…");
		
		/*for(int i=0; i<2; i++) {
			minus.recevoirCoup(3);
		}*/
		
		for(int i=0; i<3; i++) {
			asterix.frapper(minus);
			minus.frapper(asterix);
		}
		//System.out.println(7/3);
		
	}
	
}
