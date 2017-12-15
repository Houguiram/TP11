public abstract class Vehicule {
    private int taille;
    private float prixBillet;
    private Pont pont;
    private int nombrePassagers;

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public float getPrixBillet() {
        return prixBillet;
    }

    public void setPrixBillet(float prixBillet) {
        this.prixBillet = prixBillet;
    }

    public Pont getPont() {
        return pont;
    }

    public void setPont(Pont pont) {
        this.pont = pont;
    }

    public int getNombrePassagers() {
        return nombrePassagers;
    }

    public void setNombrePassagers(int nombrePassagers) {
        this.nombrePassagers = nombrePassagers;
    }
}
