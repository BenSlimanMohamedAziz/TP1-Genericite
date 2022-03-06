package genericite;

public class Pointcolore<T,T2> extends Point<T>  {
	private T2 couleur ; 

	

	public Pointcolore(char nom, T abs, T ord, T2 couleur) {
		super(nom, abs, ord);
		this.couleur = couleur;
	}

	public T2 getCouleur() {
		return couleur;
	}

	public void setCouleur(T2 couleur) {
		this.couleur = couleur;
	}

	@Override
	public String toString() {
		return super.toString()+ "Pointcolore [couleur=" + couleur + "]";
	}
 
}
	