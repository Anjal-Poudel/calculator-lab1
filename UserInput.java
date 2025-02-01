import java.util.Scanner;

public class UserInput {
    private Scanner scanner;

    public UserInput(Scanner scanner) {
        this.scanner = scanner;
    }

    public int getIntInput(String message) {
        System.out.print(message);
        return scanner.nextInt();
    }
}