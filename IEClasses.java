package com.project2;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IEClasses extends JFrame
{
    IEClasses()
    {
        JFrame IEClasses = new JFrame();
        String columns4[] = {"Semester 1", "Semester 2", "Semester 3", "Semester 4", "Semester 5", "Semester 6", "Semester 7", "Semester 8"};
        String data4[][] = {
                {"Computer and Information Technology 1", "Computer and Information Technology 2", "Ataturk’s Principles and History of Turkish Revolution 1", "Ataturk’s Principles and History of Turkish Revolution 2","Production Planning and Control", "Work Study", "Supply Chain Management", "Project Management"},
                {"Introduction to Industrial Engineering", "Computer Aided Technical Drawing", "Introduction to Programming", "Operations Research 1", "Operations Research 2", "Decision Theory", "Management and Organization", "Employment Law for Industrial Engineers"},
                {"Physics 1", "Physics 2", "Business Management for Industrial Engineers", "Engineering Economics", "Ergonomics", "Simulation", "Quality Engineering", "Occupational Health and Safety"},
                {"Physics Lab 1", "Physics Lab 2", "Introduction to Economics", "Manufacturing Technologies", "Research and Report Writing Techniques", "Introduction to System Analysis", "Faculty Elective", "Faculty Elective"},
                {"General Chemistry", "IZU Common Elective", "Statistics 1", "Statistics 2", "Faculty Elective", "Faculty Elective", "IZU Common Elective", "Faculty Elective"},
                {"Mathematics 1", "Mathematics 2", "Linear Algebra", "Differential Equations", "Internship 1", "Internship 2", "Graduation Project 1", "Graduation Project 2"},
                {"Turkish Language 1", "Turkish Language 2", "IZU Common Elective", "Management and Cost Accounting", "IZU Common Elective", "----", "----", "----"},
                {"Advanced English 1", "Advanced English 2", "----", "----", "----", "----", "----", "----"}
        };
        JTable IndEngClasses = new JTable(data4, columns4);
        IndEngClasses.setBounds(30, 70, 1000, 300);

        JButton back = new JButton("Back");
        back.setBounds(50, 300, 80, 30);

        JLabel title = new JLabel("Industrial Engineering 4-Year Course Plan");
        title.setBounds(10, 10, 300, 30);

        JLabel test2 = new JLabel("test");
        test2.setBounds(50, 100, 80, 30);

        IndEngClasses.setCellSelectionEnabled(true);
        IEClasses.add(title);
        IEClasses.add(IndEngClasses);
        IEClasses.add(back);
        IEClasses.add(test2);
        IEClasses.setVisible(true);
        IEClasses.setSize(1200, 500);
        IEClasses.setLayout(null);
        IEClasses.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                IEClasses.setVisible(false);
                new home();
            }
        });
    }
}
