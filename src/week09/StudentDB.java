package week09;

public class StudentDB {
    Student[] students;
    int i=0;

    enum FindGPAParam {LOWER_THAN, HIGHER_THAN;}

    StudentDB(){
        students = new Student[3];
    }

    void add(Student student){
        students[i] = student;
        i++;
    }
    void add(String name, int number, double gpa){
        Student student = new Student(name, number, gpa);
        students[i] = student;
        i++;
    }

    Student findBy(String name){
        for(int j=0; j<=3; j++){
            if(students[j].getName()==name)
                return students[j];
        }
        return null;
    }
    Student findBy(int number){
        for(int j=0; j<=3; j++){
            if(students[j].getNumber()==number)
                return students[j];
        }

        return null;
    }
    Student findBy(double gpa){
        for(int j=0; j<=i; j++){
            if(students[j].getGPA()==gpa)
                return students[j];
        }
        return null;
    }

    Student findBy(FindGPAParam param, double gpa){
        if(param == FindGPAParam.LOWER_THAN){
            for(int j=0; j<=i; j++){
                if(students[j].getGPA()<gpa)
                    return students[j];
            }
        }else if(param == FindGPAParam.HIGHER_THAN){
            for(int j=0; j<=i; j++){
                if(students[j].getGPA()>gpa)
                    return students[j];
            }
        }
        System.out.println("no student");
        return null;
    }

}

