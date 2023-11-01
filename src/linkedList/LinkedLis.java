package linkedList;

import java.util.ListIterator;

public class LinkedLis {
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

    public void addLast(Object input){
        Node newNode = new Node(input); // Create a node.
// If there are no nodes in the list, use the method to add the first node.
        if(size == 0){
            addFirst(input);
        } else {
            tail.next = newNode; // Specifies the node created as the
//next node after the last node.

            tail = newNode; // Update the last node.
            size++; // Increases the number of elements by 1.

        } }
    Node node(int index) {
        Node x = head;
        for (int i = 0; i < index; i++)
            x = x.next;
        return x;
    }

    public void add(int k, Object input){
// If k is 0, addFirst is used because it is added to the first node.
        if(k == 0){
            addFirst(input);
        } else {
            Node temp1 = node(k-1);
            Node temp2 = temp1.next; // Specify the kth node as temp2.
            Node newNode = new Node(input); // Creates a new node.
            temp1.next = newNode; // Specifies a new node as the next node of temp1.
            newNode.next = temp2; // Specify temp2 as the next node for the new node.
            size++;
// If there is no next node to the new node,
// the new node is designated as tail because it is the last node.
            if(newNode.next == null){
                tail = newNode;

            } }}
    public String toString() {
// If there is no node, it returns [].
        if(head == null){
            return "[]";
        }
// Start searching.
        Node temp = head;
        String str = "[";
// The loop is executed until there is no next node.
// The last node has no next node, so exclude it.
        while(temp.next != null){
            str += temp.data + ",";
            temp = temp.next;
        }
// Includes the last node in the output.
        str += temp.data;
        return str+"]";
    }

    public Object removeFirst(){
// Designate the first node as temp and
// change the value of head to the second node.
        Node temp = head;
        head = temp.next;
// Before deleting data, place
// the value to be returned in a temporary variable.
        Object returnData = temp.data;
        temp = null;
        size--;
        return returnData;
    }
    public Object remove(int k){
        if(k == 0)
            return removeFirst();
        Node temp = node(k-1); // Specifies the k-1th node as the value of temp.
// Note the delete node in todoDeleted.
// If you remove the delete node now,
// the node before and after the deletion will not be able to connect.
        Node todoDeleted = temp.next;
// Specifies the node after deletion as the next node after the node before deletion.
        temp.next = temp.next.next;
// To return deleted data, save the data in returnData.
        Object returnData = todoDeleted.data;
        if(todoDeleted == tail)
            tail = temp;
        todoDeleted = null; // Delete cue.next.
        size--;
        return returnData;
    }
    public int size() {
        return size;
    }
    public int indexOf(Object data){
        Node temp = head; // Specifies the node to be searched as temp.
// Index is used as a variable that indicates which element the search target is in.
        int index = 0;
// Compares the search value with the value of the search target.
        while(temp.data != data){
            temp = temp.next;
            index++;
            if(temp == null)
                return -1; // If not found, -1 is returned

        }
        return index; // If found, it returns the index value.
    }
    public Object get(int index) {
        Node temp = node(index);
        return temp.data;
    }
    public ListIterator listIterator() {
// Creates and returns a ListIterator instance.
        return new ListIterator();
    }
    class ListIterator {
        private Node lastReturned;
        private Node next;
        private int nextIndex;
        ListIterator(){
            next = head;
            nextIndex = 0;
        }
        public Object next() {
            lastReturned = next;
            next = next.next;
            nextIndex++;
            return lastReturned.data;
        }
        public boolean hasNext() {
            return nextIndex < size();
        }

        public void remove(){
            if(nextIndex == 0){
                throw new IllegalStateException();
            }
            LinkedLis.this.remove(nextIndex-1);
            nextIndex--;
        }

    }


}

