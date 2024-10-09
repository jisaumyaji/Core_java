import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Buffer_reader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Read the number of test cases
        int testCases = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < testCases; i++) {
            // Read a line of input
            String[] numbers = br.readLine().split(" ");
            
            // Parse the two numbers
            int num1 = Integer.parseInt(numbers[0]);
            int num2 = Integer.parseInt(numbers[1]);
            
            // Output their sum
            System.out.println(num1 + num2);
        }
    }
}
