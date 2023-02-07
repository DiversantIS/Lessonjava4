import java.util.*;

public class Queue {
    private LinkedList<Integer> list;
 
    public Queue() {
        list = new LinkedList<>();
    }
 
    public void enqueue(int element) {
        list.addLast(element);
    }
 
    public int dequeue() {
        return list.removeFirst();
    }
 
    public int first() {
        return list.getFirst();
    }
 
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
 
        System.out.println(queue.first()); // 1
        System.out.println(queue.dequeue()); // 1
        System.out.println(queue.dequeue()); // 2
    }
}