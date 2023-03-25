package Coursework.GUI;

import Coursework.Consultation;
import Coursework.Doctor;
import Coursework.Patient;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Random;

import static Coursework.ConsoleApplication.manager;

public class BookDocGui extends JFrame {
    private JFrame frame3 = new JFrame();
    private JPanel panel3 = new JPanel();
    private JLabel title = new JLabel("Book Consultation");
    private ImageIcon doc_image = new ImageIcon("Photos/doc-removebg-preview.png");
    private JLabel doc_lable = new JLabel(doc_image);

    private JLabel licence_num = new JLabel("Enter Consultant's Medical Licence Number");
    private JTextField licence_input = new JTextField("g");
    private JLabel licence_required = new JLabel("Must be required");
    private JLabel consultation_date = new JLabel("Enter Consultation Date [YY/MM/DD]");
    private JTextField consultation_date_input = new JTextField("2022/11/11");
    private JLabel date_required = new JLabel("Must be required");
    private JLabel consulation_time = new JLabel("Enter Consultation Time [HH:mm] 08:00 - 21:00");
    private JTextField time_input = new JTextField("08:00");
    private JLabel time_required = new JLabel("Must be required");
    private JLabel consultation_hours = new JLabel("Enter Consultation Hours You Want to Spend");
    private JTextField hours_input = new JTextField("1");
    private JLabel hours_required = new JLabel("Must be required");
    private JButton back_button = new JButton("Back");
    private JButton reset_button = new JButton("Reset");
    private JButton check_consultation_button = new JButton("Check Availability");
    private JPanel panel4 = new JPanel();
    private JPanel panel5 = new JPanel();
    private JLabel display1 = new JLabel("Dr. Dumindu Fernando");
    private JLabel display2 = new JLabel( );
    private JLabel display3 = new JLabel("You are allocated to Dr.Maneesha shehara");
    private JPanel panel6 = new JPanel();
    private  JLabel note = new JLabel("Add a note");
    private JTextField note_input =  new JTextField();
    private JButton book_button = new JButton("Continue");

    private JButton panel4_back_button = new JButton("Back");
    private JPanel panel7 = new JPanel();
    private JLabel panel7_title = new JLabel("Register Now");
    private ImageIcon form_pic = new ImageIcon("Photos/registerform.png");
    private JLabel form_label = new JLabel(form_pic);
    private JLabel first_name = new JLabel("First Name");
    private JTextField first_name_input = new JTextField();
    private JLabel first_name_required = new JLabel("Must be required");
    private JLabel surname = new JLabel("Surname");
    private JTextField surname_input = new JTextField();
    private JLabel surnme_required = new JLabel("Must be required");
    private JLabel dob = new JLabel("Date of Birth");
    private JTextField dob_input = new JTextField();
    private JLabel dob_required = new JLabel("Must be required");
    private JLabel mobile_num = new JLabel("Mobile Number");
    private JTextField mobile_num_input = new JTextField();
    private JLabel mobile_required = new JLabel("Must be required");
    private JLabel id_num = new JLabel("ID Number");
    private JTextField id_num_input = new JTextField();
    private JLabel id_required = new JLabel("Must be required");
    private JButton panel7_back_button = new JButton("Back");
    private JButton panel7_reset_button = new JButton("Reset");
    private JButton confirm_button = new JButton("Confirm");



