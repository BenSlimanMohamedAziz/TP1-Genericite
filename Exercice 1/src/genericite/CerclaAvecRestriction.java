package genericite;

public class CerclaAvecRestriction<T2 extends Point > {
	int rayon ; 
T2 centre ;
public CerclaAvecRestriction(int rayon, T2 centre) {
	super();
	this.rayon = rayon;
	this.centre = centre;
}
public int getRayon() {
	return rayon;
}
public void setRayon(int rayon) {
	this.rayon = rayon;
}
public T2 getCentre() {
	return centre;
}
public void setCentre(T2 centre) {
	this.centre = centre;
}
@Override
public String toString() {
	return "CerclaAvecRestriction [rayon=" + rayon + ", centre=" + centre + "]";
} 

}
