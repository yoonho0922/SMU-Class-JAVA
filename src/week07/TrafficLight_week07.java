package week07;

public class TrafficLight_week07 {
    public static void main(String[] args){
        for (TrafficLight tl : TrafficLight.values()) {
            System.out.printf("Value: %s, Color: %s, Time: %d\n", tl, tl.getColor(), tl.getTime());
        }
    }
}

enum TrafficLight{
    RED("RED", 30), AMBER("AMBER", 10), GREEN("GREEN", 30);

    String color;   //this.color
    int time;       //tis.time

    TrafficLight(String color, int time){
        this.color = color;
        this.time = time;
    }
    String getColor(){ return color; }
    int getTime(){ return time; }
}