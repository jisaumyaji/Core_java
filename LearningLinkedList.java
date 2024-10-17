public class LearningLinkedList {
        // Inner class Node
        private class Node {
            int data;
            Node next;
    
            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }
    
        private Node head;
    
        // Adding a node at the end
        public void add(int data) {
            Node newNode = new Node(data);
            System.out.println(head);
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
    
        // Display all nodes
        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    
        public static void main(String[] args) {
            LearningLinkedList list = new LearningLinkedList();
            // list.add(10);
            // list.add(20);
            // list.add(30);
            // list.display(); // Output: 10 20 30
        }
    }
    

