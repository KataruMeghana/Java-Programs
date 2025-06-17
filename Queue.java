import java.util.LinkedList;
import java.util.Queue;
public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        queue.offer("D");

        System.out.println("Queue: " + queue);
        System.out.println("Front of the queue: " + queue.peek());
        System.out.println("Removed: " + queue.poll());
        System.out.println("Queue after removal: " + queue);

        System.out.println("Contains 'C'? " + queue.contains("C"));

        System.out.println("Queue size: " + queue.size());
        System.out.println("Iterating over queue:");
        for (String name : queue) {
            System.out.println(name);
        }
    }
}
