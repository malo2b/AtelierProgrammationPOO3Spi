abstract public class FormeGeometrique {

    private static int nbrInstances = 0;
    protected final String identifiant;

    protected FormeGeometrique(String nom) {
        nbrInstances++;
        identifiant = nom + "_" + nbrInstances;
    }

    abstract protected int calculerSurface();

    @Override
    public String toString() {
        return "\nForme : " + identifiant + "\nDe type : " + getClass().getName() + "\nSurface : " + calculerSurface();
    }

    @Override
    public boolean equals(Object obj) {
        return obj != null && obj instanceof FormeGeometrique && this.calculerSurface() == ((FormeGeometrique)obj).calculerSurface();
    }

    public boolean isBigger(FormeGeometrique pFormeGeometrique) {
        return this.calculerSurface() > pFormeGeometrique.calculerSurface();
    }

}
