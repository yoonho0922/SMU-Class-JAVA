public class Ass08_Student {
    String name;
    int number;
    double gpa;

    Ass08_Student(String name, int number, double gpa){
        this.name = name;
        this.number = number;
        this.gpa = gpa;
    }

    String getName(){
        return name;
    }

    int getNumber(){
        return number;
    }

    double getGPA(){
        return gpa;
    }

    public String toString(){
        return "Name: "+name+", Number: "+number+", GPA: "+gpa;
    }
}
