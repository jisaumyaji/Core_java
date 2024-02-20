import java.util.LinkedList;
import java.util.Queue;

public class q {
    public static void main(String[] args) {
        Queue<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println("Queue: " + numbers);
        numbers.remove();
        System.out.println("Removed the first element"+ numbers);
        int accessedNumber = numbers.peek();
        System.out.println("Accessed Element: " + accessedNumber);

        int removedNumber = numbers.poll();
        System.out.println("Removed Element: " + removedNumber);

        System.out.println("Updated Queue: " + numbers);
    }
}