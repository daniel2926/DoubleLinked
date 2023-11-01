package linkedList;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Queue {
    LinkedList num = new LinkedList<>();


    public boolean offer(Object element){
        num.addLast(element);
        return true;
    }
    public Object poll (){
        try{
            Object o = num.getFirst();
            num.removeFirst();
            return o ;
        }catch (NoSuchElementException ex){
            return null;
        }
    }
    public Object remove(){
         try{
             Object o = num.getFirst();
             num.removeFirst();
             return o;
         } catch (NoSuchElementException ex){
             return null;
         }
    }

    public Object peek(){
        try {
            Object o = num.getFirst();
            return o;
        }catch (NoSuchElementException ex){
            return null;
        }

    }
    public Object element() {
        try {
            Object o = num.getFirst();
            return o;
        } catch (NoSuchElementException ex) {
            return null;
        }

    }

    public String toString(){
        return "stack = " + num.toString();
    }
}
