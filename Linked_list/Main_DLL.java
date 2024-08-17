package Linked_list;

public class Main_DLL {
    public static void main(String[] args) {
        Doubly_linked_list dl=new Doubly_linked_list();
        dl.insertFirst(5);
        dl.insertFirst(6);
        dl.insertLast(10);
        dl.insertaftervalue(11,10);
        dl.insertFirst(6);


//        int val=dl.deletefirst();
//        System.out.println("deleted first:"+val);
//        System.out.println("Deleted last:"+dl.deletelast());
        System.out.println("Deleted:"+dl.delete(2));
        System.out.println("Deleted:"+dl.delete(2));
        dl.display();
        dl.displayRev();
        System.out.println("\nSize:"+dl.getSize());
    }
}
