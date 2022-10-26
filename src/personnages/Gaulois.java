package personnages;

 public class Gaulois  { 
	 private String nom; 
	 private int force; 
	 private int effetPotion = 1; 
	 private int nbTrophees;
	 private Equipements[] trophees = new Equipement[100];
	 
	 public Gaulois(String nom, int force) { 
		 this.nom = nom; 
		 this.force = force; 
	 } 
	 public String getNom() { 
		 return nom; 
	 } 
	 public void parler(String texte) { 
		 System.out.println(prendreParole() + "« " + texte + " »"); 
	 } 
//	 private String prendreParole() { 
//		 return "Le gaulois " + nom + " : "; 
	 
	 private String prendreParole() { 
		 return "Le gaulois " + nom + " : "; 
	 } 
//	 public void frapper(Romain romain) { 
//		 System.out.println(nom + " envoie un grand coup dans la mâchoire de " 
//				 + romain.getNom()); 
//		 romain.recevoirCoup(force / 3); 
//	 } 
	 
	 public void frapper(Romain romain) { 
		 System.out.println(nom + " envoie un grand coup dans la machoire de " 
				 + romain.getNom()); 
		 trophees = romain.recevoirCoup((force / 3)* effetPotion);
		 for(int i = 0; trophees != null && i < trophees.length; i++, nbTrophees++){
			 this.trophees[nbTrophees] = trophees[i];
	 } 
	 
	 //@Override 
	 //public String toString() { 
	 //	 return "Gaulois [nom=" + nom + ", force=" + force 
	//			 + ", effetPotion=" + effetPotion + "]"; 
	 //} 
		 
	 public void boirePotion(int forcePotion){
		 effetPotion += forcePotion;
		 parler("Merci Druide, je sens que ma force est " + forcePotion + " fois decuplee.");
	 }

         public void faireUneDonation( Musee musee){
                 String texte = " ";
                 while(nbTrophee>0){
                     nbTrophees -= 1
                     musee.donnerTrophees(this,trophee[nbTrophees]);
                     texte += "-" + trophee[nbTrophees].getNom() + "\n";
                     trophee[nbTrophees] = null; 
                     }
                 parler(" Je donne au musee tout mes trophees :" + texte );
         }
		 
	 public static void main(String[] args) { 
		 Gaulois asterix = new Gaulois("Asterix", 8);
		 System.out.println(asterix.nom); //
		 System.out.println(asterix.prendreParole()); //
		 Romain Minus = new Romain("Minus", 8);
		 System.out.println(asterix);
		 asterix.parler("blabla");
		 asterix.frapper(Minus);
		 asterix.boirePotion(6);
	 } 
	 
 }
