package com.project2;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MBGClasses extends JFrame
{
    MBGClasses()
    {
        JFrame MBGClasses = new JFrame();
        String columns8[] = {"Semester 1", "Semester 2", "Semester 3", "Semester 4", "Semester 5", "Semester 6", "Semester 7", "Semester 8"};
        String data8[][] = {
                {"Physics 1", "Computer and Information Technology", "Ataturk’s Principles and History of Turkish Revolution 1", "Ataturk’s Principles and History of Turkish Revolution 2", "Biochemistry 1", "Biochemistry 2", "Genetic Engineering", "Cancer Biology"},
                {"Physics Lab 1", "Organic Chemistry", "Probability and Statistics", "Physiology", "Methods used in Molecular Biology 1", "Methods used in Molecular Biology 2", "Enzymology", "Scientific Research and Writing Techniques"},
                {"General Chemistry", "Molecular Biology Introduction", "Basic Genetics 1", "Basic Genetics 2", "Molecular Genetics 1", "Molecular Genetics 2", "Stem Cell Biology and Tissue Engineering", "Genomic and Proteomics"},
                {"Mathematics 1", "Mathematics 2", "Microbiology", "Bioinformatics", "Biotechnology 1", "Biotechnology 2", "Faculty Elective", "Faculty Elective"},
                {"General Biology", "Turkish Language 2", "Cell Biology 1", "Cell Biology 2", "IZU Common Elective", "Faculty Elective", "Faculty Elective", "Faculty Elective"},
                {"Turkish Language 1", "Advanced English 2", "IZU Common Elective", "IZU Common Elective", "Faculty Elective", "Faculty Elective", "Internship", "Graduation Study"},
                {"Advanced English 1", "IZU Common Elective", "----", "----", "----", "----", "----", "----"},
        };
        JTable MolcBioGenClasses = new JTable(data8, columns8);
        JLabel test1 = new JLabel("test");
        JButton back = new JButton("Back");
        JLabel title = new JLabel("Molecular Biology and Genetics 4-Year Course Plan");

        MolcBioGenClasses.setBounds(30, 70, 1000, 300);
        test1.setBounds(50, 100, 80, 30);
        back.setBounds(50, 300, 80, 30);
        title.setBounds(10, 10, 300, 30);

        MolcBioGenClasses.setCellSelectionEnabled(true);
        MBGClasses.add(title);
        MBGClasses.add(MolcBioGenClasses);
        MBGClasses.add(back);
        MBGClasses.add(test1);
        MBGClasses.setVisible(true);
        MBGClasses.setSize(1200, 500);
        MBGClasses.setLayout(null);
        MBGClasses.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MBGClasses.setVisible(false);
                new home();
            }
        });
    }
}
