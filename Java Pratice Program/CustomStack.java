public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;

   

    int ptr=-1;
    public CustomStack()
    {
        this(DEFAULT_SIZE);
    }

   public CustomStack(int  size)
    {
      this.data=new int[size];
    }
  
    public boolean push(int item)
    {
        if(isFull())
        {
            System.out.println("stack is full");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }
   public  int pop() throws StackException
   {
     if(isEmpty())
     {
        throw new StackException(" cannot pop from an empty stack");
     }
         int removed=data[ptr];
         ptr--;
         return removed;

         //return data[ptr--];
   }


      public int peek()  throws StackException
    {
        if(isEmpty())
     {
        throw new StackException(" cannot peek from an empty stack");
     }
        return data[ptr];
    }
    public boolean isFull()
    {
        return  ptr==data.length-1;  //ptr is at last index
    }
    public boolean isEmpty()
    {
        return  ptr==-1;  //ptr is at last index
    }

    public static void main(String[] args)throws StackException {
    CustomStack stack=new CustomStack(5);
    stack.push(3);
    stack.push(2);
    stack.push(20);
    stack.push(12);
    stack.push(23);

    System.out.println(stack.pop());
    System.out.println( stack.pop());
    System.out.println( stack.pop());
    System.out.println( stack.pop());
    System.out.println( stack.pop());
     }

}
