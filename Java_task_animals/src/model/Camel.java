package src.model;

public class Camel extends PackAnimals {
    public Camel() {
        super();
    }
    protected String state = "protected";

    public void transportWeight() {
        System.out.println(name + " is transporting weight.");
    }
}
