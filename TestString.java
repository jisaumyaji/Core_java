import java.util.Arrays;
public class TestString {

    public static void main(String[] args){
        String s = "hello"; int m;
        //String to charcter array
        char arr[] = s.toCharArray();
        int n = arr.length;
        m=n;
        char result[] = new char[n];
        for(int i=0; i<m; i++){
            result[i]=arr[n-1];
            n--;
        }
        // String str = new String(result);
        // System.out.println(str);

        System.out.println(Arrays.toString(result));
        
    }
}
