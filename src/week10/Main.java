package week10;

import java.awt.Point;
public class Main {
    public static void main(String[] args) {
        Block1 b = new Block1(10, 10);
        Rectangle r = new Rectangle(new Point(10, 10));
        Rectangle r2 = new Rectangle(new Point(20, 20),
                new Point(70, 70));

        //실행 예시 재현
        System.out.println("r");
        System.out.println(r.toString());
        System.out.println("r2");
        System.out.println(r2.toString());
        System.out.println("b");
        System.out.println(b.toString());
        b.translate(10, -10);  //b1 translate
        System.out.println("b");
        System.out.println(b);

        //week10.Block2, week10.Block3
        Block2 b2 = new Block2(new Point(10,10));  //week10.Block2(week12.Point P)로 초기화
        Block3 b3 = new Block3(10,10);  //week10.Block3(int x, int y)로 초기화

        //b2, b3 출력
        System.out.println("week10.Block2, week10.Block3 객체");
        System.out.println("b2");
        System.out.println(b2.toString());
        System.out.println("b3");
        System.out.println(b3.toString());

        //b2, b3 translate
        b2.translate(10,-10);
        b3.translate(10,-10);

        //b2, b3 출력
        System.out.println("translate된 week10.Block2, week10.Block3 객체");
        System.out.println("b2");
        System.out.println(b2.toString());
        System.out.println("b3");
        System.out.println(b3.toString());
    }
}