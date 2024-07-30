import javax.swing.*;
import java.awt.event.*;
class Login3 extends JFrame
 {
     JLabel j1,j2,j3,j4;
      JTextField t1,t2;
     // JTextArea t2;
      JButton b1,b2;

   Login3(String r)
   { 
     super(r);
  }
Login3()
{
}
  void disp()
  {
   j1=new JLabel("Please fill the information");
    j2=new JLabel("your name"); 
   j3=new JLabel("address");
   j4=new JLabel();
   t1=new JTextField();
    t2=new JTextField();
   b1=new JButton("submit");
      b2=new JButton("clear");
    b1.addActionListener(new Hi());
      setLayout(null);
    
    add(j1);  
     add(j2);
     add(j3);
      add(j4);
      add(t1);
      add(t2);
      add(b1);
      add(b2);
    
   j1.setBounds(100,50,300,30);
    j2.setBounds(100,200,100,30);
    j3.setBounds(100,250,100,30);
    j4.setBounds(100,300,100,30);
   t1.setBounds(350,350,100,30);
     t2.setBounds(350,400,100,30);
    b1.setBounds(400,450,100,30);
     b2.setBounds(500,500,100,30);
}
   public static void main(String args[])
   {
       Login3 li=new Login3("just java things");
        li.setSize(800,800);
         li.setVisible(true);
          li.disp();
           li.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
  class Hi  implements ActionListener
{
       public void  actionPerformed(ActionEvent e1) 
     {
       String m1=t1.getText();
        String m2=t2.getText();
      if( m1.equals("saurabh")  &&  m2.equals("walve"))
       {
        
       j4.setText("login successful");
   }
else
   {
       j4.setText("login unsuccessful");
       
   }
}
}
}