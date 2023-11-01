import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList numbers = new ArrayList();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        System.out.println(numbers);
        System.out.println(numbers.remove(1));
        System.out.println(numbers);
//        numbers.add(1, 15);
//        numbers.addFirst(5);
    }
}