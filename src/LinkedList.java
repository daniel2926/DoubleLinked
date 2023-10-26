public class LinkedList {
    private Node head; // Field pointing to the first node
    private Node tail;
    private int size = 0;
    private class Node{
        private Object data; // Field where data will be stored
        private Node next; // Field pointing to the next node
        public Node(Object input) {
            this.data = input;
            this.next = null;
        }
        // A function to print and check the contents of a node
        public String toString(){
            return String.valueOf(this.data);

        } }
    public void addFirst(Object input){
// Create a node.
        Node newNode = new Node(input);
// Designates the head as the next node of the new node.
        newNode.next = head;
// Specifies a new node as the head.
        head = newNode;
        size++;
        if(head.next == null){
            tail = head;
        }
    }
}
