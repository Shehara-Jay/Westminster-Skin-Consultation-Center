package Coursework.GUI;

import Coursework.Consultation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import static Coursework.ConsoleApplication.manager;

public class view_consultation_Gui extends JFrame {
    private JFrame frame = new JFrame();
    private JPanel panel1 = new JPanel();
    private  JPanel panel2 = new JPanel();
    private ImageIcon background_pic = new ImageIcon("Photos/registerform.png");
    private JLabel background_label = new JLabel(background_pic);
    private JLabel panel1_title = new JLabel("View Consultations");

    private JLabel panel1_title2 =  new JLabel("Enter patient Id ");
    private JLabel id_required = new JLabel("Must be required");
    private JTextField panel1_title2_input = new JTextField("20200490");
    private JButton back_button = new JButton("Back");
    private JButton view_button = new JButton("View detatils");
    private  JLabel patient_name = new JLabel("Maneesha Shehara");
    private JLabel doc_name = new JLabel("Dr.Dumindu Fernando");
    private JLabel patient_ID =  new JLabel("20200490");

    private  JLabel consultation_date = new JLabel("Consultation Date");
    private JTextField consultation_date_result = new JTextField("2023/12/12");
    private JLabel consultation_time = new JLabel("Consultation Time");
    private JTextField consultation_time_result = new JTextField("08:00");
    private JLabel consultation_hour = new JLabel("Consultation Hours");
    private JTextField consultation_hour_result = new JTextField("2");
    private JLabel consultation_note = new JLabel("Consultation Note");
    private JTextField consultation_note_result = new JTextField("Sick Lot");
    private JLabel cost = new JLabel("The payment is $30");
    private JButton panel2_back_button = new JButton("Back");
    private JButton previous_button = new JButton("Previous");
    private JButton next_button = new JButton("Next");

    int count;
    ArrayList<Consultation> id_filter_consultation;

