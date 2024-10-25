package src.view;

public class ConsoleView {
    public void printAnimalDetails(String name, String type, String birthdate, String commands) {
        System.out.println("Animal: " + name);
        System.out.println("Type: " + type);
        System.out.println("Birthdate: " + birthdate);
        System.out.println("Commands: " + commands);
    }

    public void printMenu() {
        System.out.println("--- Animal Registry Menu ---");
        System.out.println("1. Add a new animal");
        System.out.println("2. Show commands of an animal");
        System.out.println("3. Train animal new command");
        System.out.println("4. List animals by birthdate");
        System.out.println("5. Show Total Pets Count");
        System.out.println("6. Show Total Pack Animals Count");
        System.out.println("7. Show Total Animals Count");
        System.out.println("8. Exit");
        System.out.print("Choose an option: ");
    }

    public void printMessage(String message) {
        System.out.println(message);
    }
}