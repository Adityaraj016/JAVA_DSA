package Stack_queues;

public class queuemain {
    public static void main(String[] args) throws Exception {
        custom_queue queue =new custom_queue();
        queue.insert(5);
        queue.insert(15);
        queue.insert(25);
        queue.insert(35);
        queue.insert(45);
        queue.insert(55);

        queue.Display();
//        int i = queue.end;
//        System.out.println(i);
        queue.remove();
        queue.Display();
        System.out.println(queue.peek());
    }
}
