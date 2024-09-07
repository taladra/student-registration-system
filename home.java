package com.project2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class home extends JFrame
{
    home()
    {
        JFrame home = new JFrame();

        String selections [] = {"Select", "Software Engineering Course Program", "Computer Engineering Course Program",
                "Electrical and Electronics Engineering Course Program", "Industrial Engineering Course Program", "Food Engineering Course Program",
                "Interior Architecture and Environmental Design Course Program", "Architecture Course Program", "Molecular Biology and Genetics Course Program"};

        JComboBox option = new JComboBox(selections);
        JButton ok = new JButton("OK");
        JButton empty = new JButton("OK");
        JLabel empty2 = new JLabel("");
        JButton Return = new JButton("Return to Main Screen");

        option.setBounds(50, 100, 400, 30);
        option.setEditable(true);
        ok.setBounds(75, 100, 80, 30);
        empty.setBounds(80, 200, 80, 30);
        empty2.setBounds(0,200, 80, 30);
        Return.setBounds(200, 200, 200, 30);

        home.add(option);
        home.add(ok);
        home.add(empty);
        home.add(Return);
        home.add(empty2);
        home.setVisible(true);
        home.setSize(500, 500);
        home.setLayout(null);

        empty.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                option.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {
                        //JComboBox option = (JComboBox) e.getSource();
                        Object selected = option.getSelectedItem();
                        if(selected.toString().equals("Software Engineering Course Program"))
                        {
                            new SEClasses();
                            home.setVisible(false);
                        }
                        else if(selected.toString().equals("Computer Engineering Course Program"))
                        {
                            new CEClasses();
                            home.setVisible(false);
                        }
                        else if(selected.toString().equals("Electrical and Electronics Engineering Course Program"))
                        {
                            new EEClasses();
                            home.setVisible(false);
                        }
                        else if(selected.toString().equals("Industrial Engineering Course Program"))
                        {
                            new IEClasses();
                            home.setVisible(false);
                        }
                        else if(selected.toString().equals("Food Engineering Course Program"))
                        {
                            new FEClasses();
                            home.setVisible(false);
                        }
                        else if(selected.toString().equals("Interior Architecture and Environmental Design Course Program"))
                        {
                            new IAClasses();
                            home.setVisible(false);
                        }
                        else if(selected.toString().equals("Architecture Course Program"))
                        {
                            new ArchClasses();
                            home.setVisible(false);
                        }
                        else if(selected.toString().equals("Molecular Biology and Genetics Course Program"))
                        {
                            new MBGClasses();
                            home.setVisible(false);
                        }
                    }
                });
            }
        });
        Return.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                home.setVisible(false);
                new button();
            }
        });
    }
}
