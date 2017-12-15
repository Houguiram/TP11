import java.util.ArrayList;

public class Ferry {

    private ArrayList<Pont> ponts;
    private String nom;
    private int capacite;

    public Ferry(String vnom, int vcapacite) {
        ponts = new ArrayList<Pont>();
        nom = vnom;
        capacite = vcapacite;
    }

    public void addPont(int taille) {
        Pont newPont = new Pont(taille);
        ponts.add(newPont);
    }

    public void board(Vehicule vec) throws FerryFullException {
        vec.setPrixBillet(75 * vec.getTaille() + 15 * vec.getNombrePassagers());
        boolean stored = false;
        int i = 0;
        while (!stored || i < ponts.size()) {
            if (ponts.get(i).getEmplacementsLibres() >= vec.getTaille()) {
                ponts.get(i).setEmplacementsLibres(ponts.get(i).getEmplacementsLibres() - vec.getTaille());
                vec.setPont(ponts.get(i));
                stored = true;
            }
            i++;
        }
        if (!stored) {
            throw new FerryFullException();
        }

    }
}
