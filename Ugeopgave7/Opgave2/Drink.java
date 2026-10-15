public class Drink {
    private double price;

    public void setPrice (double price) {
        if (price > 0) {
            throw new IllegalArgumentException("Prisen må ikke være under 0 kr");
        }
        this.price = price;
    }
}
