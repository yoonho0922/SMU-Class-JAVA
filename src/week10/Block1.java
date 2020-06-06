package week10;

import java.awt.*;

class Block1 {
    private Rectangle[] rectangles = new Rectangle[4];;

    public Block1(Point P){

        //4개의 week10.week12.Rectangle 인스턴스 생성
        for(int i=0; i<4; i++){
            rectangles[i]= new Rectangle(P);
        }

        //3개의 week10.week12.Rectangle 위치 조정
        initRecs();
    }
    public Block1(int x, int y){

        //4개의 week10.week12.Rectangle 인스턴스 생성
        for(int i=0; i<rectangles.length; i++){
            rectangles[i]= new Rectangle(new Point(x,y));
        }

        //3개의 week10.week12.Rectangle 위치 조정
        initRecs();
    }

    //4개의 Rectangle의 위치를 초기화
    private void initRecs(){
        rectangles[1].translate(Rectangle.WIDTH,0);
        rectangles[2].translate(0,Rectangle.HEIGHT);
        rectangles[3].translate(Rectangle.WIDTH,Rectangle.HEIGHT);
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