    Doctor final_doctor;
    public BookDocGui() {
        frame3.setTitle("Westminster Skin Consultation Manager");
        frame3.setSize(1000, 800);
        frame3.setVisible(true);
        frame3.setLocationRelativeTo(null);
        frame3.setResizable(false);
        frame3.setLayout(null);
        frame3.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        panel3.setBackground(new Color(207,234,232,255));
        panel3.setSize(1000, 800);
        panel3.setVisible(true);
        panel3.setLayout(null);
        frame3.add(panel3);

        title.setSize(800, 50);
        title.setLocation(320, 50);
        title.setFont(new Font("Times New Roman", Font.BOLD, 40));
        title.setForeground(new Color(0, 0, 0 ));
        panel3.add(title);

        doc_lable.setSize(400, 320);
        doc_lable.setLocation(10, 220);
        panel3.add(doc_lable);

        licence_num.setSize(400, 200);
        licence_num.setLocation(520, 100);
        licence_num.setFont(new Font("Times New Roman", Font.BOLD, 20));
        licence_num.setForeground(new Color(0, 0, 0 ));
        panel3.add(licence_num);

        licence_input.setSize(250, 40);
        licence_input.setLocation(570, 225);
        licence_input.setBackground(new Color(255, 255, 255));
        licence_input.setFont(new Font("Times New Roman", Font.BOLD, 20));
        licence_input.setForeground(new Color(0, 0, 0 ));
        licence_input.setHorizontalAlignment(JTextField.CENTER);
        panel3.add(licence_input);

        licence_required.setSize(120, 20);
        licence_required.setLocation(850, 235);
        licence_required.setFont(new Font("Times New Roman", Font.BOLD, 12));
        licence_required.setForeground(new Color(228, 69, 38));
        licence_required.setVisible(false);
        panel3.add(licence_required);

        consultation_date.setSize(400, 200);
        consultation_date.setLocation(520, 200);
        consultation_date.setFont(new Font("Times New Roman", Font.BOLD, 20));
        consultation_date.setForeground(new Color(0, 0, 0 ));
        panel3.add(consultation_date);

        consultation_date_input.setSize(250, 40);
        consultation_date_input.setLocation(570, 325);
        consultation_date_input.setBackground(new Color(255, 255, 255));
        consultation_date_input.setFont(new Font("Times New Roman", Font.BOLD, 20));
        consultation_date_input.setForeground(new Color(0, 0, 0 ));
        consultation_date_input.setHorizontalAlignment(JTextField.CENTER);
        panel3.add(consultation_date_input);

        date_required.setSize(120, 20);
        date_required.setLocation(850, 335);
        date_required.setFont(new Font("Times New Roman", Font.BOLD, 12));
        date_required.setForeground(new Color(228, 69, 38));
        date_required.setVisible(false);
        panel3.add(date_required);

        consulation_time.setSize(500, 200);
        consulation_time.setLocation(520, 300);
        consulation_time.setFont(new Font("Times New Roman", Font.BOLD, 20));
        consulation_time.setForeground(new Color(0, 0, 0 ));
        panel3.add(consulation_time);

        time_input.setSize(250, 40);
        time_input.setLocation(570, 425);
        time_input.setBackground(new Color(255, 255, 255));
        time_input.setFont(new Font("Times New Roman", Font.BOLD, 20));
        time_input.setForeground(new Color(0, 0, 0 ));
        time_input.setHorizontalAlignment(JTextField.CENTER);
        panel3.add(time_input);

        time_required.setSize(120, 20);
        time_required.setLocation(850, 435);
        time_required.setFont(new Font("Times New Roman", Font.BOLD, 12));
        time_required.setForeground(new Color(228, 69, 38));
        time_required.setVisible(false);
        panel3.add(time_required);

        consultation_hours.setSize(500, 200);
        consultation_hours.setLocation(520, 400);
        consultation_hours.setFont(new Font("Times New Roman", Font.BOLD, 20));
        consultation_hours.setForeground(new Color(0, 0, 0 ));
        panel3.add(consultation_hours);

        hours_input.setSize(250, 40);
        hours_input.setLocation(570, 525);
        hours_input.setBackground(new Color(255, 255, 255));
        hours_input.setFont(new Font("Times New Roman", Font.BOLD, 20));
        hours_input.setForeground(new Color(0, 0, 0 ));
        hours_input.setHorizontalAlignment(JTextField.CENTER);
        panel3.add(hours_input);

        hours_required.setSize(90, 20);
        hours_required.setLocation(850, 535);
        hours_required.setFont(new Font("Times New Roman", Font.BOLD, 12));
        hours_required.setForeground(new Color(228, 69, 38));
        hours_required.setVisible(false);
        panel3.add(hours_required);

        check_consultation_button.setSize(200, 70);
        check_consultation_button.setLocation(750, 650);
        check_consultation_button.setFont(new Font("Times New Roman", Font.BOLD, 20));
        check_consultation_button.setForeground(new Color(0, 0, 0 ));
        check_consultation_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validate_hours();
                validate_medical_licence();
                check_licence();
                validate_date();
                validate_time();
                if ((check_licence()) && (validate_date()) && (validate_time()) && (validate_hours())) {
                    Doctor current_doctor=return_doc();
//                    Doctor next_doctor;
                    boolean current_doc_down=false;
                    for (Consultation consultation:manager.returnConsultationArrayList()){
                        if (( current_doctor.getMedical_licence_number().equals(consultation.getDoctor().getMedical_licence_number() )
                                && ( consultation_date_input.getText().equals(consultation.getDate()) ) && ( time_input.getText().equals(consultation.getTime()) ))){
                            current_doc_down=true;
                            break;
                        }
                    }

                    if (current_doc_down){
                        Random ran=new Random();
                        int doc_index;
                        boolean next_doc_down;

                        while (true){
                            next_doc_down=true;
                            doc_index=ran.nextInt(0,manager.returnDoctorArrayList().size());
                            if ( !(manager.returnDoctorArrayList().get(doc_index)==current_doctor)){
                                for (Consultation consultation:manager.returnConsultationArrayList()){
                                    if (( (manager.returnDoctorArrayList().get(doc_index).getMedical_licence_number().equals(consultation.getDoctor().getMedical_licence_number() )
                                            && ( consultation_date_input.getText().equals(consultation.getDate()) ) && ( time_input.getText().equals(consultation.getTime()) )))){
                                        next_doc_down=false;
                                        break;
                                    }
                                }
                            }else {
                                next_doc_down=false;
                            }
                            if (next_doc_down){
                                break;
                            }
                        }

                        final_doctor=manager.returnDoctorArrayList().get(doc_index);
                        display1.setText("Dr."+current_doctor.getName()+" "+current_doctor.getSurname());
                        display1.setLocation(420,20);
                        display1.setForeground(new Color(228, 69, 38));
                        display2.setText("There is a consultation for that doctor at this time");
                        display2.setLocation(210,100);
                        display2.setForeground(new Color(228, 69, 38));
                        display3.setForeground(new Color(228, 69, 38));
                        display3.setText("You are allocated to Dr."+final_doctor.getName()+" "+final_doctor.getSurname());
                        display1.setVisible(true);
                        display2.setVisible(true);
                        display3.setVisible(true);
                    }
                    else {
                        //not booking part
                        final_doctor=current_doctor;
                        display1.setForeground(new Color(46, 204, 113));
                        display1.setText("Dr."+final_doctor.getName()+" "+final_doctor.getSurname());
                        display2.setLocation(275,100);
                        display2.setForeground(new Color(46, 204, 113));
                        display2.setText("The doctor is available for your time");
                        display1.setVisible(true);
                        display2.setVisible(true);
                        display3.setVisible(false);
                    }

                    //Switch panel
                    panel3.setVisible(false);
                    panel4.setVisible(true);
                    panel4.add(title);
                    panel4.add(panel5);
                    panel4.add(panel6);

                }

            }
        });
        panel3.add(check_consultation_button);

        back_button.setSize(200, 70);
        back_button.setLocation(40, 650);
        back_button.setFont(new Font("Times New Roman", Font.BOLD, 20));
        back_button.setForeground(new Color(0, 0, 0 ));
        back_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ListOfDocGui();
                frame3.setVisible(false);
            }
        });
        panel3.add(back_button);


        reset_button.setSize(200, 70);
        reset_button.setLocation(400, 650);
        reset_button.setFont(new Font("Times New Roman", Font.BOLD, 20));
        reset_button.setForeground(new Color(0, 0, 0 ));
        reset_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clear_form();
                licence_required.setVisible(false);
                date_required.setVisible(false);
                time_required.setVisible(false);
                hours_required.setVisible(false);
            }
        });
        panel3.add(reset_button);


        panel4.setSize(1000, 800);
        panel4.setBackground(new Color(207,234,232,255));
        panel4.setVisible(false);
        panel4.setLayout(null);
        frame3.add(panel4);


        panel5.setSize(1000,300);
        panel5.setBackground(new Color(255, 255, 255));
        panel5.setLocation(0,110);
        panel5.setVisible(true);
        panel5.setLayout(null);
        frame3.add(panel5);

        display1.setSize(600,75);
        display1.setLocation(350,20);
        display1.setFont(new Font("Times New Roman", Font.BOLD, 30));
        panel5.add(display1);

        display2.setSize(800,75);
        display2.setFont(new Font("Times New Roman", Font.BOLD, 30));
        panel5.add(display2);

        display3.setSize(800,75);
        display3.setLocation(250,185);
        display3.setFont(new Font("Times New Roman", Font.BOLD, 30));
        display3.setForeground(new Color(46, 204, 113 ));
        panel5.add(display3);


        note.setSize(400,200);
        note.setLocation(100,400);
        note.setFont(new Font("Times New Roman", Font.BOLD, 20));
        note.setForeground(new Color(0, 0, 0 ));
        panel4.add(note);

        note_input.setSize(400,100);
        note_input.setLocation(250,450);
        note_input.setFont(new Font("Times New Roman", Font.BOLD, 20));
        note_input.setForeground(new Color(0, 0, 0 ));
        panel4.add(note_input);


        panel4_back_button.setSize(200, 70);
        panel4_back_button.setLocation(40, 650);
        panel4_back_button.setFont(new Font("Times New Roman", Font.BOLD, 20));
        panel4_back_button.setForeground(new Color(0, 0, 0));
        panel4_back_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel4.setVisible(false);
                panel3.setVisible(true);
                panel3.add(title);
            }
        });
        panel4.add(panel4_back_button);

        book_button.setSize(200,70);
        book_button.setLocation(750,650);
        book_button.setFont(new Font("Times New Roman",Font.BOLD,20));
        book_button.setForeground(new Color(0, 0, 0 ));
        book_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel4.setVisible(false);
                panel7.setVisible(true);
            }
        });
        panel4.add(book_button);

        panel7.setBackground(Color.white);
        panel7.setSize(1000, 800);
        panel7.setVisible(false);
        panel7.setLayout(null);
        frame3.add(panel7);

        form_label.setSize(1000, 800);
        panel7.add(form_label);

        panel7_title.setSize(800, 50);
        panel7_title.setLocation(360, 50);
        panel7_title.setFont(new Font("Times New Roman", Font.BOLD, 40));
        panel7_title.setForeground(new Color(0, 0, 0 ));
        form_label.add(panel7_title);

        first_name.setSize(400, 200);
        first_name.setLocation(650, 50);
        first_name.setFont(new Font("Times New Roman", Font.BOLD, 20));
        first_name.setForeground(new Color(0, 0, 0 ));
        form_label.add(first_name);

        first_name_input.setSize(250, 40);
        first_name_input.setLocation(570, 175);
        first_name_input.setFont(new Font("Times New Roman", Font.BOLD, 20));
        first_name_input.setForeground(new Color(0, 0, 0 ));
        first_name_input.setHorizontalAlignment(JTextField.CENTER);
        form_label.add(first_name_input);

        first_name_required.setSize(120, 20);
        first_name_required.setLocation(850, 180);
        first_name_required.setFont(new Font("Times New Roman", Font.BOLD, 12));
        first_name_required.setForeground(new Color(228, 69, 38));
        first_name_required.setVisible(false);
        form_label.add(first_name_required);

        surname.setSize(400, 200);
        surname.setLocation(650, 150);
        surname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        surname.setForeground(new Color(0, 0, 0 ));
        form_label.add(surname);

        surname_input.setSize(250, 40);
        surname_input.setLocation(570, 275);
        surname_input.setFont(new Font("Times New Roman", Font.BOLD, 20));
        surname_input.setForeground(new Color(0, 0, 0 ));
        surname_input.setHorizontalAlignment(JTextField.CENTER);
        form_label.add(surname_input);

        surnme_required.setSize(120, 20);
        surnme_required.setLocation(850, 280);
        surnme_required.setFont(new Font("Times New Roman", Font.BOLD, 12));
        surnme_required.setForeground(new Color(228, 69, 38));
        surnme_required.setVisible(false);
        form_label.add(surnme_required);


        dob.setSize(400, 200);
        dob.setLocation(650, 250);
        dob.setFont(new Font("Times New Roman", Font.BOLD, 20));
        dob.setForeground(new Color(0, 0, 0 ));
        form_label.add(dob);

        dob_input.setSize(250, 40);
        dob_input.setLocation(570, 375);
        dob_input.setFont(new Font("Times New Roman", Font.BOLD, 20));
        dob_input.setForeground(new Color(0, 0, 0 ));
        dob_input.setHorizontalAlignment(JTextField.CENTER);
        form_label.add(dob_input);

        dob_required.setSize(120, 20);
        dob_required.setLocation(850, 380);
        dob_required.setFont(new Font("Times New Roman", Font.BOLD, 12));
        dob_required.setForeground(new Color(228, 69, 38));
        dob_required.setVisible(false);
        form_label.add(dob_required);


        mobile_num.setSize(400, 200);
        mobile_num.setLocation(650, 350);
        mobile_num.setFont(new Font("Times New Roman", Font.BOLD, 20));
        mobile_num.setForeground(new Color(0, 0, 0 ));
        form_label.add(mobile_num);

        mobile_num_input.setSize(250, 40);
        mobile_num_input.setLocation(570, 475);
        mobile_num_input.setFont(new Font("Times New Roman", Font.BOLD, 20));
        mobile_num_input.setForeground(new Color(0, 0, 0 ));
        mobile_num_input.setHorizontalAlignment(JTextField.CENTER);
        form_label.add(mobile_num_input);

        mobile_required.setSize(120, 20);
        mobile_required.setLocation(850, 480);
        mobile_required.setFont(new Font("Times New Roman", Font.BOLD, 12));
        mobile_required.setForeground(new Color(228, 69, 38));
        mobile_required.setVisible(false);
        form_label.add(mobile_required);

        id_num.setSize(400, 200);
        id_num.setLocation(650, 450);
        id_num.setFont(new Font("Times New Roman", Font.BOLD, 20));
        id_num.setForeground(new Color(0, 0, 0 ));
        form_label.add(id_num);

        id_num_input.setSize(250, 40);
        id_num_input.setLocation(570, 575);
        id_num_input.setFont(new Font("Times New Roman", Font.BOLD, 20));
        id_num_input.setForeground(new Color(0, 0, 0 ));
        id_num_input.setHorizontalAlignment(JTextField.CENTER);
        form_label.add(id_num_input);

        id_required.setSize(120, 20);
        id_required.setLocation(850, 580);
        id_required.setFont(new Font("Times New Roman", Font.BOLD, 12));
        id_required.setForeground(new Color(228, 69, 38));
        id_required.setVisible(false);
        form_label.add(id_required);

        panel7_back_button.setSize(200, 70);
        panel7_back_button.setLocation(40, 650);
        panel7_back_button.setFont(new Font("Times New Roman", Font.BOLD, 20));
        panel7_back_button.setForeground(new Color(0, 0, 0 ));
        panel7_back_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel7.setVisible(false);
                panel4.setVisible(true);
                first_name_required.setVisible(false);
                surnme_required.setVisible(false);
                dob_required.setVisible(false);
                mobile_required.setVisible(false);
                id_required.setVisible(false);
            }
        });
        form_label.add(panel7_back_button);

        panel7_reset_button.setSize(200, 70);
        panel7_reset_button.setLocation(400, 650);
        panel7_reset_button.setFont(new Font("Times New Roman", Font.BOLD, 20));
        panel7_reset_button.setForeground(new Color(0, 0, 0 ));
        panel7_reset_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel7_clear_form();
                first_name_required.setVisible(false);
                surnme_required.setVisible(false);
                dob_required.setVisible(false);
                mobile_required.setVisible(false);
                id_required.setVisible(false);

            }
        });
        form_label.add(panel7_reset_button);

        confirm_button.setSize(200, 70);
        confirm_button.setLocation(750, 650);
        confirm_button.setFont(new Font("Times New Roman", Font.BOLD, 20));
        confirm_button.setForeground(new Color(0, 0, 0 ));
        confirm_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validate_first_name();
                validate_surname();
                validate_dob();
                validate_mobile();
                validate_id();

                if ((check_licence()) && (validate_first_name()) && (validate_surname()) && (validate_dob()) && (validate_mobile()) && (validate_id())){
                    Patient patient = new Patient(first_name_input.getText(),surname_input.getText(),dob_input.getText(),mobile_num_input.getText(),id_num_input.getText());
                    Consultation cosultation =  new Consultation(consultation_date_input.getText(),
                                                time_input.getText(),generate_cost(),note_input.getText(),Integer.parseInt(hours_input.getText()),final_doctor,patient);
                    manager.returnConsultationArrayList().add(cosultation);
                    try {
                        manager.save_file("Consultation");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }

                    frame3.setVisible(false);
                    new Book_confirmed_Gui(cosultation);
                }

            }
        });
        form_label.add(confirm_button);

    }

    private int generate_cost() {
        int hour = Integer.parseInt(hours_input.getText());
        boolean check = true;
        for (Consultation consultation : manager.returnConsultationArrayList()){
            if (id_num_input.getText().equals(consultation.getPatient().getId())){
                check = false;
                break;
            }
        }
        if (check){
            return (15 * hour);
        }
        else {
            return (25 * hour);
        }

    }

    private Doctor return_doc() {
        Doctor doc = null;
        for(Doctor doctor:manager.returnDoctorArrayList()){
            if (licence_input.getText().equals(doctor.getMedical_licence_number())){
                doc = doctor;
                break;
            }
        }
        return doc;
    }

    void clear_form() {
        licence_input.setText("");
        consultation_date_input.setText("");
        time_input.setText("");
        hours_input.setText("");
    }

    void panel7_clear_form() {
        System.out.println("123");
        first_name_input.setText("");
        surname_input.setText("");
        dob_input.setText("");
        mobile_num_input.setText("");
        id_num_input.setText("");
    }

    private Boolean validate_hours() {
        if (!(hours_input.getText().length() == 0)) {
            hours_required.setVisible(false);
            try {
                Integer.parseInt(hours_input.getText());
                return true;
            } catch (Exception e) {
                hours_required.setText("Use numbers");
                hours_required.setVisible(true);
                return false;
            }
        } else {
            hours_required.setVisible(true);
            hours_required.setText("Must required");
            return false;

        }
    }

    private boolean validate_medical_licence() {
        if (!(licence_input.getText().length() == 0)) {
            licence_required.setVisible(false);
        } else {
            licence_required.setVisible(true);
            licence_required.setText("Must required");
            return false;
        }
        return false;
    }

    private boolean check_licence() {
        boolean check = true;
        licence_required.setVisible(false);
        if (!(licence_input.getText().length() == 0)) {
            for (Doctor name : manager.returnDoctorArrayList()) {
                if (licence_input.getText().equals(name.getMedical_licence_number())) {
                    check = false;
                    break;
                }
            }
            if (check) {
                licence_required.setVisible(true);
                licence_required.setText("Give valid licence");
                return false;
            } else {
                return true;
            }
        } else {
            licence_required.setVisible(true);
            licence_required.setText("Must required");
            return false;
        }

    }

    private boolean validate_date() {
        DateTimeFormatter formater = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        date_required.setVisible(false);
        if (!(consultation_date_input.getText().length() == 0)) {
            try {
                formater.parse(consultation_date_input.getText());
                int user_year = Integer.parseInt("" + consultation_date_input.getText().charAt(0) + consultation_date_input.getText().charAt(1) + consultation_date_input.getText().charAt(2) + consultation_date_input.getText().charAt(3));
                int current_year = Calendar.getInstance().get(Calendar.YEAR);
                date_required.setVisible(false);

                //validate year range
                if (user_year >= current_year) {
                    date_required.setVisible(false);
                    return true;
                } else {
//                System.out.println("Give a correct year");
                    date_required.setVisible(true);
                    date_required.setText("Give correct year");
                    return false;
                }

            } catch (Exception e) {
//            System.out.println("Invalid date type");
                date_required.setVisible(true);
                date_required.setText("Give correct format");
                return false;
            }
        }
        else {
            date_required.setVisible(true);
            date_required.setText("Must required");
            return false;
        }
    }

    private boolean validate_time(){
        DateTimeFormatter formater = DateTimeFormatter.ofPattern("HH:mm");
        time_required.setVisible(false);
        if (!(time_input.getText().length() == 0)) {
            try {
                formater.parse(time_input.getText());
                int user_hour = Integer.parseInt("" + time_input.getText().charAt(0) + time_input.getText().charAt(1));
                time_required.setVisible(false);

                //validate year range
                if ((8 <= user_hour)&&(user_hour< 21 )) {
                    time_required.setVisible(false);
                    return true;
                } else {
//                System.out.println("Give a correct year");
                    time_required.setVisible(true);
                    time_required.setText("Give correct time");
                    return false;
                }

            } catch (Exception e) {
//            System.out.println("Invalid date type");
                time_required.setVisible(true);
                time_required.setText("Give correct format");
                return false;
            }
        }
        else {
            time_required.setVisible(true);
            time_required.setText("Must required");
            return false;
        }
    }

    private Boolean validate_first_name() {
        if (!(first_name_input.getText().length() == 0)) {
            first_name_required.setVisible(false);
            return true;
        } else {
            first_name_required.setVisible(true);
            first_name_required.setText("Must required");
            return false;
        }
    }

    private Boolean validate_surname() {
        if (!(surname_input.getText().length() == 0)) {
            surnme_required.setVisible(false);
            return true;
        } else {
            surnme_required.setVisible(true);
            surnme_required.setText("Must required");
            return false;
        }
    }


    private boolean validate_dob() {
        DateTimeFormatter formater = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        dob_required.setVisible(false);
        if (!(dob_input.getText().length() == 0)) {
            try {
                formater.parse(dob_input.getText());
                int birth_year = Integer.parseInt("" + dob_input.getText().charAt(0) + dob_input.getText().charAt(1) + dob_input.getText().charAt(2) + dob_input.getText().charAt(3));
                int current_year = Calendar.getInstance().get(Calendar.YEAR);
                dob_required.setVisible(false);

                //validate year range
                if (birth_year <= current_year) {
                    dob_required.setVisible(false);
                    return true;
                } else {
//                System.out.println("Give a correct year");
                    dob_required.setVisible(true);
                    dob_required.setText("Give correct year");
                    return false;
                }

            } catch (Exception e) {
//            System.out.println("Invalid date type");
                dob_required.setVisible(true);
                dob_required.setText("Give correct format");
                return false;
            }
        }
        else {
            dob_required.setVisible(true);
            dob_required.setText("Must required");
            return false;
        }
    }

    private Boolean validate_mobile() {
        if (!(mobile_num_input.getText().length() == 0)) {
            mobile_required.setVisible(false);
            return true;
        } else {
            mobile_required.setVisible(true);
            mobile_required.setText("Must required");
            return false;
        }
    }

    private Boolean validate_id() {
        if (!(id_num_input.getText().length() == 0)) {
            id_required.setVisible(false);
            return true;
        } else {
            id_required.setVisible(true);
            id_required.setText("Must required");
            return false;
        }
    }

}




