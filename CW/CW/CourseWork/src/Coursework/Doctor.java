package Coursework;

import java.io.Serializable;

public class Doctor extends Person implements Comparable, Serializable {
    private String medical_licence_number;
    private String specialisation;

    public Doctor(String name, String surname, String date_of_birth, String mobile_number, String medical_licence_number, String specialisation) {
        super(name, surname, date_of_birth, mobile_number);
        this.medical_licence_number = medical_licence_number;
        this.specialisation = specialisation;
    }

    //getters

    public String getMedical_licence_number() {
        return medical_licence_number;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    //setters

    public void setMedical_licence_number(String medical_licence_number) {
        this.medical_licence_number = medical_licence_number;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    @Override
    public String toString() {
        return super.toString() + "Doctor{" +
                "medical_licence_number='" + medical_licence_number + '\'' +
                ", specialisation='" + specialisation + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Doctor doc = (Doctor) o;
        if (this.getSurname().compareToIgnoreCase(doc.getSurname()) > 0) {
            return 1;
        } else if (this.getSurname().compareToIgnoreCase(doc.getSurname()) < 0) {
            return -1;
        } else {
            return 0;
        }

    }
}
