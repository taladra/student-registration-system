package com.project2;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SEClasses extends JFrame
{
    SEClasses()
    {
        JFrame SEClasses = new JFrame();
        String columns1[] = {"Semester 1", "Semester 2", "Semester 3", "Semester 4", "Semester 5", "Semester 6", "Semester 7", "Semester 8"};
        String data1[][] = {
                {"Ataturk's Principles and History of Turkish Revolution 1", "Ataturk's Principles and History of Turkish Revolution 2", "Visual Programming", "Web Programming", "Operating Systems", "System Analysis", "Computer Networks", "Game Programming"},
                {"Physics 1", "Physics 2", "Probability and Statistics", "Occupational Health and Safety", "Database Systems", "Advanced Algorithms", "Formal Languages and Automata Theory", "Software Architecture"},
                {"Physics Lab 1", "Physics Lab 2", "Discrete Mathematics", "Differential Equations", "Programming Languages", "Introduction to Machine Learning", "Software Measurment and Testing", "Faculty Elective"},
                {"Mathematics 1", "Mathematics 2", "Numerical Methods", "Graphical Programming", "IZU Common Elective", "IZU Common Elective", "Faculty Elective", "Faculty Elective"},
                {"Computer Programming 1", "Computer Programming 2", "Computing Systems", "Algorithm Analysis", "Faculty Elective", "Faculty Elective", "Faculty Elective", "Faculty Elective"},
                {"Turkish Language 1", "Turkish Language 2", "Data Structures", "Object Oriented Programming", "Internship 1", "Internship 2", "----", "Graduation Project"},
                {"Advanced English 1", "Advanced English 2", "IZU Common Elective", "IZU Common Elective", "----", "----", "----", "----"},
                {"Introduction to Software Engineering", "Linear Algebra", "----", "----", "----", "----", "----", "----"}
        };

        JTable SoftEngClasses = new JTable(data1, columns1);
        SoftEngClasses.setBounds(30, 70, 1000, 100);

        JLabel test = new JLabel("test");
        test.setBounds(50, 100, 80, 30);

        JButton back = new JButton("Back");
        back.setBounds(50, 300, 80, 30);

        JLabel title = new JLabel("Software Engineering 4-Year Course Plan");
        title.setBounds(10, 10, 300, 30);

        SoftEngClasses.setCellSelectionEnabled(true);
        SEClasses.add(title);
        SEClasses.add(SoftEngClasses);
        SEClasses.add(back);
        SEClasses.add(test);
        SEClasses.setVisible(true);
        SEClasses.setSize(1200, 500);
        SEClasses.setLayout(null);
        SEClasses.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SEClasses.setVisible(false);
                new home();
            }
        });
    }
}
