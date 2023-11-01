package ArrayList;

public class StackImpl {
    public static void main(String[] args) {
        ArrayListTestStack num = new ArrayListTestStack();

        num.push(10);
        num.push(20);
        num.push(30);
        System.out.println(num);
        System.out.println(num.pop());
        System.out.println(num);
        System.out.println(num);
        System.out.println(num.search(10));
        num.pop();
        num.pop();
        System.out.println(num.isEmpty());

    }



}
