public class MainCC {
    
        public static void main(String[] args) {
            CCLinkedList list=new CCLinkedList();
            list.insert(12);
            list.insert(22);
            list.insert(32);
            list.insert(90);
            list.insert(39);
            list.insert(2);
               list.insert(90);
            list.display();
            list.delete(2);

    
              
             list.display();

             System.out.println(list.hasCycle(null));
        }
        
    }
    
    

