package week05;

public class Assignment_05 {

    public static void main(String[] args){

        CardDeck cd = new CardDeck();   //카드 덱 클래스 생성

        cd.show();  //카드 덱에 현재 몇 장의 카드가 있는지 화면에 출력
        cd.deal();  //카드를 한 장 나눠줌
        cd.show();  //카드 덱에 현재 몇 장의 카드가 있는지 화면에 출력
        cd.deal();  //카드를 한 장 나눠줌
        cd.show();  //카드 덱에 현재 몇 장의 카드가 있는지 화면에 출력

    }


}

class CardDeck{
    int[] cardDeck = {0, 0, 0};
    int n = 2;
    CardDeck(){

        for(int i=0; i<3; i++){
            cardDeck[i] = (int) Math.floor(Math.random() * 9) + 2;
        }
    }//End of function

    void show(){
        System.out.println("카드덱에 있는 카드 수 : " + (n+1));
    }

    void deal(){
        if(n!=0){
            System.out.println("카드 덱에서 빼낸 카드 : Diamond " + cardDeck[n]);
            n--;
        }else if(n<0){
            System.out.println("카드 덱에 카드가 없습니다!!");
            return;
        }
    }//End of function

}//End of class