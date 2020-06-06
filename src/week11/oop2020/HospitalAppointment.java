package week11.oop2020;

import java.time.LocalDateTime;

public class HospitalAppointment {
    private Doctor doc;
    private Patient pat;
    private LocalDateTime time;
    public HospitalAppointment(Doctor doc, Patient pat, LocalDateTime time){
        this.doc = doc;
        this.pat = pat;
        this.time = time;
    }

    public Doctor getDoc() {
        return doc;
    }

    public Patient getPat() {
        return pat;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public String toString(){
        return "HospitalAppointment: "+time+"\n"+doc.toString()+"\n"+pat.toString();
    }

}
