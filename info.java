package com.project2;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class info extends JFrame
{
    info()
    {
        JFrame info = new JFrame();

       JPanel enterInfo = new JPanel();
       JLabel fname = new JLabel("Name: ");
       JTextField txt_fname = new JTextField(" ");
       JLabel lname = new JLabel("Surname: ");
       JTextField txt_lname = new JTextField(" ");
       JLabel idno = new JLabel("Passport/ID Number: ");
       JTextField txt_idno = new JTextField(" ");
       JLabel dob = new JLabel("Date of Birth (MM/DD/YYYY): ");
       JTextField txt_dob = new JTextField(" ");
       JLabel phone = new JLabel("Phone Number: ");
       JTextField txt_phone = new JTextField(" ");
       JLabel faculty = new JLabel("Faculty: ");
       JTextField txt_faculty = new JTextField(" ");
       JLabel major = new JLabel("Major: ");
       JTextField txt_major = new JTextField(" ");
       JButton save = new JButton("Save");
       JButton disp = new JButton("Display Information");

       JPanel display = new JPanel();
       JLabel dispName = new JLabel("Name: ");
       String Fname = txt_fname.getText();
       JTextField t_dispName = new JTextField(Fname);
       JLabel disp_lname = new JLabel("Surname: ");
       String Lname = txt_lname.getText();
       JTextField t_dispLname = new JTextField(Lname);
       JLabel disp_idno = new JLabel("Passport/ID Number: ");
       String IDNO = txt_idno.getText();
       JTextField t_dispIdno = new JTextField(IDNO);
       JLabel disp_dob = new JLabel("Date of Birth (MM/DD/YYYY): ");
       String DOB = txt_dob.getText();
       JTextField t_dispDob = new JTextField(DOB);
       JLabel disp_phone = new JLabel("Phone Number: ");
       String Phone = txt_phone.getText();
       JTextField t_dispPhone = new JTextField(Phone);
       JLabel disp_faculty = new JLabel("Faculty: ");
       String Faculty = txt_faculty.getText();
       JTextField t_dispFaculty = new JTextField(Faculty);
       JLabel disp_major = new JLabel("Major: ");
       String Major = txt_major.getText();
       JTextField t_dispMajor = new JTextField(Major);
       JLabel disp_email = new JLabel("Student Email: ");
       String Email = Fname + "." + Lname + "@std.izu.edu.tr";
       JTextField t_dispEmail = new JTextField(Email);
       JButton back = new JButton("Back");

       JPanel signIn = new JPanel();
       JLabel l2 = new JLabel("Registration Successful");
       JButton b2 = new JButton("Go to Home Page");
       b2.setVisible(false);

       fname.setBounds(50, 100, 100, 30);
       txt_fname.setBounds(250, 100, 100, 30);
       lname.setBounds(50, 150, 100, 30);
       txt_lname.setBounds(250, 150, 100, 30);
       idno.setBounds(50, 200, 150, 30);
       txt_idno.setBounds(250, 200, 150, 30);
       dob.setBounds(50, 250, 200, 30);
       txt_dob.setBounds(250, 250, 200, 30);
       phone.setBounds(50, 300, 150, 30);
       txt_phone.setBounds(250, 300, 150, 30);
       faculty.setBounds(50, 350, 100, 30);
       txt_faculty.setBounds(250, 350, 100, 30);
       major.setBounds(50, 400, 100, 30);
       txt_major.setBounds(250, 400, 100, 30);
       save.setBounds(75, 450, 100, 30);
       disp.setBounds(200, 450, 200, 30);
       enterInfo.add(fname);
       enterInfo.add(txt_fname);
       enterInfo.add(lname);
       enterInfo.add(txt_lname);
       enterInfo.add(idno);
       enterInfo.add(txt_idno);
       enterInfo.add(dob);
       enterInfo.add(txt_dob);
       enterInfo.add(phone);
       enterInfo.add(txt_phone);
       enterInfo.add(faculty);
       enterInfo.add(txt_faculty);
       enterInfo.add(major);
       enterInfo.add(txt_major);
       enterInfo.add(save);
       enterInfo.add(disp);
       enterInfo.setSize(600, 600);
       enterInfo.setLayout(null);
       save.addActionListener(new ActionListener()
       {
          @Override
          public void actionPerformed(ActionEvent e)
          {
             if(txt_fname.getText().equals(" ") || txt_lname.getText().equals(" ") ||
                     txt_dob.getText().equals(" ") || txt_idno.getText().equals(" ") ||
                     txt_phone.getText().equals(" ") || txt_faculty.getText().equals(" ")
                     || txt_major.getText().equals(" "))
             {
                JOptionPane.showMessageDialog(null, "ALL FIELDS MUST BE COMPLETED", "ERROR", JOptionPane.ERROR_MESSAGE);
             }
             else
             {
                signIn.setVisible(true);
                b2.setVisible(true);
                enterInfo.setVisible(false);
             }
          }
       });
       disp.addActionListener(new ActionListener()
       {
          @Override
          public void actionPerformed(ActionEvent e)
          {
             display.setVisible(true);
             enterInfo.setVisible(false);
          }
       });

       dispName.setBounds(50, 100, 100, 30);
       t_dispName.setBounds(250, 100, 100, 30);
       disp_lname.setBounds(50, 150, 100, 30);
       t_dispLname.setBounds(250, 150, 100, 30);
       disp_idno.setBounds(50, 200, 150, 30);
       t_dispIdno.setBounds(250, 200, 150, 30);
       disp_dob.setBounds(50, 250, 200, 30);
       t_dispDob.setBounds(250, 250, 200, 30);
       disp_phone.setBounds(50, 300, 150, 30);
       t_dispPhone.setBounds(250, 300, 150, 30);
       disp_faculty.setBounds(50, 350, 100, 30);
       t_dispFaculty.setBounds(250, 350, 300, 30);
       disp_major.setBounds(50, 400, 100, 30);
       t_dispMajor.setBounds(250, 400, 300, 30);
       disp_email.setBounds(50, 450, 200, 30);
       t_dispEmail.setBounds(250, 450, 500, 30);
       back.setBounds(200, 500, 80, 30);
       display.add(dispName);
       display.add(t_dispName);
       display.add(disp_lname);
       display.add(t_dispLname);
       display.add(disp_idno);
       display.add(t_dispIdno);
       display.add(disp_dob);
       display.add(t_dispDob);
       display.add(disp_phone);
       display.add(t_dispPhone);
       display.add(disp_faculty);
       display.add(t_dispFaculty);
       display.add(disp_major);
       display.add(t_dispMajor);
       display.add(disp_email);
       display.add(t_dispEmail);
       display.add(back);
       display.setSize(600, 600);
       display.setLayout(null);
       back.addActionListener(new ActionListener()
       {
           @Override
           public void actionPerformed(ActionEvent e)
           {
               display.setVisible(false);
               enterInfo.setVisible(true);
           }
       });

       l2.setBounds(50, 100, 200, 30);
       b2.setBounds(50, 150, 200, 30);
       signIn.add(l2);
       signIn.add(b2);
       signIn.setSize(300, 300);
       signIn.setLayout(null);
       b2.addActionListener(new ActionListener()
       {
          @Override
          public void actionPerformed(ActionEvent e)
          {
             signIn.setVisible(false);
             new home();
          }
       });

       info.add(enterInfo);
       info.add(display);
       info.add(signIn);
       info.setSize(700, 700);
       info.setLayout(null);
       info.setVisible(true);
       info.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}