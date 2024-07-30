import java.lang.classfile.components.ClassPrinter.ListNode;

public class LL {
    

      private Node head;
      private Node tail;
      private int size;

     public  LL()
      {
        this.size=0;
      }
      public void insertLast(int value)
      {
        Node node=new Node(value);
        if(tail==null)
        {
            insertFirst(value);
            return;
        }
             tail.next=node;
             tail=node;

             size++;
      }

      public void insertFirst(int value)
      {
        Node node=new Node(value);
        node.next=head;
        head=node;
        if(tail==null)
        {
            tail=head;
        }
           size+=1;
      }


          //insert using recursion
          public void insertRec(int val,int index)
          {
              head=insertRec(val, index, head);
          }
           private Node insertRec(int val,int index,Node node)
           {
                if(index==0)
                {
                    Node temp=new Node(val,node);
                    size++;
                    return temp;
                }
                node.next = insertRec(val, index--, node.next);
                return node;
           }
      public void insertJust(int value,int index)
      {
          if(index==0)
          
          {
            insertFirst(value);
            return;
          }
          if(index==size)
          {
            insertLast(value);
            return;
          }
          Node temp=head;
          for (int i = 1; i < index; i++) {
            temp=temp.next;
            
          }
          Node node =new Node(value,temp.next);
          temp.next=node;
          size++;
      }
        public int deleteFirst()
        {
            int val=head.value;
            head=head.next;
            if(head==null)
            {
                tail=null;
            }
            size--;
            return val;
        }

        public int delete(int index)
        { if(index==0)
            {
                return deleteFirst();
            }
            if(index==size-1)
            {
                return deleteLast();
            }

            Node previous=get(index-1);
              int val=previous.next.value;
               
                  previous.next=previous.next.next;

          return val;
        }

        public Node find(int value)
        {
            Node node=head;
              while(node!=null)
              {
                if(node.value==value)
                {
                    return node;
                }
                node=node.next;
              }
           return null;
        }
        public Node get(int index)
        {
            Node node=head;
            for (int i = 0; i < index; i++) {
                node=node.next;
            }
            return node;
        }
      public int deleteLast()
      { 
        if(size<=1)
        {
            return deleteFirst();
        }
            Node secondLast=get(size-2);
            int val=tail.value;
            tail=secondLast;
            tail.next=null;

            return val;
      }

      public void display()
      {
        Node temp=head;
        while(temp!= null)
        { 
            System.out.print(temp.value+ "-> ");
            temp=temp.next;

        }
        System.out.println("End");
      }

    private class Node{
      int value;
      Node next;
       Node(int value)
       {
        this.value=value;
       }

       Node(int value,Node next)
       {
        this.value=value;
        this.next=next;
       }

    }


    //remove duplicates

    public void duplicates()
    {
        Node node=head;

        while(node.next!=null)
        {
             if(node.value==node.next.value)
             {
                node.next=node.next.next;
                size--;
             }
             else{
                 node=node.next;
             }
            
        
        }
        tail=node;
        tail.next=null;


    }
        
    public static LL merge(LL first,LL second)
    {
        Node f=first.head;
        Node s=second.head;

         LL ans=new LL();

         while(f!=null && s!=null)
         {
            if(f.value < s.value)
            {
                ans.insertLast(f.value);
                f=f.next;
            }
            else
            {
                ans.insertLast(s.value);
                s=s.next;
            }
         }
         while(f != null)
         {
            ans.insertLast(f.value);
                f=f.next;
         }
         while(s!=null)
         {
            ans.insertLast(s.value);
            s=s.next;
         }
         return ans;
    }
    public void bubbleSort()
    {
         bubbleSort(size-1,0);
    }
     private void bubbleSort(int row ,int col)
   { 
      if(row==0)
      {
        return;
      }
      if(col<row)
      {
        Node first=get(col);
        Node second=get(col+1);

        if(first.value>second.value)
        {
            //swap

            if(first==head)
            {
                head= second;
                first.next=second.next;
                second.next=first;
            }
            else if(second==tail){
              Node prev=get(col-1);
              prev.next=second;
              tail=first;
              first.next=null;
              second.next=tail;
            }

            else{
                Node prev=get(col-1);
                prev.next=second;
                first.next=second.next;
                second.next=first;
            }
        }
        bubbleSort(row,col+1);
      }
      else{
        bubbleSort(row-1, 0);
      }

   }
   //recursion reverse
   private void reverse(Node node)
   {
      if(node==tail)
       {
          head=tail;
          return;
          }
          reverse(node.next);
          tail.next=node;
          tail=node;
            if(node !=null)
            {
             tail.next=null;
            }
   }
   

