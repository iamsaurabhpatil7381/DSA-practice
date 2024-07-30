import java.util.*;
public class ArrayL2<T> {
  private  Object[] arr;
  private static int default_size=10;
  public int size=0;


  //constructor is used to set size

  public ArrayL2()
  {
     arr=new Object[default_size];
  }

  public  void add(T num)
  {
    if(isFull())
    {
        resize();
    }
      arr[size++]=num;
  }

   
   
    private void resize()
    {
        Object[] temp=new Object[arr.length*2];

        //copy the element in temp
        for (int i = 0; i < arr.length; i++) {
              temp[i]=arr[i];
        }
        arr=temp;
    }
    private boolean isFull()
    {
        return size==arr.length;
    }


      public T remove()
      {
        T removed=(T)(arr[--size]);
        return removed;
      }
      public T get(int index)
      {
        return (T)arr[index];
      }
    public int size()
    {
        return size;
    }
    
    public void set(int index ,T value)
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

      //ArrayL1 list=new ArrayL1();
    //   list.add(3);
    //   list.add(4);
    //   list.add(9);
      //list.add(7);
   
    //      for(int i=0;i<14;i++)
    //      {
    //         list.add(2*i);
    //      }
    //   System.out.println(list);

       ArrayL2<Integer> list2=new ArrayL2<>();
       for(int i=0;i<14;i++)
            {
               list2.add(2*i);
            }
            System.out.println(list2);
        }

}   