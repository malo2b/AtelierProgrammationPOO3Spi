public class Rectangle extends FormeGeometrique2d {

    private int longueur; // Longueur en mm
    private int largeur; // Largeur en mm

    public Rectangle(int longueur, int largeur, String nom) {
        super(nom);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public int getLongueur() {
        return longueur;
    }

    public int getLargeur() {
        return largeur;
    }

    // Calcul surface d'un rectangle
    @Override
    public int calculerSurface() {
        return longueur * largeur;
    }

    // Calcul le perimetre d'un rectangle
    @Override
    public int calculerPerimetre() {
        return 2 * (longueur + largeur);
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Rectangle && super.equals(obj) && this.largeur == ((Rectangle)obj).getLargeur() && this.longueur == ((Rectangle)obj).getLongueur();
    }

    @Override
    public String toString() {
        return super.toString() + "\nLongueur : " + longueur + "\nLargeur : " + largeur;
    }

}
