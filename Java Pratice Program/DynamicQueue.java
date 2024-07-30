public class DynamicQueue extends CircleQueue {
     
    DynamicQueue()
    {
        super();
    }
    DynamicQueue(int size)
    {
        super(size);
    }

    @Override
    public boolean insert(int item)
    {
        if(this.isFull())
        {
            //double the array size
            int[] temp=new int[2*data.length];


            //copy all previous items in new data
            for(int i=0;i<data.length;i++)
            {
                temp[i]=data[(front+i)%data.length];
                
            }
            front=0;
            end=data.length;
            data=temp;
        }

        return super.insert(item);
    }
    
}
