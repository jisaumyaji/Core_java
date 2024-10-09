import java.io.*;

public class Testofinputstream {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int sum = 0;

        System.out.println("Enter numbers to sum (enter '0' to finish):");

        while (true) {
            line = reader.readLine();
            if (line == null || line.equals("0")) {
                break;
            }
            try {
                sum += Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }

        System.out.println("Sum: " + sum);
    }
}