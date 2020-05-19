package week02;

import java.util.Scanner;

public class Assignment_02_1 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        double res1, res2;

        res1 = (-b + Math.sqrt(b*b-4*a*c))/2;
        res2 = (-b - Math.sqrt(b*b-4*a*c))/2;

        System.out.println(res1 + ", " + res2);


    }
}
