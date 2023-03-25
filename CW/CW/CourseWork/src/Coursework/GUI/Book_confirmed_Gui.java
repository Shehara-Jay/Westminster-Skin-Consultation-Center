package Coursework.GUI;

import Coursework.Consultation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Book_confirmed_Gui extends JFrame {
    private JFrame frame4 = new JFrame();
    private JPanel panel7 = new JPanel();
    private ImageIcon background_pic = new ImageIcon("Photos/registerform.png");
    private JLabel title = new JLabel("Booking Confirmed");
    private JLabel background_label = new JLabel(background_pic);
    private ImageIcon correction_pic = new ImageIcon("Photos/correct-removebg-preview.png");
    private JLabel correction_label = new JLabel(correction_pic);
    private JLabel doctor_name =  new JLabel("");
    private JLabel date = new JLabel("");
    private JLabel time = new JLabel("");
    private JLabel cost = new JLabel("");
    private JButton finished_button = new JButton("Finished");

    public Book_confirmed_Gui(Consultation consultation){

        frame4.setTitle("Westminster Skin Consultation Manager");
        frame4.setSize(1000,800);
        frame4.setVisible(true);
        frame4.setLocationRelativeTo(null);
        frame4.setResizable(false);
        frame4.setLayout(null);
        frame4.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        panel7.setBackground(Color.white);
        panel7.setSize(1000, 800);
        panel7.setVisible(true);
        panel7.setLayout(null);
        frame4.add(panel7);

        background_label.setSize(1000, 800);
        panel7.add(background_label);

        title.setSize(800, 60);
        title.setLocation(360, 50);
        title.setFont(new Font("Times New Roman", Font.BOLD, 50));
        title.setForeground(new Color(0, 0, 0 ));
        background_label.add(title);

        correction_label.setSize(200,300);
        correction_label.setLocation(470,55);
        background_label.add(correction_label);

        doctor_name.setSize(500,200);
        doctor_name.setText("Dr. "+consultation.getDoctor().getName() +" "+consultation.getDoctor().getSurname() );
        doctor_name.setLocation(360,250);
        doctor_name.setFont(new Font("Times New Roman", Font.BOLD, 35));
        doctor_name.setForeground(new Color(0, 0, 0 ));
        background_label.add(doctor_name);

        date.setSize(400,200);
        date.setText(consultation.getDate());
        date.setLocation(450,320);
        date.setFont(new Font("Times New Roman", Font.BOLD, 35));
        date.setForeground(new Color(0, 0, 0 ));
        background_label.add(date);

        time.setSize(400,200);
        time.setText(consultation.getTime());
        time.setLocation(490,390);
        time.setFont(new Font("Times New Roman", Font.BOLD, 35));
        time.setForeground(new Color(0, 0, 0 ));
        background_label.add(time);

        cost.setSize(400,200);
        cost.setText("Your payment is £" + consultation.getCost());
        cost.setLocation(360,460);
        cost.setFont(new Font("Times New Roman", Font.BOLD, 40));
        cost.setForeground(new Color(0, 0, 0 ));
        background_label.add(cost);



        finished_button.setSize(200, 70);
        finished_button.setLocation(750, 650);
        finished_button.setFont(new Font("Times New Roman", Font.BOLD, 20));
        finished_button.setForeground(new Color(0, 0, 0 ));
        finished_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              new   ListOfDocGui();
              frame4.setVisible(false);
            }
        });
        background_label.add(finished_button);

    }
}
