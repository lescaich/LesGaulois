package sites;

import personnages.Gaulois;

public class Village {
	
	private Gaulois chef;
	
	public Village(Gaulois chef) {
		super();
		this.chef = chef;
		chef.parler("Je suis un grand guerrier et je vais créer mon village ");
	}
	
	public Gaulois getChef() {
		return chef;
	}
	
}
