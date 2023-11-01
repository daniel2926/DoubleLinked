package ArrayList;

public class ArrayListTestStack {
    ArrayList numbers = new ArrayList();

    public int getSize(){
        return numbers.size();
    }

    public Object peek(){
        return numbers.get(getSize() - 1);
    }

    public Object pop(){
        Object o = numbers.get(getSize() - 1);
        numbers.remove(getSize() -1);
        return  o;
    }
    public void push(Object o){
        numbers.addLast(o);
    }
    public boolean isEmpty() {
        return numbers.size() == 0 ;
    }

    public Object search(Object o){
       Object index =  numbers.indexOf(o);
        return index;
    }


    public String toString(){
        return "stack = " + numbers.toString();
    }
}
