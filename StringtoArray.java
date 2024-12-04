import java.util.Arrays;
public class StringtoArray {
    public static void main(String[] args) {
       String s = "this is my first interview";

    //    string to array conversion 
       String arr[] = s.split(" ");
  
    //    printing array : toString func is used to print array in the form of string that is human readable
       System.out.println(Arrays.toString(arr));

    //    array to string 

    String str = String.join(" ",arr);
    System.out.println(str);

    }
}
