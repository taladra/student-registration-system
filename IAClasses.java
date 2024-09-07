package com.project2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IAClasses extends JFrame
{
    IAClasses()
    {
        JFrame IAClasses = new JFrame();
        String columns6[] = {"Semester 1", "Semester 2", "Semester 3", "Semester 4", "Semester 5", "Semester 6", "Semester 7", "Semester 8"};
        String data6[][] = {
                {"Computer and Information Technology", "IZU Common Elective", "Ataturk’s Principles and History of Turkish Revolution 1", "Ataturk’s Principles and History of Turkish Revolution 2", "Furniture Design 1", "Furniture Design 2", "Design for All", "Professional Practice and Ethics"},
                {"Basic Design 1", "Basic Design 2", "Building Science 1", "Building Science 2", "Recreation Spaces", "Conservation Techniques and Methods", "Cost Planning in Interior Design", "IZU Common Elective"},
                {"Architecture Mathematics", "Perspective", "Thin Structure Applications", "Construction Systems Principles", "Control of the Physical Environment 1", "Control of the Physical Environment 2", "Interior Design Project 4", "IZU Common Elective"},
                {"Building Information 1", "Building Information 2", "Computer Aided Drawing 1", "Computer Aided Drawing 2", "Interior Design Project 2", "Interior Design Project 3", "IZU Common Elective", "Faculty Elective"},
                {"Architectural Drawing and Rendering Techniques", "Occupational Safety", "History of Art and Architecture 1", "History of Art and Architecture 2", "Faculty Elective", "Faculty Elective", "Faculty Elective", "Faculty Elective"},
                {"Architectural Design 1", "Architectural Design 2", "Architectural Design 3", "Interior Design Project 1", "Internship 1", "Internship 2", "Faculty Elective", "Graduation Project"},
                {"Turkish Language 1", "Turkish Language 2", "Building Materials 1", "Building Materials 2", "----", "----", "----", "----"},
                {"English 1", "English 2", "----", "----", "----", "----", "----", "----"}
        };
        JTable IntArchClasses = new JTable(data6, columns6);
        IntArchClasses.setBounds(30, 70, 1000, 300);

        JButton back = new JButton("Back");
        back.setBounds(50, 300, 80, 30);

        JLabel title = new JLabel("Internal Architecture 4-Year Course Plan");
        title.setBounds(10, 10, 300, 30);

        JLabel test3 = new JLabel("test");
        test3.setBounds(50, 100, 80, 30);

        IntArchClasses.setCellSelectionEnabled(true);
        IAClasses.add(title);
        IAClasses.add(test3);
        IAClasses.add(IntArchClasses);
        IAClasses.add(back);
        IAClasses.setVisible(true);
        IAClasses.setSize(1200, 500);
        IAClasses.setLayout(null);
        IAClasses.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                IAClasses.setVisible(false);
                new home();
            }
        });
    }
}
