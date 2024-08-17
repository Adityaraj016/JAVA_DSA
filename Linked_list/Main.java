package Linked_list;

public class Main {
    public static void main(String[] args) {
        //for singly linked list
        LL list=new LL();
//        list.insertFirst(10);
//        list.insertFirst(20);
//        list.insertFirst(20);
//        list.insertFirst(40);
//        list.insertFirst(50);
//        list.insertLast(60);
//        list.display();
//
//
//
//        list.insert(1,0);
//        list.insert(19,2);
//        list.insert(1010,list.getSize());

//        System.out.println(list.deletefirst());
//        System.out.println(list.deletelast());
//
//        System.out.println(list.delete(2));
//
//        System.out.println("Size:"+list.getSize());
//        System.out.println(list.delete(list.getSize() - 1));
//        list.insertFirst(4);
//        list.insert(3,1);
//        list.insert(4,2);
//        list.insertRecursion(2,1);
        list.insertRecursion(5,0);
        list.insertRecursion(1,1);
        list.insertRecursion(4,2);
        list.insertRecursion(5,3);
        list.insertRecursion(3,1);

        list.insertLast(5);
        list.insertLast(6);

        list.display();
        list.bubblesort();
        list.display();

        //this is reference variable
        System.out.println(list.find(20));
        list.reverseList();
//        list.reverseList();

        list.display();

    }
}
