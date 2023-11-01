package ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList numbers = new ArrayList();

        numbers.addLast(10);
        numbers.addLast(20);
        numbers.addLast(30);
        numbers.addLast(40);

        System.out.println(numbers);

        numbers.add(1,50);
        numbers.addFirst(5);
        System.out.println(numbers);

        System.out.println(numbers.remove(1));
        System.out.println(numbers);

        numbers.removeFirst();
        numbers.removeLast();
        System.out.println(numbers);
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(1));
        System.out.println(numbers.size());

        System.out.println(numbers.indexOf(20));




    }
}