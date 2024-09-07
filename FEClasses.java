package com.project2;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FEClasses extends JFrame
{
    FEClasses()
    {
        JFrame FEClasses = new JFrame();
        String columns5[] = {"Semester 1", "Semester 2", "Semester 3", "Semester 4", "Semester 5", "Semester 6", "Semester 7", "Semester 8"};
        String data5[][] = {
                {"Computer and Information Technology", "Introduction to Food Engineering", "Ataturk’s Principles and History of Turkish Revolution 1", "Ataturk’s Principles and History of Turkish Revolution 2", "Food Analysis", "Dairy Technology", "Food Hygiene and Sanitation", "Ethics in Good Engineering"},
                {"Physics 1", "Physics 2", "Energy and Mass Balances", "Engineering Unit Operations 1", "Engineering Unit Operations 2", "Grain Processing Technology", "Thesis and Project Preparation Methods", "Food Biotechnology"},
                {"Physics Lab 1", "Physics Lab 2", "Food Chemistry 1", "Food Chemistry 2", "Meat Technology", "Instrumental Analysis", "Process Control", "Vegetable Oil Technology"},
                {"General Biology", "Organic Chemistry", "Applied Computer Programming", "Fluid Mechanics", "Fruit and Vegetable Technology", "Food Safety Engineering", "Quality Management System in Food Engineering", "Food and Nutrition"},
                {"General Chemistry", "IZU Common Elective", "Statistics", "General Microbiology", "Food Microbiology", "Faculty Elective", "IZU Common Elective", "Faculty Elective"},
                {"Mathematics 1", "Mathematics 2", "Analytical Chemistry", "Thermodynamics", "Faculty Elective", "Faculty Elective", "Faculty Elective", "Faculty Elective"},
                {"Turkish Language 1", "Turkish Language 2", "Chemistry Lab", "Professional English", "Internship 1", "Internship 2", "Faculty Elective", "Faculty Elective"},
                {"English 1", "English 2", "Differential Equations", "IZU Common Elective", "Faculty Elective", "----", "Faculty Elective", "Graduation Project"},
                {"----", "----", "IZU Common Elective", "----", "----", "----", "----", "----"}
        };
        JTable FdEngClasses = new JTable(data5, columns5);
        FdEngClasses.setBounds(30, 70, 1000, 300);

        JButton back = new JButton("Back");
        back.setBounds(50, 300, 80, 30);

        JLabel title = new JLabel("Food Engineering 4-Year Course Plan");
        title.setBounds(10, 10, 300, 30);

        JLabel test4 = new JLabel("test");
        test4.setBounds(50, 100, 80, 30);

        FdEngClasses.setCellSelectionEnabled(true);
        FEClasses.add(title);
        FEClasses.add(FdEngClasses);
        FEClasses.add(back);
        FEClasses.add(test4);
        FEClasses.setVisible(true);
        FEClasses.setSize(1200, 500);
        FEClasses.setLayout(null);
        FEClasses.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FEClasses.setVisible(false);
                new home();
            }
        });
    }

}
