
package com.mycompany.back_up_system;

import java.awt.Desktop;

import java.io.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.Timer;


public class BackUp extends javax.swing.JFrame implements ActionListener {

    
    public BackUp() {
        initComponents();
        times();
       
        
    }
    public void times()
    {
    
     
         new Timer(0, (ActionEvent ae) -> {
             Date d=new Date();
             SimpleDateFormat s=new SimpleDateFormat("hh-mm-ss");
             
             String time=s.format(d);
             l_time.setText(time);
         }).start();
    
    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        popupMenu1 = new java.awt.PopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        multiFileButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        l_time = new javax.swing.JTextField();
        singleButton = new javax.swing.JButton();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        popupMenu1.setLabel("popupMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel2.setBackground(new java.awt.Color(153, 255, 102));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("Source");

        jLabel7.setBackground(new java.awt.Color(153, 204, 0));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 51));
        jLabel7.setText("Date ");

        jLabel9.setBackground(new java.awt.Color(153, 204, 0));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 51));
        jLabel9.setText("Time");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 157, -1, 420));

        jPanel2.setBackground(new java.awt.Color(102, 255, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(204, 204, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("BACKUP SYSTEM");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 30, 335, 84));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sourabh\\Documents\\NetBeansProjects\\Back_Up_System\\src\\main\\java\\com\\mycompany\\back_up_system\\icons\\back1.jpg")); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, -4, 200, 160));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1175, -1));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 211, 49));

        multiFileButton.setBackground(new java.awt.Color(255, 153, 204));
        multiFileButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        multiFileButton.setForeground(new java.awt.Color(153, 0, 51));
        multiFileButton.setText("Select Mulitple file");
        multiFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiFileButtonActionPerformed(evt);
            }
        });
        getContentPane().add(multiFileButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 400, -1));

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));

        jButton4.setBackground(new java.awt.Color(204, 204, 255));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 51, 0));
        jButton4.setText("RUN");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(413, 413, 413)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(638, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(257, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 572, 1180, 340));
        getContentPane().add(l_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 470, 211, 47));

        singleButton.setBackground(new java.awt.Color(255, 153, 204));
        singleButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        singleButton.setForeground(new java.awt.Color(153, 0, 51));
        singleButton.setText("Select single file");
        singleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singleButtonActionPerformed(evt);
            }
        });
        getContentPane().add(singleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 400, -1));

        pack();
    }// </editor-fold>                        

    private void multiFileButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                
        
                                                     
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();

    fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
    fileChooser.setMultiSelectionEnabled(true); // Enable multiple file selection

   int result = fileChooser.showOpenDialog(null);
    
         if (result == JFileChooser.APPROVE_OPTION)
        {
                File selectedDirectory = fileChooser.getSelectedFile();
                
               int choice = JOptionPane.showOptionDialog(
                     null,  "Do you want to create a file?" ,"Confirmation",
                         JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE, null,
                            new String[]{"Yes", "No"},"Yes");

             if (choice == JOptionPane.NO_OPTION) {
                       // Continue with file creation process
                 }
                else
               {
                   
                  {
                  String fileName = JOptionPane.showInputDialog("Enter file name:");
                   if (fileName != null && !fileName.trim().isEmpty())
                   {
                   File newFile = new File(selectedDirectory, fileName);
               
                 try
                  {
                    boolean created = newFile.createNewFile();
                   if (created) 
                   {
                       JOptionPane.showMessageDialog(null, "File created successfully!");
                          } 
                   else 
                   {
                      JOptionPane.showMessageDialog(null, "File already exists!");
                         }
                    } 
                   catch (IOException e)
                  {
                   JOptionPane.showMessageDialog(null, "Error creating file: " + e.getMessage());
                    e.printStackTrace();
                     }
                  }
                
                  else
                   {
                   JOptionPane.showMessageDialog(null, "Invalid file name!");               }
                   }
               }
        }
    
               
             File[] selectedFiles = fileChooser.getSelectedFiles();
                   System.out.println("Selected files:");
                        for (File file : selectedFiles) {
                      System.out.println(file.getAbsolutePath());
                           OpenFileViaExplorer(file);
                     }
            
               // User canceled the operation
                       System.out.println("File selection canceled.");
                 
    }                                               

    private void singleButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
         JFileChooser fileChooser = new JFileChooser();
      fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
    fileChooser.setMultiSelectionEnabled(false); // Enable multiple file selection


    int result = fileChooser.showOpenDialog(null);
    if (result == JFileChooser.APPROVE_OPTION) {
         File selectedDirectory = fileChooser.getSelectedFile();
         
         int choice = JOptionPane.showOptionDialog(
                     null,  "Do you want to create a file?" ,"Confirmation",
                         JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE, null,
                            new String[]{"Yes", "No"},"Yes");

             if (choice == JOptionPane.NO_OPTION) {
                       // Continue with file creation process
                 }
                       else{
                              String fileName = JOptionPane.showInputDialog("Enter file name:");
                     if (fileName != null && !fileName.trim().isEmpty())
                     {
                                      File newFile = new File(selectedDirectory, fileName);
                
                       try {
                                       boolean created = newFile.createNewFile();
                               if (created) {
                                          JOptionPane.showMessageDialog(null, "File created successfully!");
                                           } 
                                  else {
                                 JOptionPane.showMessageDialog(null, "File already exists!");
                                   }
                             } 
                                catch (IOException e)
                                {
                                   JOptionPane.showMessageDialog(null, "Error creating file: " + e.getMessage());
                                   e.printStackTrace();
                                }
                                  
                  }
                              
                     
                     else {
                                     JOptionPane.showMessageDialog(null, "Invalid file name!");
                                      }
                                
             }
     
        // User has selected a file
                 java.io.File selectedFile = fileChooser.getSelectedFile();
                    System.out.println("Selected file: " + selectedFile.getAbsolutePath());
                    OpenFileViaExplorer(selectedFile);
            }
    else {
        // User canceled the operation
        System.out.println("File selection canceled.");
          }     
    }                                            
public static boolean OpenFileViaExplorer(File file)
        {
            
               try {
                   if (!Desktop.isDesktopSupported()) 
                   {
                    System.out.println("Not supported");
                     return false;
                    }
                    else {
                     Desktop desktop = Desktop.getDesktop();
                     desktop.open(file);
                     return true;
                  }
               } 
             catch (IOException e) 
             {
               System.out.println(e);
                return false;
            }
        }
   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new BackUp().setVisible(true);
        });
    }

    // Variables declaration - do not modify                     
     javax.swing.JButton jButton4;
    com.toedter.calendar.JDateChooser jDateChooser1;
    javax.swing.JFrame jFrame1;
    javax.swing.JFrame jFrame2;
    javax.swing.JLabel jLabel2;
    javax.swing.JLabel jLabel6;
    javax.swing.JLabel jLabel7;
    javax.swing.JLabel jLabel8;
    javax.swing.JLabel jLabel9;
    javax.swing.JPanel jPanel1;
    javax.swing.JPanel jPanel2;
    javax.swing.JPanel jPanel3;
    javax.swing.JPopupMenu jPopupMenu1;
    javax.swing.JPopupMenu jPopupMenu2;
    javax.swing.JTextField l_time;
    java.awt.Menu menu1;
    java.awt.Menu menu2;
    java.awt.MenuBar menuBar1;
    javax.swing.JButton multiFileButton;
    java.awt.PopupMenu popupMenu1;
    javax.swing.JButton singleButton;
    // End of variables declaration                   

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }


}
