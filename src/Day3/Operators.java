package Day3;

import java.util.Scanner;

public class Operators {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("type the cost of meal");
        float cost=sc.nextFloat();
        System.out.println("type the tip % of meal");
        float tip=sc.nextFloat();
        System.out.println("type the tax of meal");
        float tax=sc.nextFloat();
        float tip_per, tax_per, sub_tip;
        int totalcost;

        if (cost<=10000 && cost>=5000){
            float dc=cost-500;
            tip_per=cost/100*tip;
            tax_per=cost/100*tax;
            totalcost=Math.round(dc+tip_per+tax_per);
            System.out.println(totalcost);
        }
        else if (cost>10000){
            float dc=cost-700;
            tip_per=cost/100*tip;
            sub_tip=tip_per/100*20;
            tax_per=cost/100*tax;
            totalcost=Math.round(dc+tip_per+tax_per-sub_tip);
            System.out.println(totalcost);
        }
        else{
            tip_per=cost/100*tip;
            tax_per=cost/100*tax;
            totalcost=Math.round(cost+tip_per+tax_per);
            System.out.println(totalcost);
        }





    }
}
