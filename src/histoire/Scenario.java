package histoire;

import personnages.Gaulois;
import personnages.Romain;

public class Scenario {
	
	public static void main(String[] args) { 
		 Gaulois asterix = new Gaulois("Ast�rix", 10);
		 Romain Minus = new Romain("Minus", 8);
		 asterix.parler("Bonjour � tous");
		 Minus.parler("UN GAU... UN GAUGAU");
		 asterix.frapper(Minus);
		 asterix.frapper(Minus);
		 asterix.frapper(Minus);

	 } 
	
}
