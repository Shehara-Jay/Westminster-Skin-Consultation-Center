package Coursework.GUI;

import Coursework.Doctor;

import javax.print.Doc;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import static Coursework.ConsoleApplication.manager;

public class ListOfDocGui extends JFrame {
    private JFrame frame2 = new JFrame();
    private JPanel panel2 = new JPanel();

    private JLabel title = new JLabel("Registered Doctors List");
    private JLabel topic1 = new JLabel("Doctor's Name");
    private  JLabel topic2 = new JLabel("Medical Licence Number");
    private JLabel topic3 = new JLabel("Doctor Type");
    private JButton back_button = new JButton("Back");
    private JButton book_button = new JButton("Book Consultation");
    private JButton view_button = new JButton("View Consultation");
    private JButton sort_button = new JButton("Sort");
    private  JTable jt;

    public ListOfDocGui(){
//        Collections.sort(manager.returnDoctorArrayList());

        createTable(manager.returnDoctorArrayList());



        frame2.setTitle("Westminster Skin Consultation Manager");
        frame2.setSize(1000,800);
        frame2.setVisible(true);
        frame2.setLocationRelativeTo(null);
        frame2.setResizable(false);
        frame2.setLayout(null);
        frame2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        panel2.setBackground(new Color(207,234,232,255));
        panel2.setSize(1000,800);
        panel2.setVisible(true);
        panel2.setLayout(null);
        frame2.add(panel2);

        title.setSize(800,50);
        title.setLocation(300,50);
        title.setFont(new Font("Times New Roman",Font.BOLD,40));
        title.setForeground(new Color(0, 0, 0 ));
        panel2.add(title);

        topic1.setSize(200,100);
        topic1.setLocation(150,120);
        topic1.setFont(new Font("Times New Roman",Font.BOLD,20));
        topic1.setForeground(new Color(0, 0, 0 ));
        panel2.add(topic2);

        topic2.setSize(250,100);
        topic2.setLocation(360,120);
        topic2.setFont(new Font("Times New Roman",Font.BOLD,20));
        topic2.setForeground(new Color(0, 0, 0 ));
        panel2.add(topic1);

        topic3.setSize(200,100);
        topic3.setLocation(630,120);
        topic3.setFont(new Font("Times New Roman",Font.BOLD,20));
        topic3.setForeground(new Color(0, 0, 0 ));
        panel2.add(topic3);


        back_button.setSize(200,70);
        back_button.setLocation(40,650);
        back_button.setFont(new Font("Times New Roman",Font.BOLD,20));
        back_button.setForeground(new Color(0, 0, 0 ));
        panel2.add(back_button);
        back_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainMenuGui();
                frame2.setVisible(false);
            }
        });

        book_button.setSize(200,70);
        book_button.setLocation(400,650);
        book_button.setFont(new Font("Times New Roman",Font.BOLD,20));
        book_button.setForeground(new Color(0, 0, 0 ));
        book_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new BookDocGui();
                frame2.setVisible(false);
            }
        });
        panel2.add(book_button);


        view_button.setSize(200,70);
        view_button.setLocation(750,650);
        view_button.setFont(new Font("Times New Roman",Font.BOLD,20));
        view_button.setForeground(new Color(0, 0, 0 ));
        view_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new view_consultation_Gui();
                frame2.setVisible(false);
            }
        });
        panel2.add(view_button);

        sort_button.setSize(100,40);
        sort_button.setLocation(750,550);
        sort_button.setFont(new Font("Times New Roman",Font.BOLD,20));
        sort_button.setForeground(new Color(0, 0, 0 ));
        sort_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (sort_button.getText().equals("Sort")) {
                    ArrayList<Doctor> temp_array= (ArrayList<Doctor>) manager.returnDoctorArrayList().clone();
                    temp_array.sort(Comparator.comparing(Doctor::getName));
                    jt.setVisible(false);
                    createTable(temp_array);
                    sort_button.setText("Return");
                }
                else {
                    jt.setVisible(false);
                    createTable(manager.returnDoctorArrayList());
                    sort_button.setText("Sort");
                }
            }
        });
        panel2.add(sort_button);

    }
    private void createTable(ArrayList<Doctor> list_name){

        String data[][]=new String[list_name.size()][3];
        for (int i =0;i<list_name.size();i++){
            data[i][0]="Dr."+list_name.get(i).getName()+" "+list_name.get(i).getSurname();
            data[i][1]=list_name.get(i).getMedical_licence_number();
            data[i][2]=list_name.get(i).getSpecialisation();
        }

        String column[]={"Doctor's Name","Medical Licence Number","Doctor Type"};

        jt=new JTable(data,column);
        jt.setBackground(new Color(207,234,232,255));
        jt.setSize(730,350);
        jt.setLocation(150,200);
        jt.setVisible(true);
        jt.setFont(new Font("Times New Roman",Font.BOLD,18));
        jt.setForeground(new Color(0, 0, 0 ));
        jt.setRowHeight(33);
        jt.setShowVerticalLines(false);
        panel2.add(jt);
    }

}
