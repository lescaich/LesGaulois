package sites;

import personnages.Grade;
import personnages.Soldat;

public class Camp {
	
	private Soldat commandent;
	private Soldat[] listeSoldats = new Soldat[80];
	
	public Camp(Soldat commandent) {
		super();
		this.commandent = commandent;
		/*for (int i=0; i < listeSoldats.length; i++) {
			listeSoldats[i] = null;
		}*/
		listeSoldats[0] = this.commandent;
		commandent.parler("Je suis en charge de créer un nouveau camp romain ");
	}

	public Soldat getCommandent() {
		return commandent;
	}
	
	public void afficherCamp() {
		System.out.println("Le camp dirigé par " + commandent.getNom() + " contient les soldats : ");
		for (int i=0; i < listeSoldats.length; i++) {
			Soldat soldat = listeSoldats[i];
			if (soldat != null && soldat != commandent) {
				System.out.println("- " + soldat.getNom());
			}
		}
		//System.out.println(listeSoldats.length);
	}

	public void setListeSoldats(Soldat[] listeSoldats) {
		this.listeSoldats = listeSoldats;
	}

	public boolean ajouterSoldat(Soldat nouvSoldat) {
		boolean isAjoute = false;
		for (int i=0; i < listeSoldats.length; i++) {
			//Soldat soldat = listeSoldats[i];
			if (listeSoldats[i] == null) {
				listeSoldats[i] = nouvSoldat;
				isAjoute = true;
				nouvSoldat.parler("Je mets mon épée au service de Rome dans le camp dirigé par " + commandent.getNom());
				return isAjoute;
			}
			else {
				isAjoute = false;
			}
		}
		commandent.parler("Désolé " + nouvSoldat.getNom() + " notre camp est complet !");
		return isAjoute;
	}
	
	public boolean changerCommandent(Soldat nouvCommandent) {
		boolean isChange = false;
		if (nouvCommandent != commandent) {
			if (nouvCommandent.getGrade() == Grade.CENTURION) {
				listeSoldats[0] = nouvCommandent;
				commandent = nouvCommandent;
				isChange = true;
				commandent.parler("Moi " + commandent.getNom() + " je prends la direction du camp romain.");
			}
			else {
				nouvCommandent.parler("Je ne suis pas suffisamment gradé pour prendre la direction du camp romain.");
			}
		}
		return isChange;
	}
	
}
