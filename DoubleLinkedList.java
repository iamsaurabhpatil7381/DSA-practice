public class DoubleLinkedList {
       Node head;
       public void insertFirst(int val)
       {
          Node node=new Node(val);
          node.next=head;
          node.previ=null;
          if(head!=null)
          {
            head.previ=node;
          }
          head=node;
       }
       public void display()
       {
          Node node=head;
            Node last=null;

          while (node!=null) {
           
            System.out.print(node.val+" -> ");
            last=node;
            node=node.next;
          }
          System.out.println("End");
          System.out.println("Revious element");

         
          while (last!=null) {
            System.out.print(last.val +" -> ");
            last=last.previ;
          }
          System.out.println("start");
       }
       public void insertLast(int val)
       {
          Node node =new Node(val);
          Node last =head;
            node.next=null;
            if(head==null)
            {
                node.previ=null;
                head=node;
                return;
            }
          while (last.next!=null) {
            last=last.next;
            
          }
          last.next=node;
          node.previ=last;
       } 
       public Node find(int value)
       {
           Node node=head;
             while(node!=null)
             {
               if(node.val==value)
               {
                   return node;
               }
               node=node.next;
             }
          return null;
       }
       public void insert(int after,int val)
       {
          Node p=find(after);
          if(p==null)
          {
            System.out.println("does not exists");
            return;
          }
           Node node=new Node(val);
           node.next=p.next;
           p.next=node;
           node.previ=p;
           if(node.next!=null)
             {
           node.next.previ=node;
             }
       }


    private class Node {
        int val;
        Node next;
        Node previ;
        Node(int val)
        {
            this.val=val;
        }
    
        Node(int val,Node next,Node previ)
        {
            this.val=val;
            this.next=next;
            this.previ=previ;
           
            
        }
    }
    
}
