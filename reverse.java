import java.util.Queue;
import java.util.Stack;

public class reverse {
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < k; i++) {
            stack.push(q.poll());
        }

        while (!stack.isEmpty()) {
            q.offer(stack.pop());
        }

        for (int i = 0; i < q.size() - k; i++) {
            q.offer(q.poll());
        }
        return q;
    }
    public static void main(String[] args) {
        reverse obj= new reverse();
        obj.Queue(1,2,3,4);
    }
}