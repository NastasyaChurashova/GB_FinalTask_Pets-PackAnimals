package src.model;

public class Cat extends Pets {
    protected String state = "protected";

    public void catchMice() {
        System.out.println(name + " is catching mice.");
    }
}
