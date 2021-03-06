import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        float sommeTickets = 0;
        try {
            List<String> input = Files.readAllLines(Paths.get("test.txt"), Charset.defaultCharset());
            String[] init = input.get(0).split(" ");

            //Création Ferry

            Ferry ferry = new Ferry(init[0], Integer.parseInt(init[1]));

            for (int i = 2; i < init.length; i++) {
                ferry.addPont(Integer.parseInt(init[i]));
            }

            //Création ArrayList de véhicules

            ArrayList<Vehicule> vehicules = new ArrayList<Vehicule>();

            for (int i = 1; i < input.size() - 1; i++) {
                String[] line = input.get(i).split(" ");
                if (line[0].equals("V")) {
                    vehicules.add(new Voiture(Integer.parseInt(line[1])));
                } else if (line[0].equals("B")) {
                    vehicules.add(new Bus(Integer.parseInt(line[1]), Integer.parseInt(line[2])));
                } else {
                    throw new BadInputException();
                }
            }

            //Embarquement

            for (int i = 1; i < vehicules.size(); i++) {
                ferry.board(vehicules.get(i));
                sommeTickets += vehicules.get(i).getPrixBillet();
            }

        } catch (IOException e) {
            System.out.println("Impossible de lire le fichier d'entrée");
        } catch (FerryFullException e) {
            System.out.println("Le ferry est plein !");
        } catch (BadInputException e) {
            System.out.println("Mauvaise entrée de véhicule");
        }
        System.out.println("Somme des tickets : " + sommeTickets + "€");

    }


}