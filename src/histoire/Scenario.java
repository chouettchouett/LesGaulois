package personnages;

public class Scenario {
	
	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix",5,10);
		Gaulois asterix = new Gaulois("Asterix", 10);
		Gaulois Obelix = new Gaulois("Obelix", 25);
		Romain Minus = new Romain("Minus", 6);
		panoramix.parler("Je vais aller preparer une petite potion..." );
		panoramix.preparerPotion();
		panoramix.booster(Obelix);
		Obelix.parler("Par Benelos, ce n'est pas juste!");
		panoramix.booster(asterix);
		asterix.parler("Bonjour à tous");
		Minus.parler("UN GAU... UN GAUGAU");
		
		while (minus.getForce() > 0) {
			asterix.frapper(minus);
		}
	}

}

