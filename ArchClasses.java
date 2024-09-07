package com.project2;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ArchClasses extends JFrame
{
    ArchClasses()
    {
        JFrame ArchClasses = new JFrame();
        String columns7[] = {"Semester 1", "Semester 2", "Semester 3", "Semester 4", "Semester 5", "Semester 6", "Semester 7", "Semester 8"};
        String data7[][] = {
                {"Computer and Information Technology", "Structural Statics", "Ataturk’s Principles and History of Turkish Revolution 1", "Ataturk’s Principles and History of Turkish Revolution 2", "Contemporary Structural Systems", "Urbanism and Zoning Law", "Design for All", "Business Practice and Ethics"},
                {"Architecture Mathematics", "Perspective", "History of Architecture 1", "History of Architecture 2", "History of Architecture 3", "Carrier System Principles", "Construction Project", "Construction Management and Economics"},
                {"Building Information 1", "Building Information 2", "Computer Aided Drawing 1", "Computer Aided Drawing 2", "Surveying Studio", "Conservation and Restoration", "IZU Common Elective", "IZU Common Elective"},
                {"Architectural Design 1", "Architectural Design 2", "Architectural Design 3", "Architectural Design 4", "Architectural Design 5", "Architectural Design 6", "Architectural Design 7", "Faculty Elective"},
                {"Architectural Drawing and Rendering Techniques", "Occupational Safety", "Resistance", "Physical Environmental Control", "IZU Common Elective", "IZU Common Elective", "Faculty Elective", "Faculty Elective"},
                {"Basic Design", "Construction Elements 1", "Construction Elements 2", "Construction Elements 3", "Faculty Elective", "Faculty Elective", "Faculty Elective", "Graduation Project"},
                {"Turkish Language 1", "Turkish Language 2", "Building Materials 1", "Building Materials 2", "Internship 1", "Internship 2", "----", "----"},
                {"English 1", "English 2", "----", "----", "----", "----", "----", "----"}
        };
        JTable Arch_Classes = new JTable(data7, columns7);
        Arch_Classes.setBounds(30, 70, 1000, 300);

        JButton back = new JButton("Back");
        back.setBounds(50, 300, 80, 30);

        JLabel title = new JLabel("Architecture 4-Year Course Plan");
        title.setBounds(10, 10, 300, 30);

        JLabel test7 = new JLabel("test");
        test7.setBounds(50, 100, 80, 30);

        Arch_Classes.setCellSelectionEnabled(true);

        ArchClasses.add(title);
        ArchClasses.add(Arch_Classes);
        ArchClasses.add(back);
        ArchClasses.add(test7);
        ArchClasses.setVisible(true);
        ArchClasses.setSize(1200, 500);
        ArchClasses.setLayout(null);
        ArchClasses.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArchClasses.setVisible(false);
                new home();
            }
        });
    }
}
