package Stack_queues;

public class dynamic_circular_queue extends Circular_queue{
    public dynamic_circular_queue() {
        super();
    }

    public dynamic_circular_queue(int size) {
        super(size);
    }

    //main issue is with insert

    @Override
    public boolean insert(int item) {
        if(isFull()){
            //double the size
            int[] temp = new int[data.length*2];
            for(int i=0;i< data.length;i++){
                temp[i] = data[(front+i) % data.length];
            }
            front = 0;
            end = data.length;
            data = temp;
        }
        return super.insert(item);
    }
}
