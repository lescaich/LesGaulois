package personnages;

public abstract class Personnage {

	private String nom;
	public int force;

	public Personnage(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		String chaine = "Le " + this.donnerAuteur() + nom + " : \" " + texte + " \". ";
		System.out.println(chaine);
	}
	
	protected abstract String donnerAuteur();
	
	public void frapper(Personnage adversaire) {
		if (force > 0) {
			System.out.println("Le " + this.donnerAuteur() + nom + " donne un grand coup au " + adversaire.donnerAuteur() + adversaire.getNom() + ". ");
			adversaire.recevoirCoup(force/3);
		}
	}
	
	public void recevoirCoup(int forceCoup) {
		force -=  forceCoup;
		if (force <= 0) {
			force = 0;
			parler("J’abandonne… ");
		}
		else {
			parler("Aïe ! ");
		}
	}
}