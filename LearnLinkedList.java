public class LearnLinkedList {
    class Node{
        private int data;
        private Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
        public Node(int data, Node next){
            this.data = data;
            this.next = null;
        }
    }
    private static Node head;
    private static Node tail;
    // private static Node temp;

    public void addNodeFirst(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;
        if(head==tail){
            tail=head;
        }
    }
    public void addNodeLast(int data){
        Node node = new Node(data);
        if(head==tail){
            tail=head;
        }
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
        tail=node;
    }
    public void display(){
        // head = temp;
        Node temp=head;
        // System.out.println("inside display");
        while(temp!=null){
        
            // System.out.println("inside loop");
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    
    public static void main(String[] args) {
       LearnLinkedList obj = new LearnLinkedList();
       obj.addNodeFirst(10);
       obj.addNodeFirst(20);
       obj.addNodeFirst(30);
       obj.addNodeLast(50);
       obj.display(); 
    // System.out.println(obj.head.next.next.next);
    }

}
