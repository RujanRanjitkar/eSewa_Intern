package Day3;

import java.util.Scanner;

public class OperatorTask {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter price");
        float mealPrice=sc.nextFloat();

        System.out.println("Enter tippercentage");
        float tipPercentage=sc.nextFloat();


        System.out.println("Enter tax percentage");
        float taxPercentage=sc.nextFloat();

        float tip=tipPercentage/100 *mealPrice;

        float deTip=(float) 20/100 * tip;

        float tax=taxPercentage/100 *mealPrice;
        float totalCost;

        if(mealPrice>=5000 && mealPrice<10000){
            mealPrice=mealPrice-500;
             totalCost=mealPrice+tip + tax;
            System.out.println(totalCost);
        }

        else if(mealPrice>10000){
            mealPrice=mealPrice-700;
             totalCost=mealPrice+tip-deTip + tax;
            System.out.println(totalCost);
        }

    }
}