   //in place reversal of linked list
   public void reverse1()
   {
    if(size<2)
    {
        return;
    }
            Node prev=null;
            Node present=head;
            Node next=present.next;

            while (present!=null) {
                present.next=prev;
                prev=present;
                present=next;
                if(next !=null)
                {
                next=next.next;
                }
            }
            head=prev;
   }

   public ListNode reverseBetween(ListNode head,int left,int right)
   {
       if(left==right)
       {
        return head;
       }
       //skip the first left-1 node
       ListNode current=head;
       ListNode prev=null;
       for (int i = 0;  current!=null && i < left-1; i++) {
            prev=current;
            current=current.next;
       }
       ListNode last=prev;
       ListNode newEnd=current;
       //reverse the given list
         ListNode next=current.next;
       for (int i = 0;current!=null &&  i < right-left+1; i++) {
        current.next=prev;
        prev=current;
        current=next;
        if(next !=null)
           {
           next=next.next;
           }

       }
      if(last!=null)
      {
        last.next=prev;

      }else{
        head=prev;
      }
      newEnd.next=current;
      return head;
   }


   public boolean isPalindrome(ListNode head)
   {
    ListNode mid=reverseList(head);
    ListNode  headSecond=reverseList(mid);
    ListNode rereverseHead=headSecond;

      //compare both the halves
      while (head!=null && headSecond !=null) {
        if(head.val != headSecond.val)
        {
            break;
        }
        head=head.next;
        headSecond=headSecond.next;
      }

      reverseList(rereverseHead);

      if(head==null || headSecond==null)
      {
        return true;
      }
      return false;

   }
public   ListNode reverseList(ListNode head)
   {
      if(head==null)
      {
        return head;
      }
       ListNode prev=null;
       ListNode present=head;
       ListNode next=present.next;

       while(present!=null )
       {
        present.next=prev;
        prev=present;
        present=next;
          if(next!=null)
          {
            next=next.next;
          }

           
       }
      
       return prev;
   }   
      public void reoderList(ListNode head)
      {
          if(head==null || head.next==null)
          {
            return;
          }
          ListNode mid=middlieNode(head);
           
          ListNode hs=reverseList(mid);
          ListNode hf=head;

          //rearrange
          while (hf!=null && hs!=null) {
            ListNode temp=hf.next;
            hf.next=hs;
            hf=temp;

            temp=hs.next;
            hs.next=hf;
            hs=temp;


          }
           //next tail
          if(hf !=null)
          {
              hf.next=null;
          }
      }
      public ListNode middlieNode(ListNode head)
      {
         ListNode s=head;
         ListNode f=head;
         while(f!=null)
         {
            s=s.next;
            f=f.next.next;

         }
         return s;
      }

      public ListNode reverseKNode(ListNode head,int k)
      {
        if(K<=1 || head ){
                 return head;
        }
         //skip the first left-1 node
         ListNode current=head;
         ListNode prev=null;
         while (true) {
          
         ListNode last=prev;
         ListNode newEnd=current;
         //reverse the given list
           ListNode next=current.next;
         for (int i = 0;current!=null &&  i <k; i++) {
          current.next=prev;
          prev=current;
          current=next;
          if(next !=null)
             {
                next=next.next;
             }
  
         }
            if(last!=null)
             {
                last.next=prev;
               }
               else {
                head=prev;
                 }
            newEnd.next=current;
                if(current==null)
                {
                  break;
                }
                prev=newEnd;
            }
            return head;
      }

      public ListNode rotateRight(ListNode head,int k)
      {
        if(K<=0 || head==null  || head.next==null)
        {
               return head;
        }

            ListNode  last=head;
            int length=1;
            while (last.next!= null) {
              last=last.next;
              length++;
            }

            last.next=head;
            int rotations=k%length;
            int skip=length-rotations;
             ListNode newlast=head;
            for (int i = 0; i <skip-1; i++) {
              newlast=newlast.next;
            }

            head=newlast.next;
            newlast.next=null;
            return head;
      }
    public static void main(String[] args)throws Exception {
        // LL list=new LL();
        // list.insertFirst(11);
        // list.insertLast(22);
        // list.insertLast(22);
        // list.insertLast(22);
        // list.insertLast(32);
        // list.insertLast(32);
        // list.insertLast(52);
 
        // list.display();
        // list.duplicates();
        // list.display();

        LL  first=new LL();
        LL second=new LL();


        first.insertLast(1);
        first.insertLast(2);
        first.insertLast(5);
         
        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(9);
        
        second.insertLast(14);
        second.insertLast(15);
       LL ans =LL.merge(first, second);
        ans.display();

        LL list=new LL();
        for (int i = 7; i >0 ; i--) {
            list.insertLast(i);
        }
        list.display();
        list.bubbleSort();
       list.display();
        list.reverse(null);
        list.display();
    }
    
}
