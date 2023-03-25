package Coursework;

import java.io.IOException;
import java.util.ArrayList;

public interface SkinConsultationManager {
    void add_new_doctor(Doctor doctor);
    void delete_doctor(String licence_num);
    void print_list();
    void save_file(String storeName) throws IOException;

    ArrayList<Doctor> returnDoctorArrayList();
    ArrayList<Patient> returnPatientArrayList();
    ArrayList<Consultation> returnConsultationArrayList();
}
