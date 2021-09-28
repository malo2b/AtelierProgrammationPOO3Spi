public class Sphere extends FormeGeometrique3d{

    private int rayon; // Rayon en mm

    public Sphere(String nom, int rayon) {
        super(nom);
        this.rayon = rayon;
    }

    // Retourne la surface d'un cylindre  4 × π × R2.
    @Override
    protected int calculerSurface() { // Retourne la surface d'un cylindre en mm2
        return (int)(4 * Math.PI * Math.pow(rayon, 2));
    }

    // Retourne le volume en mm3 d'un cylindre
    @Override
    public int calculerVolume() {
        return (int)(4 * Math.PI * Math.pow(rayon, 3) / 3);
    }

    @Override
    public String toString() {
        return super.toString() + "\nRayon : " + rayon;
    }

}
