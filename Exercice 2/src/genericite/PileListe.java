package genericite;

class PileListe implements Pile {
    private Noeud sommet;

    public PileListe() {
        sommet = null;
    }

    public boolean estVide() {
        return (sommet == null);
    }

    public Object dernier() {
        return (Object) sommet.info;
    }

    public void empiler(Object o) {
        Noeud n = new Noeud();
        n.info = o;
        n.suivant = sommet;
        sommet = n;
    }

    public void depiler() {
        sommet = (Noeud) sommet.suivant;
    }
}