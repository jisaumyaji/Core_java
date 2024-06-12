public class SinglyLinkedList {

    // Node class to represent a single element in the list
    public static class Node {
      public int data;
      public Node next;
  
      public Node(int data) {
        this.data = data;
        this.next = null;
      }
      // this is a comment
    }
  
    private Node head; // Reference to the head node of the list
  
    // Constructor to create an empty linked list
    public SinglyLinkedList() {
      this.head = null;
    }
  
    // Method to add a new node to the end of the list
    public void addNode(int data) {
      Node newNode = new Node(data);
      if (head == null) {
        head = newNode;
        return;
      }
      Node currentNode = head;
      while (currentNode.next != null) {
        currentNode = currentNode.next;
      }
      currentNode.next = newNode;
    }
  
    // Method to print the data of each node in the list
    public void printList() {
      Node currentNode = head;
      while (currentNode != null) {
        System.out.print(currentNode.data + " -> ");
        currentNode = currentNode.next;
      }
      System.out.println("NULL");
    }
  
    // Method to get the size (number of elements) in the list
    public int size() {
      int count = 0;
      Node currentNode = head;
      while (currentNode != null) {
        count++;
        currentNode = currentNode.next;
      }
      return count;
    }
  
    // Main method for demonstration
    public static void main(String[] args) {
      SinglyLinkedList list = new SinglyLinkedList();
      list.addNode(10);
      list.addNode(20);
      list.addNode(30);
      System.out.println("List: ");
      list.printList(); // Output: List: 10 -> 20 -> 30 -> NULL
      System.out.println("Size of the list: " + list.size()); // Output: Size of the list: 3
    }
  }
  