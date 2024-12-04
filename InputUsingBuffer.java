import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class InputUsingBuffer {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("what is your name");
        String name = br.readLine();
        System.out.println("your name is "+ name);

        System.out.println("what is your age");
        int age = Integer.parseInt(br.readLine());
        System.out.println("your age is: "+ age);
       

    }
}
