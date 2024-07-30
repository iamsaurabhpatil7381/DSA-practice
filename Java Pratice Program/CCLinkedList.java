import java.lang.classfile.components.ClassPrinter.ListNode;

public class CCLinkedList {
        
     private Node head;
     private Node tail;
    

      public  CCLinkedList()
       {
        this.head=null;
        this.tail=null;
       }
      public void insert(int val)
      {
        Node node=new Node(val);
          if(head==null)
          {
            head=node;
            tail=node;
            return;
          }

          tail.next=node;
          node.next=head;
          tail=node;
      }
        public void delete(int val)
        {
           Node node=head;
           if(node==null)
           {
            return;
           }
           if(node.val==val)
           { 
                head=head.next;

                tail.next=head;
                return;
           }
           do{
            Node n=node.next;
              if(n.val==val)
              {
                 node.next=n.next;
                 break;
              }
              node=node.next;
           }
           while(node!=head);

        }
     
     public boolean hasCycle(Node head) {
        Node fast=head;
        Node slow=head;

        while(fast!= null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)
            {
                return true;
            }
        }
        return true;
    }

    public void display()
    { 
         Node node=head;
         if(head!=null)
         {
           do{
              System.out.print(node.val+ " -> ");
              node=node.next;
           }
           while(node!= head);
         }
         System.out.println("Start");
    }
    
    private class Node{
        private int val;
        private Node next;

        Node(int val)
        {
            this.val=val;
        }
    }
    
}
