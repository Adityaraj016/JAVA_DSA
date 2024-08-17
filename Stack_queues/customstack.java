package Stack_queues;
import java.util.Arrays;
public class customstack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    protected int ptr = -1;

    //if so size passed create with default size
    public customstack(){
        this(DEFAULT_SIZE);
    }
    public customstack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full!!");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws stackException {
        if(isEmpty()){
            throw new stackException("Cannot pop from an empty stack!!");
            //function will be stoped from here
        }
        int removed = data[ptr];
        ptr--;
        return removed;

//        or return data[ptr--]; sa,e thing istead of three lines
    }

    //what is on the top of stack
    public int peek () throws stackException {
        if(isEmpty()){
            throw new stackException("Cannot peek from an empty stack!!");
            //function will be stoped from here
        }
        return data[ptr];
    }

    public boolean isFull(){
        return ptr == data.length - 1;
        //ptr is at last index
        //and array is full
    }
    public boolean isEmpty(){
        return ptr == -1;
        //when ptr is -1 then stack is empty
    }

    public void Display(){
        for(int i =0;i<= ptr;i++){
            System.out.print(data[i]+"->");
        }
        System.out.println("END");
    }
}
