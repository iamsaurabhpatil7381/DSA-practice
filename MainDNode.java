public class MainDNode {
    public static void main(String[] args) {
        DoubleLinkedList list=new DoubleLinkedList();
        list.insertFirst(12);
        list.insertFirst(22);
        list.insertFirst(32);
        list.insertFirst(2);
           list.insertLast(90);
        list.display();

        list.insert(32, 40);
    
    }
    
}
