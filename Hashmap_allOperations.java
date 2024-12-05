import java.util.HashMap;
public class Hashmap_allOperations {
    public static void main(String args[]){
       HashMap<Integer,String> map = new HashMap<>();
       map.put(1,"Mango");
       map.put(2,"Grapes");
       map.put(3,"Apple");
       map.put(4,"Oranges");
       map.put(5,"Banana");
       System.out.println(map);
    //    map.get prints the values of the key value pair 
    //    System.out.println(map.get(1));
    //    System.out.println(map.get(2));
    //    System.out.println(map.get(3));
    //    System.out.println(map.get(4));
    //    System.out.println(map.get(5));

    // System.out.println(map.size());

// int n = map.size();
// for (int i=0;i<n;i++){
//     System.out.print(map.get(1+i)+" ");
// }
    
// System.out.println(map.containsKey(4));
System.out.println(map.containsValue("Banana"));
      System.out.println(map.isEmpty());


      map.remove(2);
      System.out.println(map);

System.out.println(map.keySet());
System.out.println(map.values());


    }

}
