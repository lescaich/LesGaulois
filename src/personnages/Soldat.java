package personnages;

public class Soldat extends Romain {
	
	private Grade grade;
	
	public Soldat(String nom, Grade grade, int force) {
		super(nom, force);
		this.grade = grade;
	}
	
}
