import java.util.Scanner;

public class Assignment_03 {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] s = new char[5];

        s[0] = sc.next().charAt(0);
        s[1] = sc.next().charAt(0);
        s[2] = sc.next().charAt(0);
        s[3] = sc.next().charAt(0);
        s[4] = sc.next().charAt(0);

        System.out.print("문자열 ");
        System.out.printf("%c%c%c%c%c", s[0], s[1], s[2], s[3], s[4]);
        System.out.print("의 해시 값은 ");
        System.out.printf("%.2f", (double)s[0]*Math.pow(31,4)+(double)s[1]*Math.pow(31,3)+
                (double)s[2]*Math.pow(31,2)+(double)s[3]*Math.pow(31,1)+(double)s[4]*Math.pow(31,0));



    }
}
