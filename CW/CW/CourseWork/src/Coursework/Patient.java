package Coursework;

import java.io.Serializable;

public class Patient extends Person implements Serializable {
    private String id;

    public Patient(String name, String surname, String date_of_birth, String mobile_number, String id) {
        super(name, surname, date_of_birth, mobile_number);
        this.id = id;
    }

    //getters

    public String getId() {
        return id;
    }

    //setters

    @Override
    public String toString() {
        return super.toString() + "Patient{" +
                "id='" + id + '\'' +
                '}';
    }

    public void setId(String id) {
        this.id = id;
    }
}
