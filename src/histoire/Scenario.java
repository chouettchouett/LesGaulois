package histoire;

import personnages.Gaulois;
import personnages.Romain;

public class Scenario {
	
	public static void main(String[] args) { 
		 Gaulois asterix = new Gaulois("Astérix", 10);
		 Romain Minus = new Romain("Minus", 8);
		 asterix.parler("Bonjour à tous");
		 Minus.parler("UN GAU... UN GAUGAU");
		 asterix.frapper(Minus);
		 asterix.frapper(Minus);
		 asterix.frapper(Minus);

	 } 
	
}
