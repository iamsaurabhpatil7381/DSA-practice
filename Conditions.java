public class Conditions {
    public static void main(String[] args) {
        int salary=40000;
        if(salary>10000)
        {
            salary+=2000;
            System.out.println(salary);
        }
        else if(salary>30000)
        {
            salary+=3000;
            System.out.println(salary);
        }
        else
        {
            salary+=0;
            System.out.println(salary);

        }
    }
    
}
