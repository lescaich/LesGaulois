package personnages;

public class Romain {
	
	private String nom; 
	public int force;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		String chaine = "Le romain " + nom + " : \" " + texte + " \". ";
		System.out.println(chaine);
	}
	
}
