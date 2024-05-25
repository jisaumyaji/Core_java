// import java.util.*;

public class LinkedListImplementation {
    public static class NewNode{
        public int data;
        public NewNode next;
        public NewNode(int data){
            this.data = data;
            this.next=null;
        }
        
    }
    public LinkedListImplementation(){
        this.head=null;
    }
    public NewNode head;
    public void addNode(int data){
        NewNode node = new NewNode(data);
        if(head==null){
            head=node;
        }
        NewNode CurrentNode  = head;
        while(CurrentNode.next!=null){
            CurrentNode= CurrentNode.next;
        }
        CurrentNode.next=node;
        return;
    }
    public void printList(){
         NewNode current = head;
    if (current == null) { 
        System.out.println("List is empty.");
        return;
    }

    while (current != null) {
        System.out.print(current.data + " -> ");
        current = current.next;
    }
    System.out.println("null");
    }
    public static void main(String[] args) {
        LinkedListImplementation node1 = new LinkedListImplementation();
        node1.addNode(1);
        node1.addNode(2);
        node1.addNode(3);
        node1.printList();

    }

}
