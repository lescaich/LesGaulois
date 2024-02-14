package personnages;

public class Romain extends Personnage {
	
	public Romain() {
		super(String nom, int force);
	}
	
	@Override
	protected String donnerAuteur() {
		return ("");
	}
}
