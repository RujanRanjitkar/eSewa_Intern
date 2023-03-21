package Day3;
import java.util.Scanner;
public class OperatorDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Meal price:");
        float mealprice= sc.nextFloat();
        System.out.println("Enter tip:");
        float tip= sc.nextFloat();
        System.out.println("Enter tax:");
        float tax= sc.nextFloat();
        tax=tax/100*mealprice;
        if(mealprice>=5000 && mealprice<=10000){
            tip=tip/100*mealprice;
            mealprice=mealprice-500;
        }
        else if(mealprice>10000){
            tip=(tip/100*mealprice)-((float) 20/100*(tip/100*mealprice));
            mealprice=mealprice-700;
        }
        int total=Math.round(mealprice+tip+tax);
        System.out.println(mealprice);
        System.out.println(tip);
        System.out.println(tax);
        System.out.println("The total cost is:" + total);
    }
}
