import java.util.HashMap;
public class Map {
    public static void main(String[] args){
        HashMap<Integer, Integer> map = new HashMap<>();
        int arr[] = {1,2,3,4,5,1,2,3,4,5,6};
        for(int i=0;i<arr.length;i++){
            map.put(i+1,arr[i]);
        }
        System.out.println(map);
       
    }
}
