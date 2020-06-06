package week11.oop2020;

import java.util.Date;

public class Patient {
    private String id;
    private String name;
    public Patient(String name){
        Date d = new Date();
        this.id = name + d.getTime();
        this.name = name;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return "Patient name: " + name + " id: " + id;
    }
}
