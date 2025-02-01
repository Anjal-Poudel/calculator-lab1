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

    public int[] getTwoNumbers() {
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        return new int[]{num1, num2};
    }
}