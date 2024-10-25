package src.model;

public class Donkey extends PackAnimals {
    public Donkey() {
        super();
    }
    protected String state = "protected";

    public void transportWeight() {
        System.out.println(name + " is transporting weight.");
    }
}
