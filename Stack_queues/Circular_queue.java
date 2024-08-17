package Stack_queues;

public class Circular_queue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    protected int front = 0;
    protected int end = 0;
    private int size =0;

    //if so size passed create with default size
    public Circular_queue(){
        this(DEFAULT_SIZE);
    }
    public Circular_queue(int size) {
        this.data = new int[size];
    }

    public int getSize() {
        return size;
    }

    //what is on the top of stack
    public int peek () throws stackException {
        if(isEmpty()){
            throw new stackException("Cannot peek from an empty stack!!");
            //function will be stoped from here
        }
        if(end == 0){
            return data[data.length-1];
        }
        return data[end -1];
    }

    public boolean insert(int item){
        if (isFull()){
            System.out.println("Queue is full!!");
            return false;
        }
        data[end] = item;
        end++;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int remove = data[front];
        front++;
        front = front % data.length;
        size--;
        return remove;
    }

    public boolean isFull(){
        return size == data.length ;
    }
    public boolean isEmpty(){
        return size == 0;

    }
    public void Display(){
        if(isEmpty()){
            System.out.println("Empty");
            return;
        }
        int temp =front;
        do{
            System.out.print(data[temp] + "->");
            temp++;
            temp = temp % data.length;
        }while (temp != end);
        System.out.println("END");
    }
    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        return data[front];
    }
}



