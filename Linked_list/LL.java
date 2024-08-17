package Linked_list;


public class LL {
    private Node head;
    private Node tail;

    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }

    public void insertRecursion(int val,int index){
        head = insertRecursion(val, index ,head);
        //extra diition to maintain tail
        Node temp= head;
        while(temp.next != null){
            temp = temp.next;
        }
        tail = temp;
    }
    private Node insertRecursion(int val,int index,Node node){
        if(index == 0){
            Node temp=new Node(val,node);
            size++;
            return temp;
        }

        node.next = insertRecursion(val, index-1 ,node.next);
        return node;
    }

    public int deletefirst(){
        int val= head.value;
        head = head.next;
        size--;
        if(head == null){
            tail=null;
        }

        return val;
    }

    public int deletelast(){
        if(size <= 1){
            return deletefirst();
        }
        int val= tail.value;

        Node temp = head;

        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }
//        while (temp.next != tail){
//            temp=temp.next;
//        }
        temp.next=null;
        tail=temp;
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
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        int value = temp.next.value;
        temp.next = temp.next.next;

        size--;
        return value;
    }

    public Node find(int value){
        Node temp = head;
        while (temp != null){
            if(temp.value == value){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
    public void bubblesort(){
        bubblesort(size-1 , 0);
    }
    private void bubblesort(int row,int col){
        if(row == 0){
            return;
        }
        if(col < row){
            Node first = get(col);
            Node second = get(col+1);
            if(first.value > second.value){
                if(first == head){
                    head = second;
                    first.next = second.next;
                    second.next = first;
                }else if(second == tail){
                    Node prev = get(col-1);
                    prev.next = second;
                    tail = first;
                    first.next=null;
                    second.next = tail;
                }else{
                    Node prev = get(col-1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubblesort(row ,col+1);
        }else{
            bubblesort(row-1 , 0);
        }
    }

    private void reverse_rec(Node node){
        if(node == tail){
            head = tail;
            return;
        }
        reverse_rec(node.next);

        tail.next = node;
        tail = node;
        tail.next = null;
    }
    public void reverseList() {
        if(head == null || head.next == null){
            return;
        }
        Node first = null;
        Node second = head;
        Node third = head.next;

        while(second != null){
            second.next = first;
            first = second;
            second = third;
            if(third != null){
                third = third.next;
            }
        }
        tail = head;
        head = first;
    }
    //thius function is totally right ,but since we are not adding tail here
    // so after thus function working og normal insert will be affetct as it uses tail
    //how ever we can add tail
//    public void insertlast_without_tail(int val){
//        Node temp = head;
//        if(head == null){
//            insertFirst(val);
//            return;
//        }
//        while(temp.next != null){
//            System.out.print(temp.value +" ");
//            temp = temp.next;
//        }
//        System.out.println(temp.value);
//
//        Node node = new Node(val);
//        temp.next = node;
//
//        size += 1;
//
////        this tail we just added ki normal flow of insert funstion is not affected
//        tail = node;
//
//    }
    public int getSize() {
        return size;
    }
    public Node get(int index){
        if(index < 0 || index>=size){
            return null;
        }
        Node temp = head;
        for(int i=0;i < index;i++){
            temp = temp.next;
        }
        return temp;
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("End");
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
