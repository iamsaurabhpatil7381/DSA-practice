import javax.swing.*;
import  java.awt.event.*;
class  LoginS extends JFrame
{
    JLabel l1,l2,l3,l4;
    JTextField t1,t2;
    JButton b1,b2;
   LoginS (String g)
  {
    super(g);
     }
  LoginS (){

    }
     void setDisp()
    {
       l1=new JLabel("welcome to world");
       l2=new JLabel("username");
       l3=new JLabel("password");
       l4=new JLabel();
       t1=new JTextField();
       t2=new JTextField();
       b1=new JButton("submit");
       b2=new JButton("clear");
     setLayout(null);
        add(l1);
       add(l2);
       add(l3);
       add(l4);
       add(t1);
       add(t2);
       add(b1);
        add(b2);
        l1.setBounds(100,50,300,30);
        l2.setBounds(100,200,100,30);
        l3.setBounds(100,350,100,30);
         l4.setBounds(100,550,100,30);
         t1.setBounds(350,250,100,30);
        t2.setBounds(350,350,100,30);
         b1.setBounds(200,450,100,30);
          b2.setBounds(400,450,100,30);
        b1.addActionListener(new Log());
     
     
     }
    public static void main(String args[])
     {
        LoginS s=new LoginS("Hi ,I am using java ");
          s.setSize(800,700);
          s.setVisible(true);
           s.setDisp();
           s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
      }
     class Log implements ActionListener
{
    public void  actionPerformed(ActionEvent e1)
    {
      String x=t1.getText();
     String x1=t2.getText();
     if(x.equals("coding") && x1.equals("seekho"))
    {
       l4.setText("login successful");
    }
     else
    {
       l4.setText("login unsuccessful");
     }
  }
}
}