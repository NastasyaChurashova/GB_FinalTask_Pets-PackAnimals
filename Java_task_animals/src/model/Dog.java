package src.model;

public class Dog extends Pets {
    protected String state = "protected";

    public void guardHouse() {
        System.out.println(name + " is guarding the house.");
    }
}
