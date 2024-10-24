public class Main {
    public static void main(String[] args) {
        Dog Sharik = new Dog();
        Sharik.setId(1);
        Sharik.name = "Sharik";
        Sharik.birthdate = "2022-11-10";
        Sharik.guardHouse();
        Sharik.eat();
        Sharik.sleep();

        Cat Murzik = new Cat();
        Murzik.setId(2);
        Murzik.name = "Murzik";
        Murzik.catchMice();
        Murzik.eat();

        Horse Mimi = new Horse();
        Mimi.setId(3);
        Mimi.name = "Mimi";
        Mimi.takePartInRace();
        Mimi.helpHuman();
    }
}
