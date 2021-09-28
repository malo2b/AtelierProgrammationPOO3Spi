abstract public class FormeGeometrique3d extends FormeGeometrique {

    abstract public int calculerVolume();

    protected FormeGeometrique3d(String nom) {
        super(nom);
    }

    public boolean isBigger(FormeGeometrique3d pFormeGeometrique3d) {
        return super.isBigger(pFormeGeometrique3d) && this.calculerVolume() > pFormeGeometrique3d.calculerVolume();
    }

    @Override
    public String toString() {
        return super.toString() + "\nVolume : " + calculerVolume();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof FormeGeometrique3d && super.equals(obj) && ((FormeGeometrique3d)obj).calculerVolume() == this.calculerVolume();
    }

}
