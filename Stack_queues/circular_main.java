package Stack_queues;

public class circular_main  {
    public static void main(String[] args) throws Exception {
        Circular_queue c_queue = new Circular_queue();
        c_queue.insert(5);
        c_queue.insert(15);
        c_queue.insert(25);
        c_queue.insert(35);
        c_queue.insert(45);
        c_queue.insert(55);
        c_queue.insert(5);
        c_queue.insert(15);
        c_queue.insert(25);
        c_queue.insert(35);

        c_queue.remove();
        c_queue.insert(10);

        System.out.println(c_queue.peek());
        System.out.println(c_queue.front());

        c_queue.remove();
        c_queue.Display();

        dynamic_circular_queue dc=new dynamic_circular_queue();
        dc.insert(5);
        dc.insert(15);
        dc.insert(25);
        dc.insert(35);
        dc.insert(45);
        dc.insert(5);
        dc.insert(15);
        dc.insert(25);
        dc.insert(35);
        dc.insert(45);dc.insert(5);
        dc.insert(15);
        dc.insert(25);
        dc.insert(35);
        dc.insert(45);dc.insert(5);
        dc.insert(15);
        dc.insert(25);
        dc.insert(35);
        dc.insert(45);
        dc.Display();
        System.out.println(dc.getSize());



    }
}
