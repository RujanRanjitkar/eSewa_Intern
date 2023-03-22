package Day3;

import java.util.Scanner;

public class OperatorDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Meal price:");
        float mealPrice = sc.nextFloat();
        System.out.println("Enter tip:");
        float tip = sc.nextFloat();
        tip = tip / 100 * mealPrice;
        System.out.println("Enter tax:");
        float tax = sc.nextFloat();
        tax = tax / 100 * mealPrice;
        if (mealPrice >= 5000 && mealPrice <= 10000) {
            mealPrice = mealPrice - 500;
        } else if (mealPrice > 10000) {
            tip = tip - (float) 20 / 100 * tip;
            mealPrice = mealPrice - 700;
        }
        int total = Math.round(mealPrice + tip + tax);
        System.out.println(mealPrice);
        System.out.println(tip);
        System.out.println(tax);
        System.out.println("The total cost is:" + total);
    }
}
