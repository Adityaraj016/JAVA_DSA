package Linked_list;

public class Doubly_linked_list {
    private Node head;
    private  int size;

    public Doubly_linked_list() {
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public void insertFirst(int val){
        Node node=new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;

        size++;
    }
    public void insertLast(int val){
        Node node = new Node(val);
        if( head == null){
            insertFirst(val);
            return;
        }
        Node temp=head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;
        node.next = null;

        size++;
    }

    public void insert(int val,int index){
        if(index== 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for(int i=0;i<index-1 ; i++){
            temp=temp.next;
        }
        Node node=new Node(val);
        node.next=temp.next;
        node.prev=temp;
        temp.next=node;
        node.next.prev=node;

        size++;

    }

    public void insertaftervalue(int val,int after){
        Node p=get(after);
        if(p == null){
            System.out.println("Node does not exist");
            return;
        }
        Node node=new Node(val);
        node.next=p.next;
        p.next=node;
        node.prev = p;
        //handling null pointer
        if(node.next != null){
            node.next.prev = node;
        }
        size++;

    }
    public Node get(int after){
        Node temp=head;
        while(temp != null){
            if(temp.val == after){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }

    public int deletefirst(){
        int val=head.val;
        head=head.next;
        if(head == null){
            size--;
            return val;
        }
        head.prev = null;
        size--;
        return val;
    }
    public int deletelast(){
        Node temp = head;
        while(temp.next != null){
            temp=temp.next;
        }
        int val = temp.val;
        if(temp.prev == null){
            head = null;
            size--;
            return val;
        }
        temp= temp.prev;
        temp.next = null;
        size--;
        return val;
    }

    public int delete(int index){
        if(index == 0){
            return deletefirst();
        }
        if(index == size-1){
            return deletelast();
        }
        Node temp = head;
        for(int i=1; i < index;i++){
            temp= temp.next;
        }
        Node p= temp;
        int val= temp.next.val;
        temp.next = temp.next.next;
        temp.next.prev= p;
        size--;
        return val;
    }

    public void display(){
        Node temp=head;
        while(temp != null){
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.print("end");
    }

    public void displayRev(){
        Node temp=head;
        if(temp == null){
            System.out.println("\nempty");
            return;
        }
        while(temp.next != null){
            temp = temp.next;
        }
        System.out.println("\nPrint Backward");
        Node last = temp;
        while(last != null){
            System.out.print(last.val+"->");
            last=last.prev;
        }
        System.out.print("start");
    }

    private class Node{
        private int val;
        private Node prev;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node prev, Node next) {
            this.val = val;
            this.prev = prev;
            this.next = next;
        }
    }
}
