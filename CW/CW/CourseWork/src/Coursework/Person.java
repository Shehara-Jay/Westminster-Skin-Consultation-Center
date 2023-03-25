package Coursework;

import java.io.Serializable;

public abstract class Person implements Serializable {
    private String name;
    private String surname;
    private String date_of_birth;
    private String mobile_number;

    public Person(String name, String surname, String date_of_birth, String mobile_number) {
        this.name = name;
        this.surname = surname;
        this.date_of_birth = date_of_birth;
        this.mobile_number = mobile_number;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", date_of_birth='" + date_of_birth + '\'' +
                ", mobile_number='" + mobile_number + '\'' +
                '}';
    }

    //getters

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public String getMobile_number() {
        return mobile_number;
    }

    //setters

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public void setMobile_number(String mobile_number) {
        this.mobile_number = mobile_number;
    }
}
