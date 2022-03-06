package genericite;

public class Test {

	public static void main(String[] args) {
Point <Integer> p1 =new Point<>('k',1,2);
Point <Double> p2 =new Point<>('s',2.0,3.0);
Point <Integer> c =new PointColoreNG('s',2,3,"bleu");
Point <Integer> pc1 =new Pointcolore<>('s',2,3,"rouge");
Point <Double> pc2 =new Pointcolore<>('s',2.5,3.6,"blanc");
Cercle <Integer> c2 =new Cercle<>(50,p1);
CerclaAvecRestriction car1 =new CerclaAvecRestriction(100,p2);
CerclaAvecRestriction car2 =new CerclaAvecRestriction(30,pc2);

System.out.println(p1);
System.out.println(p2);
System.out.println(c);
System.out.println(pc1);
System.out.println(pc2);
System.out.println(c2);
System.out.println(car1);
System.out.println(car2);
	}

}