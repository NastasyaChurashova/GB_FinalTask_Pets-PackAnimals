package src.model;

public class Pets extends Animals {
    private int quantity;

    private static int petCount = 0;

    public Pets() {
        super();
        petCount++;
    }

    public static int getPetCount() {
        return petCount;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