    public view_consultation_Gui(){
        frame.setTitle("Westminster Skin Consultation Manager");
        frame.setSize(1000,800);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        panel1.setBackground(Color.white);
        panel1.setSize(1000, 800);
        panel1.setVisible(true);
        panel1.setLayout(null);
        frame.add(panel1);

        panel2.setBackground(new Color(207,234,232,255));
        panel2.setSize(1000, 800);
        panel2.setVisible(false);
        panel2.setLayout(null);
        frame.add(panel2);


        background_label.setSize(1000, 800);
        panel1.add(background_label);


        panel1_title.setSize(800, 60);
        panel1_title.setLocation(320, 50);
        panel1_title.setFont(new Font("Times New Roman", Font.BOLD, 50));
        panel1_title.setForeground(new Color(0, 0, 0 ));
        background_label.add(panel1_title);


        panel1_title2.setSize(800, 60);
        panel1_title2.setLocation(420, 150);
        panel1_title2.setFont(new Font("Times New Roman", Font.BOLD, 30));
        panel1_title2.setForeground(new Color(0, 0, 0 ));
        background_label.add(panel1_title2);


        panel1_title2_input.setSize(400, 60);
        panel1_title2_input.setLocation(320, 250);
        panel1_title2_input.setFont(new Font("Times New Roman", Font.BOLD, 30));
        panel1_title2_input.setHorizontalAlignment(JTextField.CENTER);
        panel1_title2_input.setForeground(new Color(0, 0, 0 ));
        background_label.add(panel1_title2_input);

        id_required.setSize(120, 20);
        id_required.setLocation(750, 270);
        id_required.setFont(new Font("Times New Roman", Font.BOLD, 16));
        id_required.setForeground(new Color(228, 69, 38));
        id_required.setVisible(false);
        background_label.add(id_required);

        back_button.setSize(200,70);
        back_button.setLocation(40,650);
        back_button.setFont(new Font("Times New Roman",Font.BOLD,20));
        back_button.setForeground(new Color(0, 0, 0 ));
        background_label.add(back_button);
        back_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ListOfDocGui();
                frame.setVisible(false);
            }
        });
        view_button.setSize(200,70);
        view_button.setLocation(750,650);
        view_button.setFont(new Font("Times New Roman",Font.BOLD,20));
        view_button.setForeground(new Color(0, 0, 0 ));
        view_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (validate_id()){
                    panel1.setVisible(false);
                    panel2.setVisible(true);

                    count=0;

                    patient_name.setText(id_filter_consultation.get(0).getPatient().getName()+" "+id_filter_consultation.get(0).getPatient().getSurname());
                    patient_ID.setText(panel1_title2_input.getText());
                    doc_name.setText("Dr."+id_filter_consultation.get(0).getDoctor().getName()+" "+id_filter_consultation.get(0).getDoctor().getSurname());

                    consultation_date_result.setText(id_filter_consultation.get(count).getDate());
                    consultation_time_result.setText(id_filter_consultation.get(count).getTime());
                    consultation_hour_result.setText(id_filter_consultation.get(count).getHour_time()+"");
                    consultation_note_result.setText(id_filter_consultation.get(count).decrypt());
                    cost.setText("The payment is £"+id_filter_consultation.get(count).getCost());

                    if (id_filter_consultation.size()>1){
                        next_button.setVisible(true);
                    }
                }
            }
        });
        background_label.add(view_button);

        patient_name.setSize(600,50);
        patient_name.setLocation(350,10);
        patient_name.setFont(new Font("Times New Roman",Font.BOLD,30));
        patient_name.setForeground(new Color(0, 0, 0 ));
        panel2.add(patient_name);

        patient_ID.setSize(600,50);
        patient_ID.setLocation(400,60);
        patient_ID.setFont(new Font("Times New Roman",Font.BOLD,30));
        patient_ID.setForeground(new Color(0, 0, 0 ));
        panel2.add(patient_ID);

        doc_name.setSize(600,50);
        doc_name.setLocation(320,110);
        doc_name.setFont(new Font("Times New Roman",Font.BOLD,30));
        doc_name.setForeground(new Color(0, 0, 0 ));
        panel2.add(doc_name);

        consultation_date.setSize(300,30);
        consultation_date.setLocation(75,250);
        consultation_date.setFont(new Font("Times New Roman",Font.BOLD,30));
        consultation_date.setForeground(new Color(0, 0, 0 ));
        consultation_date_result.setEditable(false);
        panel2.add(consultation_date);

        consultation_date_result.setSize(250, 50);
        consultation_date_result.setBackground(new Color(255,255,255));
        consultation_date_result.setLocation(75, 300);
        consultation_date_result.setFont(new Font("Times New Roman", Font.BOLD, 25));
        consultation_date_result.setForeground(new Color(0, 0, 0 ));
        consultation_date_result.setHorizontalAlignment(JTextField.CENTER);
        consultation_date_result.setEditable(false);
        panel2.add(consultation_date_result);

        consultation_time.setSize(300, 30);
        consultation_time.setLocation(635,250);
        consultation_time.setFont(new Font("Times New Roman",Font.BOLD,30));
        consultation_time.setForeground(new Color(0, 0, 0 ));
        panel2.add( consultation_time);

        consultation_time_result.setSize(250, 50);
        consultation_time_result.setBackground(new Color(255,255,255));
        consultation_time_result.setLocation(625, 300);
        consultation_time_result.setFont(new Font("Times New Roman", Font.BOLD, 25));
        consultation_time_result.setForeground(new Color(0, 0, 0 ));
        consultation_time_result.setHorizontalAlignment(JTextField.CENTER);
        consultation_time_result.setEditable(false);
        panel2.add(consultation_time_result);

        consultation_hour.setSize(300, 30);
        consultation_hour.setLocation(75,400);
        consultation_hour.setFont(new Font("Times New Roman",Font.BOLD,30));
        consultation_hour.setForeground(new Color(0, 0, 0 ));
        panel2.add( consultation_hour);

        consultation_hour_result.setSize(250, 50);
        consultation_hour_result.setBackground(new Color(255,255,255));
        consultation_hour_result.setLocation(75, 450);
        consultation_hour_result.setFont(new Font("Times New Roman", Font.BOLD, 25));
        consultation_hour_result.setForeground(new Color(0, 0, 0 ));
        consultation_hour_result.setHorizontalAlignment(JTextField.CENTER);
        consultation_hour_result.setEditable(false);
        panel2.add(consultation_hour_result);

        consultation_note.setSize(300, 30);
        consultation_note.setLocation(635,400);
        consultation_note.setFont(new Font("Times New Roman",Font.BOLD,30));
        consultation_note.setForeground(new Color(0, 0, 0 ));
        panel2.add( consultation_note);

        consultation_note_result.setSize(250, 50);
        consultation_note_result.setBackground(new Color(255,255,255));
        consultation_note_result.setLocation(630, 450);
        consultation_note_result.setFont(new Font("Times New Roman", Font.BOLD, 25));
        consultation_note_result.setForeground(new Color(0, 0, 0 ));
        consultation_note_result.setHorizontalAlignment(JTextField.CENTER);
        consultation_note_result.setEditable(false);
        panel2.add(consultation_note_result);

        cost.setSize(400, 30);
        cost.setLocation(360,550);
        cost.setFont(new Font("Times New Roman",Font.BOLD,30));
        cost.setForeground(new Color(0, 0, 0 ));
        panel2.add( cost);


        panel2_back_button.setSize(200,70);
        panel2_back_button.setLocation(40,650);
        panel2_back_button.setFont(new Font("Times New Roman",Font.BOLD,20));
        panel2_back_button.setForeground(new Color(0, 0, 0 ));
        panel2_back_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel2.setVisible(false);
                panel1.setVisible(true);
                next_button.setVisible(false);
                previous_button.setVisible(false);
            }
        });
        panel2.add(panel2_back_button);

        previous_button.setSize(200,70);
        previous_button.setLocation(400,650);
        previous_button.setVisible(false);
        previous_button.setFont(new Font("Times New Roman",Font.BOLD,20));
        previous_button.setForeground(new Color(0, 0, 0 ));
        previous_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count--;
                doc_name.setText("Dr."+id_filter_consultation.get(count).getDoctor().getName()+" "+id_filter_consultation.get(count).getDoctor().getSurname());

                consultation_date_result.setText(id_filter_consultation.get(count).getDate());
                consultation_time_result.setText(id_filter_consultation.get(count).getTime());
                consultation_hour_result.setText(id_filter_consultation.get(count).getHour_time()+"");
                consultation_note_result.setText(id_filter_consultation.get(count).decrypt());
                cost.setText("The payment is £"+id_filter_consultation.get(count).getCost());

                if (count==0){
                    previous_button.setVisible(false);

                }

                next_button.setVisible(true);


            }
        });
        panel2.add(previous_button);

        next_button.setSize(200,70);
        next_button.setLocation(750,650);
        next_button.setVisible(false);
        next_button.setFont(new Font("Times New Roman",Font.BOLD,20));
        next_button.setForeground(new Color(0, 0, 0 ));
        next_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;

                doc_name.setText("Dr."+id_filter_consultation.get(count).getDoctor().getName()+" "+id_filter_consultation.get(count).getDoctor().getSurname());

                consultation_date_result.setText(id_filter_consultation.get(count).getDate());
                consultation_time_result.setText(id_filter_consultation.get(count).getTime());
                consultation_hour_result.setText(id_filter_consultation.get(count).getHour_time()+"");
                consultation_note_result.setText(id_filter_consultation.get(count).decrypt());
                cost.setText("The payment is £"+id_filter_consultation.get(count).getCost());

                if (count == (id_filter_consultation.size() - 1)){
                    next_button.setVisible(false);
                }
                if (count>0){
                    previous_button.setVisible(true);
                }
            }
        });
        panel2.add(next_button);



    }

    private Boolean validate_id() {
        id_filter_consultation=new ArrayList<>();
        if (panel1_title2_input.getText().length() == 0) {
            id_required.setVisible(true);
            id_required.setText("Must required");
            return false;
        }
        else {
            boolean check=false;
            for (Consultation consultation:manager.returnConsultationArrayList()){
                if (panel1_title2_input.getText().equals(consultation.getPatient().getId())){

                    id_filter_consultation.add(consultation);
                    check=true;
                }
            }
            if (check){
                id_required.setVisible(false);
                return true;
            }else {
                id_required.setVisible(true);
                id_required.setText("Can't Find Patient");
                return false;
            }
        }
    }
}
