package sites;

import personnages.Soldat;

public class Camp {
	
	private Soldat commandent;
	private int nbSoldats = 0;
	private Soldat[] listeSoldats = new Soldat[4];
	
	public Camp(Soldat commandent) {
		super();
		this.commandent = commandent;
		listeSoldats[0] = this.commandent;
		nbSoldats++;
		commandent.parler("Je suis en charge de créer un nouveau camp romain ");
	}

	public Soldat getCommandent() {
		return commandent;
	}
	
	public void afficherListeSoldats() {
		for (int i=0; i < nbSoldats; i++) {
			System.out.println(listeSoldats[i].getNom());
		}
		System.out.println(nbSoldats);
	}

	public void setListeSoldats(Soldat[] listeSoldats) {
		this.listeSoldats = listeSoldats;
	}

	public boolean ajouterSoldat(Soldat soldat) {
		boolean isAjoute = false;
		for (int i=0; i < nbSoldats; i++) {
			if (listeSoldats[i] == null) {
				listeSoldats[i] = soldat;
				nbSoldats++;
				isAjoute = true;
			}
		}
		return isAjoute;
	}
	
}
