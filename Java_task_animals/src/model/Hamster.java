package src.model;

public class Hamster extends Pets {
    protected String state = "protected";

    public void roll() {
        System.out.println(name + " is rolling in the ball.");
    }
}
