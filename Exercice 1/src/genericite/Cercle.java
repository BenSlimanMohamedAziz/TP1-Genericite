package genericite;

public class Cercle<T> {
int rayon ; 
Point centre ;
public Cercle(int rayon, Point centre) {
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
public Point getCentre() {
	return centre;
}
public void setCentre(Pointcolore centre) {
	this.centre = centre;
}
@Override
public String toString() {
	return "Cercle [rayon=" + rayon + ", centre=" + centre + "]";
}
}
