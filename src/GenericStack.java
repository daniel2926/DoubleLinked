import java.util.ArrayList;

public class GenericStack <E> {
    private ArrayList<E> arrayList = new ArrayList<>();

    public int getSize(){
        return arrayList.size();
    }
    public E peek(){
        return arrayList.get(getSize()-1);
    }
    public E pop(){
        E o = arrayList.get(getSize()-1);
        arrayList.remove(getSize()-1);
        return o;
    }
    public void push(E o){
        arrayList.add(o);
    }
    public boolean isEmpty(){
        return arrayList.isEmpty();
    }
}
