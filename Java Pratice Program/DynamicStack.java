public class DynamicStack extends CustomStack
{

    DynamicStack()
    {
        super();
    }

    DynamicStack(int size)
    {
        super(size);
    }
     

      @Override
      public boolean push(int item)
      {
        if(this.isFull())
        {
            //double the array size
            int[] temp=new int[2*data.length];


            //copy all previous items in new data
            for(int i=0;i<data.length;i++)
            {
                temp[i]=data[i];
                
            }
            data=temp;
        }

           //insert the item
           //at this point we know that array is not full
           return super.push(item);
      }
     public static void main(String[] args) throws StackException
     {
        CustomStack stack=new DynamicStack(5);
        stack.push(3);
        stack.push(2);
        stack.push(12);
        stack.push(23);
        stack.push(90);
        stack.push(990);
    
        System.out.println(stack.pop());
        System.out.println( stack.pop());
        System.out.println( stack.pop());
        System.out.println( stack.pop());
        System.out.println( stack.pop());
        System.out.println( stack.pop());

     }
      
}