package week08_midterm;

//  201910812 Ahn Yoonho
public class MidtermMain {
    public static void main(String[] args){

        //calculate fines and print
        System.out.println("CASE 1: fine: " + MidtermTF.OVER2040.getAuto());
        System.out.println("CASE 2: fine: " + (MidtermTF.LIGHT.getVan()+ MidtermTF.YELLOW.getVan()));
        System.out.println("CASE 3: fine: " + (MidtermTF.BUSONLYHIGHWAY.getCar()+ MidtermTF.OVER60.getCar()));

        //calculate random fines 10 times
        MidtermSumFines sf = new MidtermSumFines();
        sf.sum10Times();
    }
}