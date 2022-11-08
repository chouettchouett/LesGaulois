package personnages;

public class Musee {
	private Trophee[] tableauTrophee = new Trophee[200];
	private int nbTrophee = 0;
	
	public void donnerTrophee(Gaulois gaulois,Equipement equipement) {
		Trophee trophee = new Trophee(gaulois,equipement);
		tableauTrophee[nbTrophee] = trophee;
		nbTrophee ++;
	}
	
	public String extraireInstructionCaml() {
		String texte = "let musee = [\n";
		for (int i=0;i<nbTrophee;i++) {
			texte +="\"";  // convention pour mettre les " " dans le texte : \"  donc -> " \" " quand on as déjà utilisé "" pour autre chose
			texte += tableauTrophee[i].donnerNom();
			texte += "\", \"";
			texte += tableauTrophee[i].getEquipement().toString();
			texte += "\"";
			if (i==nbTrophee-1) texte += ";";
			texte += "\n";
		}
		texte += "]";
		return texte;
	}
}
// origine de ma compréhension pour mettre les "" et le , ainsi que le \n 

//Imagine you are designing a programming language. You decide that Strings are enclosed in quotes ("Apple"). 
//Then you hit your first snag: how to represent quotation marks since you've already used them ? 
//Just out of convention you decide to use \" to represent quotation marks. 
//Then you have a second problem: how to represent \ ? Again, out of convention you decide to use \\ instead. 
//Thankfully, the process ends there and this is sufficient. 
//You can also use what is called an escape sequence to represent other characters such as the carriage return (\n).
