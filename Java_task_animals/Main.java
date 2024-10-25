import src.controller.AnimalController;
import src.view.ConsoleView;

public class Main {
    public static void main(String[] args) {
        ConsoleView view = new ConsoleView();
        AnimalController controller = new AnimalController(view);
        controller.showMenu();
    }
}