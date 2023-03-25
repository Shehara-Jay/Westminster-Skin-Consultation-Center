package Coursework.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;


import static Coursework.ConsoleApplication.doctor_part;


public class OldMainMenuGui extends JFrame {
    private JFrame frame = new JFrame();
    private JPanel panel1 = new JPanel();
    private ImageIcon iit_image = new ImageIcon("Photos/iit.png");
    private JLabel iit_label = new JLabel(iit_image);
    private ImageIcon westminster_image = new ImageIcon("Photos/westminster-logo.jpg");
    private JLabel westminster_label = new JLabel(westminster_image);
    private JLabel title_name = new JLabel("Westminster Skin Consultation Center");
    private JButton doc_button = new JButton("Doctor Part");
    private JButton patient_button = new JButton("Patient Part ");


    public OldMainMenuGui(){
        frame.setTitle("Westminster Skin Consultation Manager");
        frame.setSize(1000,800);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        panel1.setBackground(Color.white);
        panel1.setSize(1000,800);
        panel1.setVisible(true);
        panel1.setLayout(null);
        frame.add(panel1);

        iit_label.setSize(250,250);
        iit_label.setLocation(100,50);
        panel1.add(iit_label);

        westminster_label.setSize(250,250);
        westminster_label.setLocation(600,50);
        panel1.add(westminster_label);

        title_name.setSize(800,50);
        title_name.setLocation(160,380);
        title_name.setFont(new Font("Times New Roman",Font.BOLD,40));
        panel1.add(title_name);


        doc_button.setSize(200,70);
        doc_button.setLocation(40,650);
        doc_button.setFont(new Font("Times New Roman",Font.BOLD,20));
        doc_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                try {
                    doctor_part();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }

            }
        });
        panel1.add(doc_button);

        patient_button.setSize(200,70);
        patient_button.setLocation(750,650);
        patient_button.setFont(new Font("Times New Roman",Font.BOLD,20));
        patient_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ListOfDocGui();
                frame.setVisible(false);
            }
        });
        panel1.add(patient_button);

    }
}
