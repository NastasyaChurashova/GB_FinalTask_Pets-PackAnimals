import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AnimalRegistry {
    private ArrayList<Animals> animalList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();
        registry.run();
    }

    public void run() {
        boolean running = true;
        while (running) {
            System.out.println("\n--- Animal Registry Menu ---");
            System.out.println("1. Add a new animal");
            System.out.println("2. Show commands of an animal");
            System.out.println("3. Train animal new command");
            System.out.println("4. List animals by birthdate");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> addAnimal();
                case 2 -> showAnimalCommands();
                case 3 -> trainAnimal();
                case 4 -> listAnimalsByBirthdate();
                case 5 -> running = false;
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private void addAnimal() {
        System.out.println("Enter animal type (Dog, Cat, etc.): ");
        String type = scanner.nextLine().toLowerCase();
        System.out.println("Enter animal name: ");
        String name = scanner.nextLine();
        System.out.println("Enter animal birthdate (YYYY-MM-DD): ");
        String birthdate = scanner.nextLine();

        Animals animal;
            switch (type) {
                case "dog" -> animal = new Dog();
                case "cat" -> animal = new Cat();
                case "hamster" -> animal = new Hamster();
                case "horse" -> animal = new Horse();
                case "donkey" -> animal = new Donkey();
                case "camel" -> animal = new Camel();
                default -> {
                    System.out.println("Unknown animal type.");
                    return;
            }
            }
        animal.setName(name);
        animal.setBirthdate(birthdate);
        animalList.add(animal);
        System.out.println(name + " the " + type + " has been added.");
    }

    private void showAnimalCommands() {
        System.out.println("Enter animal name to show its commands: ");
        String name = scanner.nextLine();
        for (Animals animal : animalList) {
            if (animal.getName().equalsIgnoreCase(name)) {
                System.out.println("Commands for " + name + ": " + animal.getCommands());
                return;
            }
        }
        System.out.println("Animal not found.");
    }

    private void trainAnimal() {
        System.out.println("Enter animal name to train: ");
        String name = scanner.nextLine();
        for (Animals animal : animalList) {
            if (animal.getName().equalsIgnoreCase(name)) {
                System.out.println("Enter new command for " + name + ": ");
                String command = scanner.nextLine();
                animal.addCommand(command);
                System.out.println(name + " has learned the command: " + command);
                return;
            }
        }
        System.out.println("Animal not found.");
    }

    private void listAnimalsByBirthdate() {
        Collections.sort(animalList, (a1, a2) -> a1.getBirthdate().compareTo(a2.getBirthdate()));
        System.out.println("--- Animals sorted by birthdate ---");
        for (Animals animal : animalList) {
            System.out.println(animal.getName() + " (" + animal.getBirthdate() + ")");
        }
    }

    public ArrayList<Animals> getAnimalList() {
        return animalList;
    }

    public void setAnimalList(ArrayList<Animals> animalList) {
        this.animalList = animalList;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
}
