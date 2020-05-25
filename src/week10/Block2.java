package week10;

import java.awt.*;

class Block2 {
    private Rectangle[] rectangles = new Rectangle[4];;

    public Block2(Point P){

        //4개의 week10.Rectangle 인스턴스 생성
        for(int i=0; i<4; i++){
            rectangles[i]= new Rectangle((Point)P.clone());
    }

        //3개의 week10.Rectangle 위치 조정
        initRecs();
    }
    public Block2(int x, int y){

        //4개의 week10.Rectangle 인스턴스 생성
        for(int i=0; i<rectangles.length; i++){
            rectangles[i]= new Rectangle(new Point(x,y));
        }

        //3개의 week10.Rectangle 위치 조정
        initRecs();
    }

    //4개의 Rectangle의 위치를 초기화
    private void initRecs(){
        rectangles[1].translate(0,Rectangle.HEIGHT);
        rectangles[2].translate(0,Rectangle.HEIGHT*2);
        rectangles[3].translate(0,Rectangle.HEIGHT*3);
    }

    public void translate(int x, int y){
        for(Rectangle r : rectangles)
            r.translate(x,y);

    }
    public String toString(){
        String s = "";   //return할 String 변수

        for(Rectangle r : rectangles){
            s += r + "\n";
        }

        return s;
    }
}
