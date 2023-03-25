package Coursework.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class RegisterPatientGui extends JFrame {

    private JFrame frame4 = new JFrame();
    private JPanel panel5 = new JPanel();
    private JLabel title = new JLabel("Register Now");
    private ImageIcon form_pic = new ImageIcon("Photos/registerform.png");
    private JLabel form_label = new JLabel(form_pic);
    private JLabel first_name = new JLabel("First Name");
    private JTextField first_name_input = new JTextField();
    private JLabel surname = new JLabel("Surname");
    private JTextField surname_input = new JTextField();
    private JLabel dob = new JLabel("Date Of Birth");
    private JTextField dob_input = new JTextField();
    private JLabel dob_required = new JLabel("Must be required");
    private JLabel mobile_num = new JLabel("Mobile Number");
    private JTextField mobile_num_input = new JTextField();
    private JLabel id_num = new JLabel("ID Number");
    private JTextField id_num_input = new JTextField();
    private JButton back_button = new JButton("Back");
    private JButton reset_button = new JButton("Reset");
    private JButton confirm_button = new JButton("Confirm");
    public RegisterPatientGui(){
        frame4.setTitle("Westminster Skin Consultation Manager");
        frame4.setSize(1000,800);
        frame4.setVisible(true);
        frame4.setLocationRelativeTo(null);
        frame4.setResizable(false);
        frame4.setLayout(null);
        frame4.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        panel5.setBackground(Color.white);
        panel5.setSize(1000, 800);
        panel5.setVisible(true);
        panel5.setLayout(null);
        frame4.add(panel5);

        form_label.setSize(1000, 800);
        panel5.add(form_label);

        title.setSize(800, 50);
        title.setLocation(360, 50);
        title.setFont(new Font("Times New Roman", Font.BOLD, 40));
        title.setForeground(new Color(0, 0, 0 ));
        form_label.add(title);

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
        dob_required.setLocation(850, 385);
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

        back_button.setSize(200, 70);
        back_button.setLocation(40, 650);
        back_button.setFont(new Font("Times New Roman", Font.BOLD, 20));
        back_button.setForeground(new Color(0, 0, 0 ));
        back_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              new BookDocGui();
            }
        });
        form_label.add(back_button);

        reset_button.setSize(200, 70);
        reset_button.setLocation(400, 650);
        reset_button.setFont(new Font("Times New Roman", Font.BOLD, 20));
        reset_button.setForeground(new Color(0, 0, 0 ));
        reset_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clear_form();
            }
        });
        form_label.add(reset_button);

        confirm_button.setSize(200, 70);
        confirm_button.setLocation(750, 650);
        confirm_button.setFont(new Font("Times New Roman", Font.BOLD, 20));
        confirm_button.setForeground(new Color(0, 0, 0 ));
        form_label.add(confirm_button);

    }
    void clear_form() {
        first_name_input.setText("");
        surname_input.setText("");
        dob_input.setText("");
        mobile_num_input.setText("");
        id_num_input.setText("");
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
                if (birth_year < current_year) {
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
}
