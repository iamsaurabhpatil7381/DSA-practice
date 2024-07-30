import java.util.*;
public class ArrayL1 {
  private  int[] arr;
  private static int default_size=10;
  public int size=0;


  //constructor is used to set size

  public ArrayL1()
  {
   this.arr=new int[default_size];
  }

  public  void add(int num)
  {
    if(isFull())
    {
        resize();
    }
      arr[size++]=num;
  }

    private boolean isFull()
    {
        return size==arr.length;
    }
   
    private void resize()
    {
        int [] temp=new int[arr.length*2];

        //copy the element in temp
        for (int i = 0; i < arr.length; i++) {
              temp[i]=arr[i];
        }
        arr=temp;
    }


      public int remove()
      {
        int removed=arr[--size];
        return removed;
      }
      public int get(int index)
      {
        return arr[index];
      }
    public int size()
    {
        return size;
    }
    public void set(int index ,int value)
    {
        arr[index]=value;
    }

     @Override
     public String toString() {
        return "ArrayL1{"
          +"arr"+ Arrays.toString(arr)+
          ", size"+size+  '}';
        }
     
    public static void main(String[] args) {
      //ArrayList<Integer> list=new ArrayList<>();

      ArrayL1 list=new ArrayL1();
    //   list.add(3);
    //   list.add(4);
    //   list.add(9);
      //list.add(7);
   
         for(int i=0;i<14;i++)
         {
            list.add(2*i);
         }
      System.out.println(list);

       

    }

}   