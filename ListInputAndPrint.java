//array list
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListInputAndPrint {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Create a List to store the input elements
        List<String> inputList = new ArrayList<>();

        // Prompt the user to enter the elements of the list
        System.out.println("Enter elements of the list (type 'exit' to finish):");

        // Keep taking input until the user types 'exit'
        while (true) {
            // Read the input from the user
            String input = scanner.nextLine();

            // Check if the user wants to exit
            if (input.equalsIgnoreCase("exit")) {
                break; // Exit the loop
            }

            // Add the input to the list
            inputList.add(input);
        }

        // Close the Scanner to prevent resource leak
        scanner.close();

        // Print the elements of the list
        System.out.println("Elements of the list:");
        for (String element : inputList) {
            System.out.println(element);
        }
    }
}
