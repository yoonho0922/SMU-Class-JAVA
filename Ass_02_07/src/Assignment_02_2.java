import java.util.Scanner;

public class Assignment_02_2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double R1, R2, Height;
        R1 = sc.nextDouble();
        R2 = sc.nextDouble();
        Height = sc.nextDouble();

        double res = 3.14*(R1*R1+R1*R2+R2*R2)*Height/3;

        System.out.println(res);


    }
}
