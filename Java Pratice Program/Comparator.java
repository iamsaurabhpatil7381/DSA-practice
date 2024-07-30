

public class Comparator implements Comparable<Comparator>{
    int rollno;
    int marks;

    Comparator(int rollno,int marks)
    {
        this.rollno=rollno;
        this.marks=marks;
    }

    @Override
    public int compareTo(Comparator o)
    {
        int diff=(int)(this.marks-o.marks);
        return diff;
    }
      
    public static void main(String[] args) {
        
        Comparator kunal=new Comparator(9,50);
        Comparator rahul=new Comparator(19,70);
    
        if(kunal.compareTo(rahul) <0)
        {
            System.out.println(kunal.compareTo(rahul));
            System.out.println("rahul has more marks");
        }
    }
}
