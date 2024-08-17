package Stack_queues;

public class dynamic_stack extends customstack{
    public dynamic_stack() {
        super();
    }
    public dynamic_stack(int size){
        super(size);
    }

    @Override
    public boolean push(int item){
        //this takes care of t being full
        if(this.isFull()){
            int[] temp=new int[data.length*2];

            //copy all previous item s in new data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }

        return super.push(item);
    }
}
