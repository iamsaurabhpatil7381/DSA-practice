import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class LoginF extends JFrame {
     JLabel l1,l2,l3,l4,l5,l6,l7;
     JTextField t1,t3,t4;
     JPasswordField t5;
     JTextArea t2;
     JButton b1,b2,b3;
    Font f=new Font("Times new roman",Font.BOLD,22);

    LoginF(String h)
    {
        super(h);
    }
    LoginF()
    {

    }
     Cursor c1=new Cursor(Cursor.HAND_CURSOR);
     Cursor c2=new Cursor(Cursor.CROSSHAIR_CURSOR);
     Font f1=new Font("Times new Roman",Font.BOLD,22);
     
    
    void display()
    {
        l1=new JLabel("your name");
        t1=new JTextField();
        l1.setFont(f1);
        l1.setForeground(Color.red);
     
        l2=new JLabel("address");
        l2.setFont(f);
       
        t2=new JTextArea();
        t2.setBackground(Color.red);
        l3=new JLabel("Mobile no");
        l2.setFont(f1);
        t3=new JTextField();
        l4=new JLabel("email id");
        t4=new JTextField();
        t1=new JTextField();
        l5=new JLabel();
        l6=new JLabel("password");
        t5=new JPasswordField();
        l7=new JLabel();
        b1=new JButton("submit");
        b1.setForeground(Color.white);
        b1.setBackground(Color.red);
        
        b2=new  JButton("Autofield");
        b2.setCursor(c1);
        b3=new JButton("Add");
        
        b1.setBackground(Color.gray);

       
        setLayout(null);
         add(l1);
         add(t1);
         add(l2);
         add(t2);
         add(l3);
         add(t3);
         add(l4);
         add(t4);
         add(l5);
         add(l6);
         add(l7);
         add(t5);
         add(b1);
         add(b2);
         add(b3);
         l1.setBounds(100,200,300,30);
         t1.setBounds(250,200,100,30);
         l2.setBounds(150,270,100,30);
         t2.setBounds(250,270,200,50);
         l3.setBounds(150,350,100,30);
         t3.setBounds(300,350,100,30);
         l4.setBounds( 150,400,100,30);
         t4.setBounds(350,400,100,30);
         l5.setBounds(250,450,100,30);
         l6.setBounds(200,470,100,30);
         l7.setBounds(200,490,100,30);
         t5.setBounds(350,470,100,30);
         b1.setBounds(250,500,100,50);
         b2.setBounds(350,600,100,50);
         b3.setBounds(300,650,100,50);
         b1.addActionListener(new Log());
         b2.addActionListener(new Log1());
         b3.addActionListener(new Add());
         l1.addMouseListener(new show());
         b1.setCursor(c1);
         b3.setCursor(c2);
        

    }

    public static void main(String args[])
    {
        LoginF f1=new LoginF("Welcome to java ");
      f1.setSize(800,800);
      f1.setVisible(true);
      f1.display();
      f1.setDefaultCloseOperation(EXIT_ON_CLOSE);


    }
    class Log implements ActionListener
    {
      public void actionPerformed(ActionEvent e1)
      {
        String s1=t1.getText();
        String s2=t4.getText();
            if(s1.equals("saurabh") && s2.equals("s@patil2000"))
             {
                l5.setText("login successful");
              JOptionPane.showMessageDialog(null,"login successful");
                 }
             else
               {
                     l5.setText("login unSuccessful");
                 }
           }
    }
    class Log1 implements ActionListener
    {
        public void actionPerformed(ActionEvent e2)
        {
          t1.setText("saurabh");
          t4.setText("s@patil2000");

           
        }

    }
    class Add implements ActionListener
    {
        public void actionPerformed(ActionEvent e3)
        {
          try{
          int a=Integer.parseInt(t1.getText());
           int a1=Integer.parseInt(t4.getText());
          int c=a+a1;
         l7.setText("Addition:"+c);
          }
          catch(Exception e4)
          {
            l7.setText("something went wrong");
          }


           
        }

    }
    class show implements MouseListener{
      public void mouseExited(MouseEvent m1){

      }
      public void  mouseClicked(MouseEvent m3) {
        l1.setText("");
      }
      public void mouseReleased(MouseEvent m2){
       l1.setText("your name");
      }
      

      public void  mousePressed(MouseEvent m4){
        l1.setText("your name");
      }
      public void  mouseEntered(MouseEvent m5){

      }

    }
   
    
    
    
}
