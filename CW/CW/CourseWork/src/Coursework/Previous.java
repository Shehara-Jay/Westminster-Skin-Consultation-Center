//import java.io.*;
//import java.time.format.DateTimeFormatter;
//import java.util.*;
//
//public class Previous implements SkinConsultationManager {
//    public static Scanner in = new Scanner(System.in);
//    // create doctor list
//    public static ArrayList<Doctor>doctors_list = new ArrayList<>();
//
//    //file path for doctor stored data
//    public static File doctors_files =new File("Stored data/Doctors_list.txt");
//
//    public static void main(String[] args) throws IOException {
//        doctors_list = loadDateFromfile(doctors_list,doctors_files,"doctor");
//        System.out.println("\033[31mDoctor console part\033[0m");
//        while (true) {
//            String input;
//
//            while (true) {
//                System.out.println("Enter [A] to Add a new doctor");
//                System.out.println("Enter [D] to Delete a doctor");
//                System.out.println("Enter [P] to Print the list of the doctors");
//                System.out.println("Enter [S] to Save in a file ");
//                System.out.println("Enter [Q] to Quit the Program ");
//                input = in.next().toUpperCase();
//                if ((input.equals("A")) || (input.equals("D")) || (input.equals("P")) || (input.equals("S")) || (input.equals("Q"))) {
//                    break;
//                }
//                else {
//                    System.out.println("You entered wrong input.. Please enter a valid input..");
//                    System.out.println();
//                }
//
//            }
//            if (input.equals("A")) {
//                add_new_doctor();
//            } else if (input.equals("D")) {
//                delete_doctor();
//
//            } else if (input.equals("P")) {
//                print_list();
//
//            } else if (input.equals("S")) {
//                save_file(doctors_files,doctors_list,"Doctor");
//
//            } else if (input.equals("Q")) {
////                quit_program();
//                System.exit(0);
//
//            }
//        }
//
//    }
//
//    // Doctor adding part
//    public static void add_new_doctor(){
//       String doc_name;
//       String doc_surname;
//       String doc_dob;
//       String doc_mobile;
//       String medical_licence_number;
//       String specialisation;
//
//        //Condition for maximum doctors
//       if (doctors_list.size()<=10){
//           System.out.print("Enter doctor's name: ");
//           doc_name = in.next();
//           System.out.print("Enter doctor's surname: ");
//           doc_surname = in.next();
//           doc_dob = get_Birthday();
//           System.out.print("Enter doctor's mobile number: ");
//           doc_mobile = in.next();
//           medical_licence_number = get_medical_licence_number();
//           System.out.print("Enter doctor's specialisation type : ");
//           specialisation = in.next();
//
//           //Create a doctor
//           Doctor doctor = new Doctor(doc_name,doc_surname,doc_dob,doc_mobile,medical_licence_number,specialisation);
//           doctors_list.add(doctor);
//           System.out.println("\033[31m\n~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~\033[0m");
//           System.out.println("Successfully added a doctor ");
//           System.out.println("Doctor's name is "+doctor.getName());
//           System.out.println("Doctor's surname is "+doctor.getSurname());
//           System.out.println("Doctor's date of birth is "+doctor.getDate_of_birth());
//           System.out.println("Doctor's medical_licence_number is "+doctor.getMedical_licence_number());
//           System.out.println("Doctor's specialisation type is "+doctor.getSpecialisation());
//           System.out.println("\033[31m\n~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~\033[0m");
//
//       }
//       else {
//           System.out.println("The list is already fulled.. ");
//
//       }
//    }
//
//    public static void delete_doctor(){
//        boolean check = true;
//        String licence_num;
//        System.out.print("Enter a medical licence number of the doctor who want to remove: ");
//        licence_num = in.next();
//        for (Doctor name : doctors_list){
//            if (licence_num.equals(name.getMedical_licence_number())){
//                System.out.println("\n~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ");
//                System.out.println("Doctor's name is "+name.getName());
//                System.out.println("Doctor's surname is "+name.getSurname());
//                System.out.println("Doctor's date of birth is "+name.getDate_of_birth());
//                System.out.println("Doctor's medical_licence_number is "+name.getMedical_licence_number());
//                System.out.println("Doctor's specialisation type is "+name.getSpecialisation());
//                System.out.println("Successfully deleted the doctor ");
//                System.out.println("\n~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ");
//
//                doctors_list.remove(name);
//                System.out.println("Total number of doctors are "+doctors_list.size());
//                System.out.println();
//                check = false;
//                break;
//            }
//        }
//        if (check){
//            System.out.println("The medical licence number is not found..");
//        }
//    }
//    public static void print_list(){
//        Collections.sort(doctors_list);
//        for (Doctor name : doctors_list){
//            System.out.println("\n~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ");
//            System.out.println("Doctor's name is "+name.getName());
//            System.out.println("Doctor's surname is "+name.getSurname());
//            System.out.println("Doctor's date of birth is "+name.getDate_of_birth());
//            System.out.println("Doctor's medical_licence_number is "+name.getMedical_licence_number());
//            System.out.println("Doctor's specialisation type is "+name.getSpecialisation());
//            System.out.println("Successfully deleted the doctor ");
//            System.out.println("\n~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ");
//            System.out.println();
//        }
//
//    }
//    public static void save_file(File fileName, ArrayList listName, String storename) throws IOException {
//       ObjectOutputStream oos = null;
//        try {
//            oos=new ObjectOutputStream(new FileOutputStream(fileName));
//            oos.writeObject(listName);
//            System.out.println("Successful added data!!! in "+storename);
//        }catch (Exception e){
//            System.out.println(e);
//            System.out.println("Error in "+storename);
//        }finally {
//            oos.close();
//        }
//    }
//
//
//
//
//
//
//    public static String get_Birthday(){
//        String birthday;
//        DateTimeFormatter formater= DateTimeFormatter.ofPattern("yyyy/MM/dd");
//
//        while (true){
//            System.out.print("Enter doctor's date of birth in this format (YYYY/MM/DD)  : ");
//            birthday=in.next();
//            try {
//                formater.parse(birthday);
//                int user_year=Integer.parseInt(""+birthday.charAt(0)+birthday.charAt(1)+birthday.charAt(2)+birthday.charAt(3));
//                int current_year=Calendar.getInstance().get(Calendar.YEAR);
//
//                //validate year range
//                if (( user_year >= (current_year-65)) && (user_year < (current_year-25))){
//                    break;
//                }else {
//                    System.out.println("use  "+(current_year-65)+"-"+(current_year-25)+" year range");
//                }
//
//            }
//            catch (Exception e){
//                System.out.println("Invalid date type");
//            }
//        }
//        return birthday;
//    }
//    public static String get_medical_licence_number(){
//        String licence_num;
//        if (doctors_list.size()==0){
//            System.out.print("Enter doctor's medical_licence_number : ");
//            licence_num = in.next();
//        }
//        else {
//            while (true){
//                boolean check = true;
//                System.out.print("Enter doctor's medical_licence_number : ");
//                licence_num = in.next();
//                for (Doctor name : doctors_list) {
//                    if (licence_num.equals(name.getMedical_licence_number())){
//                        System.out.println("You cannot give same medical licence numbers..");
//                        check = false;
//                        break;
//                    }
//                }
//                if (check){
//                    break;
//                }
//            }
//        }
//        return licence_num;
//    }
//    public static <T> ArrayList<T> loadDateFromfile(ArrayList<T> listName,File filename,String storename) throws IOException {
//        ObjectInputStream ois=null;
//        Boolean checkFile=false;
//
//        try {
//            if (filename.isFile()){
//                if ((filename).length()==0) {
//                    System.out.println("No any old data in store "+storename);//Store meaning to file
//                }else {
//                    ois=new ObjectInputStream(new FileInputStream(filename));
//                    listName= (ArrayList<T>) ois.readObject();
//                    checkFile=true;
//                }
//            }else {
//                System.out.println("Cant find store "+storename);
//            }
//        }catch (Exception e){
//            System.out.println(e);
//            System.out.println("Error in "+storename);
//        }finally {
//            if (checkFile){
//                ois.close();
//            }
//        }
//        return listName;
//    }
//}
//
