public class Ellipse extends FormeGeometrique2d {

    private int demiAxeMajeur;
    private int demiAxeMineur;

    public Ellipse(int demiAxeMajeur, int demiAxeMineur,String nom) {
        super(nom);
        this.demiAxeMajeur = demiAxeMajeur;
        this.demiAxeMineur = demiAxeMineur;
    }

    public int getDemiAxeMajeur() {
        return demiAxeMajeur;
    }

    public int getDemiAxeMineur() {
        return demiAxeMineur;
    }

    public int carre(int v) {
        return v*v;
    }

    // Calcul surface d'une elipse
    @Override
    public int calculerSurface() {
        return (int)(Math.PI * demiAxeMajeur * demiAxeMineur);
    }

    // Calcul le perimetre d'une elipse
    @Override
    public int calculerPerimetre() {
        return (int)(
            2 * Math.PI * Math.sqrt(
                (carre(demiAxeMajeur) + carre(demiAxeMineur)) / 2
            )
        );
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Ellipse && super.equals(obj) && this.demiAxeMajeur == ((Ellipse)obj).getDemiAxeMajeur() && this.demiAxeMineur == ((Ellipse)obj).getDemiAxeMineur();
    }

    @Override
    public String toString() {
        return super.toString() + "\nDemi Axe Majeur : " + demiAxeMajeur + "\nDemi Axe Mineur : " + demiAxeMineur;
    }

}
