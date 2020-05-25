package week10;

import java.awt.*;

class Rectangle {
    public static final int WIDTH = 50;
    public static final int HEIGHT = 50;
    private Point upperLeft;
    private Point lowerRight;


    public Rectangle(Point uL){
        Point lR = new Point(uL);
        lR.translate(WIDTH, HEIGHT);

        this.upperLeft = uL;
        this.lowerRight = lR;

//        uL.translate(WIDTH,HEIGHT);
//        this.lowerRight = uL;
//        this.lowerRight = new Point(
//                (int)uL.getX()+WIDTH,(int)uL.getY()+HEIGHT);
    }
    public Rectangle(Point uL, Point lR){
        this.upperLeft = uL;
        this.lowerRight = lR;
    }

    public void translate(int x, int y){
        upperLeft.translate(x,y);
        lowerRight.translate(x,y);
    }
    public String toString(){
        return "UL: "+upperLeft.toString()+", LR: " +lowerRight.toString();
    }
}
