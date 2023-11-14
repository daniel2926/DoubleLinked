package linkedList;

public class QueueTest {
    public static void main(String[] args) {
        Queue number = new Queue();

        number.offer(10);
        number.offer(20);
        number.offer(30);
        System.out.println(number);
        number.remove();
        number.remove();
        number.remove();
        System.out.println(number.poll());


    }
}
