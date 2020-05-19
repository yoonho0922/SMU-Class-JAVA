public class Enum_week07 {

    public static void main(String[] args){

        System.out.println(Day.MONDAY);

        for (Month month : Month.values()) {
            System.out.printf("Value: %s, Num: %d, Name: %s\n", month, month.getMonth(), month.getName());
        }

    }
}

enum Day { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY };

//    enum 자료형을 선언할 때 생성자와 멤버 함수들을
//    포함시키면, 이들은 enum에 있는 상수의 멤버 변수
//    와 함수가 됨

enum Month {
    JAN(1, "January"), FEB(2, "February"),
    MAR(3, "March"), APR(4, "April"),
    MAY(5, "May"), JUN(6, "June"),
    JUL(7, "July"), AUG(8, "August"),
    SEP(9, "September"), OCT(10, "October"),
    NOV(11, "November"), DEC(12, "December");
    int month;
    String name;
    Month(int month, String name) {
        this.month = month;
        this.name = name;
    }
    int getMonth() {
        return month;
    }
    String getName() {
        return name;
    }
}

