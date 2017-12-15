import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            List<String> input = Files.readAllLines(Paths.get("test.txt"), Charset.defaultCharset());
            String[] init = input.get(0).split(" ");

            //Création Ferry

            Ferry ferry = new Ferry(init[0], Integer.parseInt(init[1]));

            for (int i = 2; i < init.length; i++){
                ferry.addPont(Integer.parseInt(init[i]));
            }

            //Embarquement



        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}