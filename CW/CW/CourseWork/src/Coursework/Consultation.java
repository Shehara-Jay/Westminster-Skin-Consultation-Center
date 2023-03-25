package Coursework;

import java.io.Serializable;

public class Consultation implements Serializable {
   private String date;
    private String time;
    private int cost;
    private String note;
    private int hour_time;

    private Doctor doctor;
    private Patient patient;

    public Consultation(String date, String time, int cost, String note,int hour_time,Doctor doctor,Patient patient) {
        this.date = date;
        this.time = time;
        this.cost = cost;
        this.note = encrypt(note);
        this.hour_time =hour_time;
        this.doctor= doctor;
        this.patient= patient;
    }

    //getters

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public int getCost() {
        return cost;
    }

    public String getNote() {
        return note;
    }

    public int getHour_time() {
        return hour_time;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    //setters

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setHour_time(int hour_time) {
        this.hour_time = hour_time;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public  String encrypt(String plainText) {
        StringBuilder encryptedText = new StringBuilder();
        for (int i = 0; i < plainText.length(); i++) {
            char c = plainText.charAt(i);
            encryptedText.append((char) (c + 3));
        }
        return encryptedText.toString();
    }


    // Decryption code
    public  String decrypt() {
        String encryptedText=this.note;
        StringBuilder decryptedText = new StringBuilder();
        for (int i = 0; i < encryptedText.length(); i++) {
            char c = encryptedText.charAt(i);
            decryptedText.append((char) (c - 3));
        }
        return decryptedText.toString();
    }

    @Override
    public String toString() {
        return "Consultation{" +
                "date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", cost=" + cost +
                ", note encrpt='" + note + '\'' +
                ", note dencrpt='" + decrypt() + '\'' +
                ", hour_time=" + hour_time +
                ", doctor=" + doctor +
                ", patient=" + patient +
                '}';
    }
}
