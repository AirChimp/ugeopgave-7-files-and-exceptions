import java.util.ArrayList;

public class Main {


        public static String getItem(ArrayList<String> items, int index) {
            if (index < 0 || index >= items.size()) {
                throw new IllegalArgumentException(
                        "Indeks " + index + " er uden for range 0-" + (items.size() - 1)
                );
            }

            return items.get(index);
        }

        public static void main(String[] args) {
            ArrayList<String> items = new ArrayList<>();

            items.add("Cola");
            items.add("Fanta");
            items.add("Sprite");

            // Tester med et gyldigt indeks
            try {
                System.out.println(getItem(items, 1));
            } catch (IllegalArgumentException e) {
                System.out.println("Fejl: " + e.getMessage());
            }

            // Tester med et ugyldigt indeks
            try {
                System.out.println(getItem(items, 5));
            } catch (IllegalArgumentException e) {
                System.out.println("Fejl: " + e.getMessage());
            }
        }
    }
