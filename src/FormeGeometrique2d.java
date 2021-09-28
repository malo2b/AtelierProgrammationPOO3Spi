abstract public class FormeGeometrique2d extends FormeGeometrique {

    abstract public int calculerSurface();
    abstract public int calculerPerimetre();

    protected FormeGeometrique2d(String nom) {
        super(nom);
    }

    public boolean isBigger(FormeGeometrique2d pFormeGeometrique2d) {
        return super.isBigger(pFormeGeometrique2d) && this.calculerPerimetre() > pFormeGeometrique2d.calculerPerimetre();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof FormeGeometrique2d && super.equals(obj) && ((FormeGeometrique2d)obj).calculerPerimetre() == this.calculerPerimetre();
    }

    @Override
    public String toString() {
        return super.toString() + "\nPerimetre : " + calculerPerimetre();
    }

}
