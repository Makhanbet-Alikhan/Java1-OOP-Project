import java.util.Scanner; // Import the Scanner class to read input

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the keyboard
        Scanner scanner = new Scanner(System.in);

        // Ask the user for their name
        System.out.print("Enter your name: ");

        // Read the user's input
        String name = scanner.nextLine();

        // Print a greeting message
        System.out.println("Hello, " + name + "! Welcome to Java.");

        // Close the scanner
        scanner.close();
    }
}
