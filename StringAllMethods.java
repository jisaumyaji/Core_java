import java.util.Arrays;

public class StringAllMethods {
    public static void main(String[] args){
        String s = "this is my first interview";
        String arr[] = s.split(" ");
        // for(int i = 0;i<arr.length;i++){
        //    System.out.println(arr[i]);
        // }
        arr[3]="second";    
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println(Arrays.toString(arr));
        System.out.println(String.join(" ",arr));
    }
}
