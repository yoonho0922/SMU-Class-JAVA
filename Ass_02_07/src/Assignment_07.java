import java.util.Scanner;

public class Assignment_07 {
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("카드 이름: ");
        String c = sc.nextLine();

        switch (c){
            case "CJ ONE 삼성 카드" :
                System.out.printf("할인률: %d, 적립률: %d\n",
                        Card.CJONE_SAMSUNG.getDisRate(),Card.CJONE_SAMSUNG.getAccRate());
                break;
            case "CJ ONE 신한 카드" :
                System.out.printf("할인률: %d, 적립률: %d\n",
                        Card.CJONE_SHINHAN.getDisRate(),Card.CJONE_SHINHAN.getAccRate());
                break;
            case "The CJ" :
                System.out.printf("할인률: %d, 적립률: %d\n",
                        Card.THE_CJ.getDisRate(),Card.THE_CJ.getAccRate());
                break;
            case "삼성 6 V4" :
                System.out.printf("할인률: %d, 적립률: %d\n",
                        Card.SAMSUNG_6_V4.getDisRate(),Card.SAMSUNG_6_V4.getAccRate());
                break;
            case "신한 Lady" :
                System.out.printf("할인률: %d, 적립률: %d\n",
                        Card.SHINHAN_LADY.getDisRate(),Card.SHINHAN_LADY.getAccRate());
                break;
            case "KB Star" :
                System.out.printf("할인률: %d, 적립률: %d\n",
                        Card.KB_STAR.getDisRate(),Card.KB_STAR.getAccRate());
                break;
            case "이마트 KB" :
                System.out.printf("할인률: %d, 적립률: %d\n",
                        Card.EMART_KB.getDisRate(),Card.EMART_KB.getAccRate());
                break;
            default : System.out.println("잘못된 카드입니다.");
        }
    }
}

enum Card{
    CJONE_SAMSUNG("CJ ONE 삼성 카드",30,1),
    CJONE_SHINHAN("CJ ONE 신한 카드",30,1),
    THE_CJ("The CJ",20,2),
    SAMSUNG_6_V4("삼성 6 V4",20,0),
    SHINHAN_LADY("신한 Lady",20,0),
    KB_STAR("KB Star",20,0),
    EMART_KB("이마트 KB",15,0);

    String cardName; int disRate; int accRate;

    Card(String cardName, int disRate, int accRate){
        this.cardName = cardName;
        this.disRate = disRate;
        this.accRate = accRate;
    }
    String getCardName(){ return cardName; }
    int getDisRate(){ return disRate; }
    int getAccRate(){ return accRate; }
}
