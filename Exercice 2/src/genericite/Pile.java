package genericite;

interface Pile {
    public boolean estVide();

    public Object dernier();

    public void depiler();

    public void empiler(Object o);
}