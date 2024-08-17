package Stack_queues;

public class custom_queue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    protected int end = 0;

    //if so size passed create with default size
    public custom_queue(){
        this(DEFAULT_SIZE);
    }
    public custom_queue(int size) {
        this.data = new int[size];
    }


    //what is on the top of stack
    public int peek () throws stackException {
        if(isEmpty()){
            throw new stackException("Cannot peek from an empty stack!!");
            //function will be stoped from here
        }
        return data[end-1];
    }

    public boolean isFull(){
        return end == data.length ;
    }
    public boolean isEmpty(){
        return end == 0;
        //when ptr is -1 then stack is empty
    }

    public boolean insert(int item){
        if(isFull()){
            System.out.println("Queue is full!!");
            return false;
        }

        data[end] = item;
        end++;
        return true;
    }

    public int remove() throws Exception {
       if(isEmpty()){
           throw new Exception("Queue is empty");
       }
       int remove = data[0];

       for(int i= 1; i < end ;i++){
           data[i-1] = data[i];
       }
        end--;
       return remove;
    }

    public void Display(){
        for(int i =0;i< end;i++){
            System.out.print(data[i]+"->");
        }
        System.out.println("END");
    }
    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        return data[0];
    }
}
