package genericite;

public class PointColoreNG extends Point <Integer>{
String couleur ; 

	public PointColoreNG(char nom, Integer abs, Integer ord , String couleur) {
		super(nom, abs, ord);
		this.couleur=couleur ; 
		
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	@Override
	public String toString() {
		
		return super.toString()+"pointcoloreNG [couleur=" + couleur + "]";
	}
	

}
