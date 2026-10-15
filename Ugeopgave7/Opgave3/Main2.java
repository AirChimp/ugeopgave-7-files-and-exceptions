import java.io.FileNotFoundException;
import java.util.ArrayList;
public class Main2 {

    public static void main(String[] args) {

        FileIO io = new FileIO();

        try {
            ArrayList<String> lines =
                    io.readLines("data/menu.csv");

            for (String line : lines) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Fejl: Filen blev ikke fundet.");
        }
    }
}
