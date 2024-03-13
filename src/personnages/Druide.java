package personnages;

import java.security.SecureRandom;
import java.util.Random;

public class Druide extends Gaulois {
	
	private int dosesPotion = 0;
	private int forcePotion = 0;
	private Random random;
	
	public Druide(String nom, int force) {
		super(nom, force);
		try {
			random = SecureRandom.getInstanceStrong();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public int getDosesPotion() {
		return dosesPotion;
	}

	public int getForcePotion() {
		return forcePotion;
	}

	public boolean fabriquerPotion(int nbDoses) {
		boolean isFabriquee = false;
		if (nbDoses > 0) {
			dosesPotion = nbDoses;
			forcePotion = random.nextInt(2,8);
			parler("J'ai concocté " + dosesPotion + " doses de potion magique. Elle a une force de " + forcePotion + ".");
			isFabriquee = true;
		}
		return isFabriquee;
	}

	public Random getRandom() {
		return random;
	}
	
}
