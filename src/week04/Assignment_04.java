package week04;

import java.util.Scanner;

public class Assignment_04 {
    public static void main(String[] args){
        //StringBuilder str = new StringBuilder("Let's meet in my office at 10");
        String str = "Let's meet in my office at 10";
        String selectStr = "";
        String newStr = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("다음 문장에서 문자열을 바꾸는 프로그램입니다.");
        System.out.println("원본 문장 : Let's meet in my office at 10");

        System.out.println("문장에서 바꾸고 싶은  문자열을 입력하세요 :");
        selectStr = sc.nextLine();

        System.out.println("새로운 문자열을 입력하세요 :");
        newStr = sc.nextLine();

        str = str.replace(selectStr, newStr);


        System.out.print("새로운 문장 : " + str);

    }
}
