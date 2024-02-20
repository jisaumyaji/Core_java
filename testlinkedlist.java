// import java.util.*;
public class testlinkedlist {
    int data;
    testlinkedlist next;
    public testlinkedlist(int data){
        this.data = data;
        this.next = null;
    }
    public static void main(String[] args) {
        try{
  // System.out.println("hello");
  testlinkedlist node1 = new testlinkedlist(10);
  testlinkedlist node2 = new testlinkedlist(30);
  node1=node2;
  // System.out.println(node1.data);
  System.out.println(node1.next.data);
  // System.out.println(node2.data);

        }
        catch(Exception e){
            System.out.println("there is an error");
        }
       
    }
}
