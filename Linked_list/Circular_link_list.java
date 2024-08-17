package Linked_list;

public class Circular_link_list {
    private Node head;
    private Node tail;

    private int size;

    public Circular_link_list() {
        this.size = 0;
    }

    public void insertlast(int val){
        Node node=new Node(val);
        if(head == null){
            head=node;
            tail=node;
            head.next=node;
            size++;
            return;
        }
        tail.next=node;
        node.next=head;
        tail=node;
        size++;

    }
    public void insert(int val,int index){
        if(index == size || index == 0){
            insertlast(val);
            return;
        }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node=new Node(val);
        node.next=temp.next;
        temp.next=node;
        size++;
    }

    public void display(){
        Node temp=head;
        if(head != null){
            do{
                System.out.print(temp.value+"->");
                temp=temp.next;
            }while (temp != head);
        }

        System.out.println("end");

    }
    public int deletelast(){
        int val=tail.value;
        if(head.next == head){
            head =null;
            tail=null;
            return val;
        }
        Node temp=head;
        while(temp.next != tail){
            temp=temp.next;
        }
        temp.next=head;
        tail=temp;
        size--;
        return val;
    }

    public int delete(int index){
        if(head == null){
            System.out.println("Nothing to delete");
            return -1;
        }
        if(index == 0){
            int val= head.value;
            head=head.next;
            tail.next =head;
            size--;
            return val;
        }
        if(index == size-1){
            return deletelast();
        }
        Node temp=head;
        int val=temp.next.value;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        size--;
        return val;


    }




    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
