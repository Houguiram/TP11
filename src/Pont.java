public class Pont {
    private int taille;
    private int emplacementsLibres;

    public Pont(int vtaille) {
        taille = vtaille;
        emplacementsLibres = taille;
    }

    public int getEmplacementsLibres() {
        return emplacementsLibres;
    }

    public void setEmplacementsLibres(int emplacementsLibres) {
        this.emplacementsLibres = emplacementsLibres;
    }
}
