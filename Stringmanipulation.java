import java.util.Arrays;

public class Stringmanipulation! {
    public static void main(String[] args){
        String s = "hello";
        char arr[] = s.toCharArray();
        int n = arr.length;
        char result[] = new char[n];
        for(int i=0; i<n-1; i++){
            result[i]=arr[n];
        }
        System.out.println(Arrays.toString(result));
    }
}
