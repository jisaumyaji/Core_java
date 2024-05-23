

public class ll { // Class name should be descriptive

    public static Node head; // Use Node class for clarity

    public static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // AddNode method with exception handling
    public static void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // PrintList method
    public static void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ll linkedList = new ll(); // Use LinkedList object
        ll.addNode(1);
        ll.addNode(2);
        ll.addNode(3);
        ll.printList(); // Output: 1 -> 2 -> 3 -> null
    }
}
