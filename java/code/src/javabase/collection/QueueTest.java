package javabase.collection;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {
    public static void dumpQueue(Queue< ? extends Number> queue) {
        var v = queue.iterator();
        while (v.hasNext()) {
            System.out.print(v.next() + ", ");
        }
        System.out.println();
    }
    public static void PriorityQueueTest() {
        Queue<Integer> queue = new PriorityQueue<>();
        System.out.println("queue.peek()" + queue.peek());
        for (int i = 10; i > 0; i--) {
            queue.add(i);
        }
        System.out.println("dump PriorityQueue");
        dumpQueue(queue);
        System.out.println("remove dump PriorityQueue");
        queue.remove();
        dumpQueue(queue);
        System.out.println("queue.poll()" + queue.poll());
        System.out.println("queue.element()" + queue.element());
        queue.offer(100);
        queue.offer(101);
        dumpQueue(queue);
    }
    public static void ArrayDequeTest() {
        System.out.println("----------ArrayDeque-------------");
        Queue<Integer> queue = new ArrayDeque<>();
        System.out.println("queue.peek()" + queue.peek());
        for (int i = 10; i > 0; i--) {
            queue.add(i);
        }
        System.out.println("dump PriorityQueue");
        dumpQueue(queue);
        System.out.println("remove dump PriorityQueue " + queue.remove());
        dumpQueue(queue);
        System.out.println("queue.poll()" + queue.poll());
        System.out.println("queue.element()" + queue.element());
        queue.offer(100);
        queue.offer(101);
        dumpQueue(queue);
        System.out.println("ArrayDeque addFirst + addLast");
        ArrayDeque<Integer> arrayDeque = (ArrayDeque<Integer>)queue;
        arrayDeque.addFirst(200);
        arrayDeque.addLast(300);
        dumpQueue(arrayDeque);
    }
    public static void main(String[] args) {
        PriorityQueueTest();
        ArrayDequeTest();
    }
}
