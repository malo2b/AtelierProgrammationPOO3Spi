public class Cylindre extends FormeGeometrique3d{

    private Cercle hCercle; // Instance d'un objet cercle
    private int hauteur; // Hauteur en mm

    public Cylindre(String nom, int rayon, int hauteur) {
        super(nom);
        this.hauteur = hauteur;
        hCercle = new Cercle(rayon, "cercle_cylindre");
    }

    // Retourne la surface d'un cylindre
    @Override
    protected int calculerSurface() { // Retourne la surface d'un cylindre en mm2
        return 2 * hCercle.calculerSurface() + hCercle.calculerPerimetre() * hauteur;
    }

    // Retourne le volume en mm3 d'un cylindre
    @Override
    public int calculerVolume() {
        return hCercle.calculerSurface() * hauteur;
    }

    @Override
    public String toString() {
        return super.toString() + "\nRayon : " + hCercle.getRayon() + "\nHauteur : " + hauteur;
    }

}
