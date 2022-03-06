package genericite;

public class CouleurRVB {
String couleur ; 
int rouge,vert,bleu;
public CouleurRVB(String couleur, int rouge, int vert, int bleu) {
	super();
	this.couleur = couleur;
	this.rouge = rouge;
	this.vert = vert;
	this.bleu = bleu;
}
public String getCouleur() {
	return couleur;
}
public void setCouleur(String couleur) {
	this.couleur = couleur;
}
public int getRouge() {
	return rouge;
}
public void setRouge(int rouge) {
	this.rouge = rouge;
}
public int getVert() {
	return vert;
}
public void setVert(int vert) {
	this.vert = vert;
}
public int getBleu() {
	return bleu;
}
public void setBleu(int bleu) {
	this.bleu = bleu;
}
@Override
public String toString() {
	return "CouleurRVB [couleur=" + couleur + ", rouge=" + rouge + ", vert="
			+ vert + ", bleu=" + bleu + "]";
}

}