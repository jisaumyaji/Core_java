import java.util.HashMap;
import java.util.HashSet;
import java.util.Arrays;
public class HashMap_leaning {
    public static void main(String[] args){
        // HashMap<Integer,Integer> map = new HashMap<>();
        // HashSet<Integer> set = new HashSet<>();
        HashMap<Integer,String> map2 = new HashMap<>();

        String str = "this is my first interview";
        String stringarray[] = str.split(" ");

        for(int i=0;i<stringarray.length;i++){
            map2.put(i+1,stringarray[i]);

        }
        System.out.println(map2);
        String[] map2values = map2.values().toArray(new String[0]);
        System.out.println(Arrays.toString(map2values));
        System.out.println("hello");
        
        // int arr[] = {1,2,9,3,4,8,5,7,6,1,2,3,4,5,6,7,8,9};
        // putting elements to hashmap
    //    for(int i=0;i<arr.length;i++){
    //     map.put(i+1,arr[i]);
    //    }
    //    System.out.println(map.size());
     
       //adding elements to hashset
    //    for(int i=0; i<arr.length;i++){
    //     set.add(arr[i]);
    //    }
    //    System.out.println("the size of the map is :"+ map.size());
    //    System.out.println("the set is :"+ set);
       
    //    System.out.println(map.keySet());
    // Integer[] keysArray = map.keySet().toArray(new Integer[0]);
    // for(int elements: keysArray){
    //     System.out.println(elements);
    // }
    // Arrays.sort(keysArray);
    // Integer[] values = map.values().toArray(new Integer[0]);
    // for(int elements:values){
    //     System.out.print(elements + " ");
    // }
    // Arrays.sort(values);
    // for(int elements: values){
    //     System.out.println(elements + " ");
    // }

    
    }
}
