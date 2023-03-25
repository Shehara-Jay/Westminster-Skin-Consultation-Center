package Coursework;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class WestminsterSkinConsultationManager implements SkinConsultationManager {
    // create doctor list
    public  ArrayList<Doctor>doctors_list = new ArrayList<>();
    public ArrayList<Consultation> consultation_list = new ArrayList<>();

    //file path for doctor stored data
    public  File doctors_files =new File("Stored data/Doctors_list.txt");

    public  File consultation_files =new File("Stored data/consultation_file.txt");
    public WestminsterSkinConsultationManager() throws IOException {
        doctors_list = loadDateFromFile(doctors_list,doctors_files,"doctor");
        consultation_list = loadDateFromFile(consultation_list,consultation_files,"consultation");
    }

    @Override
    public void add_new_doctor(Doctor doctor) {
        doctors_list.add(doctor);
        Collections.sort(doctors_list);
    }

    @Override
    public void delete_doctor(String licence_num) {
        boolean check = true;
        for (Doctor name : doctors_list){
            if (licence_num.equals(name.getMedical_licence_number())){
                System.out.println("\n~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ");
                System.out.println("Doctor's name is "+name.getName());
                System.out.println("Doctor's surname is "+name.getSurname());
                System.out.println("Doctor's date of birth is "+name.getDate_of_birth());
                System.out.println("Doctor's medical_licence_number is "+name.getMedical_licence_number());
                System.out.println("Doctor's specialisation type is "+name.getSpecialisation());
                System.out.println("Successfully deleted the doctor ");
                System.out.println("\n~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ");

                doctors_list.remove(name);
                System.out.println("Total number of doctors are "+doctors_list.size());
                System.out.println();
                check = false;
                break;
            }
        }
        if (check){
            System.out.println("The medical licence number is not found..");
        }

    }

    @Override
    public void print_list() {
        Collections.sort(doctors_list);
        for (Doctor name : doctors_list){
            System.out.println("\n~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ");
            System.out.println("Doctor's name is "+name.getName());
            System.out.println("Doctor's surname is "+name.getSurname());
            System.out.println("Doctor's date of birth is "+name.getDate_of_birth());
            System.out.println("Doctor's medical_licence_number is "+name.getMedical_licence_number());
            System.out.println("Doctor's specialisation type is "+name.getSpecialisation());
            System.out.println("\n~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ");
            System.out.println();
        }

    }

    @Override
    public void save_file(String storeName) throws IOException {
        ObjectOutputStream oos = null;
        File fileName = null;
        ArrayList listName = null;
        if (storeName.equals("Doctor")){
            fileName=this.doctors_files;
            listName=this.doctors_list;
         }

        else {
            fileName=this.consultation_files;
            listName=this.consultation_list;
        }

        try {
            oos=new ObjectOutputStream(new FileOutputStream(fileName));
            oos.writeObject(listName);
            System.out.println("Successful Saved data!!! in "+storeName);
        }catch (Exception e){
            System.out.println(e);
            System.out.println("Error in "+storeName);
        }finally {
            oos.close();
        }

    }

    @Override
    public ArrayList<Doctor> returnDoctorArrayList() {
        return doctors_list;
    }

    @Override
    public ArrayList<Patient> returnPatientArrayList() {
        return null;
    }

    @Override
    public ArrayList<Consultation> returnConsultationArrayList() {
        return consultation_list;
    }
    public static <T> ArrayList<T> loadDateFromFile(ArrayList<T> listName,File filename,String storename) throws IOException {
        ObjectInputStream ois=null;
        Boolean checkFile=false;


        try {
            if (filename.isFile()){
                if ((filename).length()==0) {
                    System.out.println("No any old data in store "+storename);//Store meaning to file
                }else {
                    ois=new ObjectInputStream(new FileInputStream(filename));
                    listName= (ArrayList<T>) ois.readObject();
                    checkFile=true;
                }
            }else {
                System.out.println("Cant find store "+storename);
            }
        }catch (Exception e){
            System.out.println(e);
            System.out.println("Error in "+storename);
        }finally {
            if (checkFile){
                ois.close();
            }
        }
        return listName;
    }
}
