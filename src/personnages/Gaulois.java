<<<<<<< HEAD
=======
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
		 System.out.println(nom + " envoie un grand coup dans la mâchoire de " 
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
		 
	 public static void main(String[] args) { 
		 Gaulois asterix = new Gaulois("Astérix", 8);
		 System.out.println(asterix.nom); //
		 System.out.println(asterix.prendreParole()); //
		 Romain Minus = new Romain("Minus", 8);
		 System.out.println(asterix);
		 asterix.parler("blabla");
		 asterix.frapper(Minus);
		 asterix.boirePotion(6);
	 } 
	 
 }
 
>>>>>>> e6099c59ef68f09f42008cf6549fdf4c2af78d34
