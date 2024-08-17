package Linked_list;

public class CL_main {
    public static void main(String[] args) {
        Circular_link_list cl=new Circular_link_list();

//        cl.insert(4,0);
//        cl.insertlast(5);
//        cl.insert(2,1);
//        cl.insert(4,2);
//        cl.insertlast(7);
//        cl.insert(5,1);
//        System.out.println("deleted last:"+cl.deletelast());
////        System.out.println("deleted last:"+cl.deletelast());
//        System.out.println("deleted:"+cl.delete(1));
//        System.out.println("deleted:"+cl.delete(0));
        System.out.println("deleted:"+cl.delete(2));

        cl.display();
    }
}
