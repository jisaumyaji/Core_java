
import java.util.HashSet;
import java.util.Arrays;
public class HashMaptoOtherDataTypes {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,2,6,2,6,3,3,4,3,2,1};
        int arr2[]= {3,6,3,6,4,7,8,4,8,48,8,9,6,4,2,4,3,1};
        HashSet<Integer> set =new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        // System.out.println(set);
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
    System.out.println(set);
    Arrays.sort(set);
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
    // Arrays.sort(set);
    }
}
