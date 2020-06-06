package week12;

public class Circle extends Shape {
    private Point center;
    private int radius;

    public Circle(Point p, int r){
        this.center = p;
        this.radius = r;
    }

    public Circle(int x, int y, int r){
        Point p = new Point(x,y);
        this.center = p;
        this.radius = r;
    }

    @Override
    public double getArea(){   //면적
        return radius*radius*Math.PI;
    }

    @Override
    public double getPerimeter(){   //둘레
        return 2*radius*Math.PI;
    }

    public String toString(){
        return "week12.Circle: \ncenter: "+center.toString()+"\nradius: "+radius;
    }
}
