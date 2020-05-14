public class Main {
    public static void main(String[] args){
        StudentDB db = new StudentDB();
        Student student = new Student("김지우", 201911111, 4.01);

        db.add(student);
        db.add("이민준", 201922222, 3.85);
        db.add("박서윤", 201933333, 3.90);



        System.out.println("find by 김지우 - " + db.findBy("김지우"));
        System.out.println("find by 201922222 - " + db.findBy(201922222));
        System.out.println("find by 3.90 - " + db.findBy(3.90));

        System.out.println("find by lower than 3.90 - " + db.findBy(StudentDB.FindGPAParam.LOWER_THAN, 3.95));
        System.out.println("find by higher than 3.90 - " + db.findBy(StudentDB.FindGPAParam.HIGHER_THAN, 3.95));

    }
}
