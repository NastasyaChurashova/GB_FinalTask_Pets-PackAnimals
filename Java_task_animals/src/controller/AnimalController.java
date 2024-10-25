package src.controller;

import src.model.*;
import src.view.ConsoleView;

import java.util.*;

public class AnimalController {
    private final List<Animals> animalList;
    private final ConsoleView view;
    private final Scanner scanner = new Scanner(System.in);
    private Object animal;

    public AnimalController(ConsoleView view) {
        this.view = view;
        animalList = new ArrayList<>();
    }

public void addAnimal() {
        view.printMessage("Enter animal type (Dog, Cat, Hamster, Horse, Donkey, Camel): ");
        String type = scanner.nextLine().toLowerCase();
        view.printMessage("Enter animal name: ");
        String name = scanner.nextLine();
        view.printMessage("Enter animal birthdate (YYYY-MM-DD): ");
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
                 view.printMessage("Unknown animal type.");
                 return;
             }
         }
        animal.setName(name);
        animal.setBirthdate(birthdate);
        animalList.add(animal);
        view.printMessage(name + " the " + type + " has been added.");
    }

    public void showCommands() {
        view.printMessage("Enter animal name to show its commands: ");
        String name = scanner.nextLine();
        for (Animals animal : animalList) {
            if (animal.getName().equalsIgnoreCase(name)) {
                view.printAnimalDetails(animal.getName(), animal.getClass().getSimpleName(), animal.getBirthdate(), animal.getCommands().toString());
                return;
            }
        }
        view.printMessage("Animal not found.");
    }

    public void trainAnimal() {
        view.printMessage("Enter animal name to train: ");
        String name = scanner.nextLine();
        for (Animals animal : animalList) {
            if (animal.getName().equalsIgnoreCase(name)) {
                view.printMessage("Enter new command to train: ");
                String command = scanner.nextLine();
                animal.addCommand(command);
                view.printMessage(command + " has learned the command: " + name);
                return;
            }
        }
        view.printMessage("Animal not found.");
    }

    public void listAnimalsByBirthdate() {
        animalList.sort(Comparator.comparing(Animals::getBirthdate));
        for (Animals animal : animalList) {
            view.printAnimalDetails(animal.getName(), animal.getClass().getSimpleName(), animal.getBirthdate(), animal.getCommands().toString());
        }
    }

    public void showMenu() {
        while (true) {
            view.printMenu(); // Предполагается, что метод printMenu() уже реализован в ConsoleView
            int option = scanner.nextInt();
            scanner.nextLine();  // Очистить буфер
            switch (option) {
                case 1:
                    addAnimal();
                    break;
                case 2:
                    showCommands();
                    break;
                case 3:
                    trainAnimal();
                    break;
                case 4:
                    listAnimalsByBirthdate();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;  // Завершает метод, выходя из цикла
                default:
                    view.printMessage("Invalid option. Try again.");
            }
        }
    }
}