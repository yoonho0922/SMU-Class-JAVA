//  201910812 Ahn Yoonho
class MidtermSumFines {
    void sum10Times(){
        int sum=0;
        int rv;     //random violation
        int rc;     //rnadom car
        for(int i = 0; i<10; i++){
            rv = (int) Math.floor(Math.random() * 9);    //random 0~8
            rc = (int) Math.floor(Math.random() * 3);          //random 0~2
            switch (rv){
                case 0 :
                    sum += getFine(MidtermTF.LIGHT, rc);
                    break;
                case 1 :
                    sum += getFine(MidtermTF.PEDESTRIAN, rc);
                    break;
                case 2 :
                    sum += getFine(MidtermTF.YELLOW, rc);
                    break;
                case 3 :
                    sum += getFine(MidtermTF.BUSONLYHIGHWAY, rc);
                    break;
                case 4 :
                    sum += getFine(MidtermTF.LANE, rc);
                    break;
                case 5 :
                    sum += getFine(MidtermTF.OVER60, rc);
                    break;
                case 6 :
                    sum += getFine(MidtermTF.OVER4060, rc);
                    break;
                case 7 :
                    sum += getFine(MidtermTF.OVER2040, rc);
                    break;
                case 8 :
                    sum += getFine(MidtermTF.OVER20, rc);
                    break;

            }//Eof switch
        }//Eof loop
        System.out.println("Total fine: " + sum);
    }//Eof func

    int getFine(MidtermTF midtermTf, int rc){
        String car="";
        if(rc == 0) {   //car is VAN
            car = "VAN";
            System.out.printf("car: %s, violation: %s, fine: %d \n", car, midtermTf, midtermTf.getVan());
            return midtermTf.getVan(); //return fine
        }
        else if(rc == 1) {  //car is CAR
            car = "CAR";
            System.out.printf("car: %s, violation: %s, fine: %d \n", car, midtermTf, midtermTf.getCar());
            return midtermTf.getCar();
        }
        else {  //car is AUTO
            car = "AUTO";
            System.out.printf("car: %s, violation: %s, fine: %d \n", car, midtermTf, midtermTf.getAuto());
            return midtermTf.getAuto();
        }
    }//Eof func
}//Eof class