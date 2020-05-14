//  201910812 Ahn Yoonho
enum MidtermTF {  //MidtermEnum
    //    LIGHT(8, 7, 5),   //before change
    LIGHT(9,8,4),   //changed fine
    PEDESTRIAN(8, 7, 5),
    YELLOW(10,9,0),
    BUSONLYHIGHWAY(10,9,0),
    LANE(4,4,3),
    OVER60(14,13,9),
    OVER4060(11,10,7),
    //    OVER2040(8,7,5),  //before change
    OVER2040(12,11,8),  //changed fine
    OVER20(4,4,3);

    int van; int car; int auto;

    MidtermTF(int van, int car, int auto){
        this.van = van;
        this.car = car;
        this.auto = auto;
    }
    int getVan(){return van;}
    int getCar(){return car;}
    int getAuto(){return auto;}
}