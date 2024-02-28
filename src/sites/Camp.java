package sites;

import personnages.Soldat;

public class Camp {
	
	private Soldat commandent;
	
	public Camp(Soldat commandent) {
		super();
		this.commandent = commandent;
		commandent.parler("Je suis en charge de créer un nouveau camp romain ");
	}

	public Soldat getCommandent() {
		return commandent;
	}
	
}
