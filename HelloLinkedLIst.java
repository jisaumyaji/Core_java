class Node {
    int data;
    Node next;
    
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    
    // Method to add nodes to the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    
    // Method to find the middle of the linked list
    public Node findMiddle() {
        Node slow = head;
        Node fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;       // Move slow by one
            fast = fast.next.next;  // Move fast by two
        }
        
        return slow;  // slow will be at the middle
    }
    
    // Print the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class HelloLinkedLIst {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.printList();  // Output: 10 -> 20 -> 30 -> 40 -> 50 -> null
        
        Node middle = list.findMiddle();
        System.out.println("Middle element is: " + middle.data);  // Output: Middle element is: 30
    }
}