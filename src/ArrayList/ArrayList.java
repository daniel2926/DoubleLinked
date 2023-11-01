package ArrayList;

import java.util.ListIterator;

public class ArrayList {
    private int size = 0;
    private Object[] elementData = new Object[100];

    public boolean addLast(Object element) {
        elementData[size] = element;
        size++;
        return true;
    }

    public boolean add(int index, Object element) {
// Move elements from the end until the index node.
        for (int i = size - 1; i >= index; i--) {
            elementData[i + 1] = elementData[i];
        }
// Add a node to index.
        elementData[index] = element;
// Increases the number of elements by 1.
        size++;
        return true;
    }

    public boolean addFirst(Object element) {
        return add(0, element);
    }

    public String toString(){
        String str = "[ ";
        for(int i=0; i < size; i++){
            str += elementData[i];
            if(i < size-1){
                str += ", ";
            }
        }
        return str + " ]";
    }
    public Object remove(int index) {
// Before deleting an element,
// save the data to be deleted in the removed variable.
        Object removed = elementData[index];
// Move sequentially from the element following the deleted
// element to the last element to fill the empty space.
        for (int i = index + 1; i <= size - 1; i++) {
            elementData[i - 1] = elementData[i];
        }
// Reduce the size
        size--;
// Explicitly deletes the element at the last position.
        elementData[size] = null;
        return removed;
    }

    public Object removeFirst(){
        return remove(0);
    }
    public Object removeLast(){
        return remove(size-1);
    }

    public Object get(int index) {
        return elementData[index];
    }

    public int size() {
        return size;
    }
    public Object indexOf(Object o){
        for(int i=0; i < size; i++){
            if(o.equals(elementData[i])){
                return i;
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
// Creates and returns a ListIterator instance.
        return new ListIterator();
    }
    class ListIterator {
        // Index value indicating the current search order.
        private int nextIndex = 0;
        // Checks whether the next method can be called.
        public boolean hasNext() {
// If nextIndex is less than the number of elements,
// it returns true because the element to search using next exists.
            return nextIndex < size();
        }
        // Searches for elements sequentially and returns.
        public Object next() {
// Returns the element corresponding to nextIndex
// and increases the value of nextIndex by 1.
            return elementData[nextIndex++];
        }
        // Checks whether the previous method can be called.
        public boolean hasPrevious(){
// If nextIndex is greater than 0,
// it means the previous element exists.
            return nextIndex > 0;
        }
        // Returns the previous node in sequential order.
        public Object previous(){
// Returns the previous element
// and decreases the value of nextIndex by 1.
            return elementData[--nextIndex];
        }
        // Adds the current element.
        public void add(Object element){
            ArrayList.this.add(nextIndex++, element);
        }
        // Removes the current element.
        public void remove(){
            ArrayList.this.remove(nextIndex-1);
            nextIndex--;

        } }
}
