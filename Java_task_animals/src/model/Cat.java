package src.model;

public class Cat extends Pets {
    public Cat() {
        super();
    }
    protected String state = "protected";

    public void catchMice() {
        System.out.println(name + " is catching mice.");
    }
}
