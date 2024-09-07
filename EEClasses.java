package com.project2;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EEClasses extends JFrame
{
    EEClasses()
    {
        JFrame EEClasses = new JFrame();
        String columns3[] = {"Semester 1", "Semester 2", "Semester 3", "Semester 4", "Semester 5", "Semester 6", "Semester 7", "Semester 8"};
        String data3[][] = {
                {"Ataturk’s Principles and History of Turkish Revolution 1", "Ataturk’s Principles and History of Turkish Revolution 2", "Electronics 1", "Electronics 2", "Power Electronics", "Electrical Machines", "Robotics", "Energy Transmission Systems"},
                {"Introduction to Algorithm and Programming", "Electronic 1", "Electronics Lab 1", "Electronics Lab 2", "Power Electronics Lab", "Electrical Machines Lab", "Illumination Techniques", "High Voltage Techniques"},
                {"Introduction to Electrical-Electronics Engineering", "Linear Algebra", "Digital Circuit Design", "Circuit Theory", "Automatic Control Systems", "Discrete-Time Control Systems", "Antennas and Propagation", "Protection Systems in Electrical Installations"},
                {"Physics 1", "Physics 2", "Material Science", "Circuit Theory Lab", "Communication Theory", "Scientific Research Tech. and Ethics", "Faculty Elective", "Faculty Elective"},
                {"Physics Lab 1", "Physics Lab 2", "Digital Electronics Lab", "Electromagnetic Field Theory", "Communication Lab", "Robotics Lab", "Faculty Elective", "Faculty Elective"},
                {"Mathematics 1", "Mathematics 2", "Mathematics 3", "Occupational Health and Safety", "Internship 1", "Faculty Elective", "Material Science", "Graduation Project"},
                {"Turkish Language 1", "Turkish Language 2", "Differential Equations", "Probability and Statistics", "IZU Common Elective", "Faculty Elective", "----", "----"},
                {"Advanced English 1", "Advanced English 2", "IZU Common Elective", "IZU Common Elective", "Material Science", "IZU Common Elective", "----", "----"}
        };
        JTable ElecEngClasses = new JTable(data3, columns3);
        ElecEngClasses.setBounds(30, 70, 1000, 300);
        ElecEngClasses.setCellSelectionEnabled(true);

        JButton back = new JButton("Back");
        back.setBounds(50, 300, 80, 30);

        JLabel title = new JLabel("Electrical-Electronic Engineering 4-Year Course Plan");
        title.setBounds(10, 10, 400, 30);

        JLabel test5 = new JLabel("test");
        test5.setBounds(50, 100, 80, 30);

        EEClasses.add(title);
        EEClasses.add(ElecEngClasses);
        EEClasses.add(back);
        EEClasses.add(test5);
        EEClasses.setVisible(true);
        EEClasses.setSize(1200, 500);
        EEClasses.setLayout(null);
        EEClasses.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EEClasses.setVisible(false);
                new home();
            }
        });
    }
}
