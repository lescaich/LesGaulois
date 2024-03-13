package sites;

import personnages.Gaulois;

public class Village {
	
	private Gaulois chef;
	private Gaulois[] listeGaulois = new Gaulois[5];
	
	public Village(Gaulois chef) {
		super();
		this.chef = chef;
		listeGaulois[0] = this.chef;
		chef.parler("Je suis un grand guerrier et je vais créer mon village ");
	}
	
	public Gaulois getChef() {
		return chef;
	}
	
	public void afficherVillageois() {
		System.out.println("Le village de " + chef.getNom() + " est habité par : ");
		for (int i=0; i < listeGaulois.length; i++) {
			Gaulois gaulois = listeGaulois[i];
			if (gaulois != null && gaulois != chef) {
				System.out.println("- " + gaulois.getNom());
			}
		}
	}
	
	public boolean ajouterVillageois(Gaulois nouvGaulois) {
		boolean isAjoute = false;
		for (int i=0; i < listeGaulois.length; i++) {
			if (listeGaulois[i] == null) {
				listeGaulois[i] = nouvGaulois;
				isAjoute = true;
				chef.parler("Bienvenue " + nouvGaulois.getNom() + " !");
				return isAjoute;
			}
			else {
				isAjoute = false;
			}
		}
		chef.parler("Désolé " + nouvGaulois.getNom() + " mon village est déjà bien rempli.");
		return isAjoute;
	}
	
}
