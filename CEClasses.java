package com.project2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CEClasses extends JFrame
{
    CEClasses()
    {
        JFrame CEClasses = new JFrame();
        String columns2[] = {"Semester 1", "Semester 2", "Semester 3", "Semester 4", "Semester 5", "Semester 6", "Semester 7", "Semester 8"};
        String data2[][] = {
                {"Ataturk’s Principles and History of Turkish Revolution 1", "Ataturk’s Principles and History of Turkish Revolution 2", "Digital Design", "Web Programming", "Operating Systems", "Computer Organization", "Computer Networks", "System Programming"},
                {"Computer Programming 1", "Computer Programming 2", "Introduction to Electric-Electronics", "Microprocessors", "Database Systems", "System Analysis", "Formal Languages and Automata Theory", "Occupational Health and Safety"},
                {"Introduction to Computer Science", "Linear Algebra", "Introduction to Electric-Electronics Lab", "Microprocessors Lab", "IZU Common Elective", "IZU Common Elective", "Object Oriented Design", "Faculty Elective"},
                {"Physics 1", "Physics 2", "Data Structures", "Algorithm Analysis", "Faculty Elective", "Faculty Elective", "Faculty Elective", "Faculty Elective"},
                {"Physics Lab 1", "Physics Lab 2", "Visual Programming", "Object Oriented Programming", "Faculty Elective", "Faculty Elective", "Faculty Elective", "Faculty Elective"},
                {"Mathematics 1", "Mathematics 2", "Probability and Statistics", "Differential Equations", "Internship 1", "Internship 2", "----", "Graduation Study"},
                {"Turkish Language 1", "Turkish Language 2", "Discrete Mathematics", "Numerical Methods", "----", "----", "----", "----"},
                {"English 1", "English 2", "IZU Common Elective", "IZU Common Elective", "----", "----", "----", "----"}
        };
        JTable CompEngClasses = new JTable(data2, columns2);
        CompEngClasses.setBounds(30, 70, 1000, 300);

        JLabel test6 = new JLabel("test");
        test6.setBounds(50, 100, 80, 30);

        JButton back = new JButton("Back");
        back.setBounds(50, 300, 80, 30);

        JLabel title = new JLabel("Computer Engineering 4-Year Course Plan");
        title.setBounds(10, 10, 300, 30);

        CompEngClasses.setCellSelectionEnabled(true);
        CEClasses.add(title);
        CEClasses.add(CompEngClasses);
        CEClasses.add(back);
        CEClasses.add(test6);
        CEClasses.setVisible(true);
        CEClasses.setSize(1200, 500);
        CEClasses.setLayout(null);
        CEClasses.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CEClasses.setVisible(false);
                new home();
            }
        });
    }
}
