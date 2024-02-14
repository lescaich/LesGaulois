package personnages;

public class Gaulois {
	
	private String nom; 
	public int force;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix",8);
		System.out.println(asterix.getNom());
	}
	
	public void parler(String texte) {
		String chaine = "Le gaulois " + nom + " : \" " + texte + " \". ";
		System.out.println(chaine);
	}
	
	public void frapper(Romain romain) {
		//String chaine = nom + " envoie un grand coup dans la mâchoire de " + romain.getNom();
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		romain.recevoirCoup(force/3);
	}
}
