public class QueueDriver {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        System.out.println(queue.isEmpty()); // testing the isEmpty boolean when the queue is empty
        queue.enqueue(8); // creating que elements
        queue.enqueue(2);
        queue.enqueue(6);
        System.out.println(queue.size()); // testing the size method (should print 3)
        System.out.println(queue.peek());   //testing the peek method (should print 8)
        System.out.println(queue.isEmpty());//testing the is empty boolean method (should return false)
        System.out.println(queue.dequeue()); // testing the dequeue method (should return 8)
    }
}
