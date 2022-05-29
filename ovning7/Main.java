package ovning7;


public class Main {

    public static void main(String[] args) {
        Queue q = new Queue(4);
        q.enqueue("1");
        q.enqueue("2");
        q.enqueue("3");
        q.enqueue("4");
        System.out.println(q.getAll());
        System.out.println(q.toString());
        q.enqueue("5");
        System.out.println(q.toString());

        q.enqueue("6");
        System.out.println(q.toString());
        String s = q.dequeue();
        System.out.println("Dequeued: " + s);
        System.out.println(q.toString());
        System.out.println(q.peek());

        System.out.println("Peeked at: " + s);

        while(!q.isEmpty()) {
            System.out.println(q.dequeue());
        }
        System.out.println(q.toString());

    }
}
