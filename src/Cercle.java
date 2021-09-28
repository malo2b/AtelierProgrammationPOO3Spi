public class Cercle extends FormeGeometrique2d {

    private int rayon; // Rayon en mm

    public Cercle(int rayon, String nom) {
        super(nom);
        this.rayon = rayon;
    }

    // Getter rayon
    public int getRayon() {
        return rayon;
    }

    // Retorurne le carre d'un entier
    public double carre(double v) {
        return v*v;
    }

    // Calcul surface d'un cercle
    @Override
    public int calculerSurface() {
        return (int)(Math.PI * carre(rayon));
    }

    // Calcul le perimetre d'un cercle
    @Override
    public int calculerPerimetre() {
        return (int)(rayon * 2 * Math.PI);
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Cercle && super.equals(obj) && this.rayon == ((Cercle)obj).getRayon();
    }

    @Override
    public String toString() {
        return super.toString() + "\nRayon : " + rayon;
    }

}
