package week06;

import java.util.Scanner;

public class Assignment_06 {

    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        int sum = 0;

        System.out.print("정수를 입력하세요 : ");
        n = sc.nextInt();

        Dice dice = new Dice();

        for(int i = 0; i<n; i++){
            sum += dice.roll();
            dice.show();
        }

        System.out.println("횟수 : " + n);
        System.out.println("합계 : " + sum);
        if(sum%2==0){
            System.out.println("짝수가 나왔으므로 버스를 탑니다");
        }else{
            System.out.println("홀수가 나왔으므로 지하철을 탑니다");
        }

    }
}

class Dice{

    int diceNum;

    int roll(){
        return diceNum = (int) Math.floor(Math.random() * 6) + 1;
    }

    void show(){
        System.out.println("주사위 수 : " + diceNum);
    }
}