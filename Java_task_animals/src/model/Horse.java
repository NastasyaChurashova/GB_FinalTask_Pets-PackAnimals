package src.model;

public class Horse extends PackAnimals {
    protected String state = "protected";

    public void takePartInRace() {
        System.out.println(name + " is taking part in the race.");
    }
}