public class Animals {
    private int id;
    protected String name;
    protected String birthdate;
    protected String colour;
    protected String breed;
    protected String owner;

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void helpHuman() {
        System.out.println(name + " is helping humans.");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
