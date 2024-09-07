package com.project2;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class button extends JFrame
{
   button()
   {
       JPanel enterInfo = new JPanel();
       JPanel signIn = new JPanel();
       JPanel home = new JPanel();
       JPanel display = new JPanel();

       JLabel l1 = new JLabel("Welcome to Student Registration System");
       l1.setBounds(50, 100, 300, 30);
       JButton b1 = new JButton("Register");
       b1.setBounds(100, 150, 100, 30);
       add(l1);
       add(b1);
       setSize(350,350);
       setLayout(null);
       setVisible(true);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       b1.addActionListener(new ActionListener()
       {
           @Override
           public void actionPerformed(ActionEvent e)
           {
               new info();
               setVisible(false);
           }
       });
   }
}