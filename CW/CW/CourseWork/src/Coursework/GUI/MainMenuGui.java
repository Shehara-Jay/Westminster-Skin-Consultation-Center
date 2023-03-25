package Coursework.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import static Coursework.ConsoleApplication.doctor_part;

public class MainMenuGui extends JFrame {
    private JFrame frame = new JFrame();
    private ImageIcon photo = new ImageIcon("Photos/photoo.png");
    private JPanel panel1 = new JPanel();
    private JLabel doc_lable = new JLabel(photo);

    private ImageIcon iit_image = new ImageIcon("Photos/download-removebg-preview (1).png");
    private JLabel iit_label = new JLabel(iit_image);
    private ImageIcon westminster_image = new ImageIcon("Photos/westminster-logo-removebg-preview.png");
    private JLabel westminster_label = new JLabel(westminster_image);
    private JLabel title_name = new JLabel("Westminster Skin Consultation");
    private JLabel title_name2 = new JLabel("Center");
    private JButton doc_button = new JButton("Doctor Part");
    private JButton patient_button = new JButton("Patient Part ");
    public MainMenuGui(){
        frame.setTitle("Westminster Skin Consultation Manager");
        frame.setSize(1000, 800);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        panel1.setSize(1000,800);
        panel1.setVisible(true);
        panel1.setLayout(null);
        frame.add(panel1);

        doc_lable.setSize(1000, 800);
        panel1.add(doc_lable);

        iit_label.setSize(250,250);
        iit_label.setLocation(20,50);
        doc_lable.add(iit_label);

        westminster_label.setSize(250,250);
        westminster_label.setLocation(700,50);
        doc_lable.add(westminster_label);

        title_name.setSize(900,50);
        title_name.setLocation(100,340);
        title_name.setFont(new Font("Times New Roman",Font.BOLD,60));
        title_name.setForeground(new Color(0, 0, 0 ));
        doc_lable.add(title_name);

        title_name2.setSize(500,50);
        title_name2.setLocation(420,430);
        title_name2.setFont(new Font("Times New Roman",Font.BOLD,60));
        title_name2.setForeground(new Color(0, 0, 0 ));
        doc_lable.add(title_name2);

        doc_button.setSize(200,70);
        doc_button.setLocation(40,650);
        doc_button.setFont(new Font("Times New Roman",Font.BOLD,20));
        doc_button.setForeground(new Color(0, 0, 0 ));
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
        doc_lable.add(doc_button);

        patient_button.setSize(200,70);
        patient_button.setLocation(750,650);
        patient_button.setFont(new Font("Times New Roman",Font.BOLD,20));
        doc_button.setForeground(new Color(0, 0, 0 ));
        patient_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ListOfDocGui();
                frame.setVisible(false);
            }
        });
        doc_lable.add(patient_button);



    }
}
