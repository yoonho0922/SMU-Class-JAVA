package week12;

public class Rectangle extends Shape {
    private Point p1;
    private Point p2;

    public Rectangle(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public Rectangle(int x1, int y1, int x2, int y2){
        Point p1 = new Point(x1,y1);
        Point p2 = new Point(x2,y2);

        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public double getArea(){   //면적
        return Math.abs(p2.getX()-p1.getX())
                * Math.abs(p2.getY()-p1.getY());
    }

    @Override
    public double getPerimeter(){   //둘레
        return (Math.abs(p2.getX()-p1.getX())
                + Math.abs(p2.getY()-p1.getY()))*2;
    }

    public String toString(){
        return "week12.Rectangle: \np1: "+p1.toString()+"\np2: "+p2.toString();
    }
}
