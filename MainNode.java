public class MainNode {
    public static void main(String[] args) {
        LL l=new LL();
        l.insertFirst(10);
        l.insertFirst(20);
        l.insertFirst(30);
        l.insertFirst(40);

        l.insertLast(99);
        l.insertJust(100, 3);

        
        l.display();
        System.out.println(l.deleteFirst());
        l.display();

        System.out.println(l.deleteLast());
        l.display();


        System.out.println(l.delete(2));
        l.display();

        l.insertRec(88, 2);
        l.display();
    }
    
}
