package Day2;

import java.util.Scanner;

public class DataTypeDemo {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter num number:");
            long num = sc.nextLong();
            if (num <= Byte.MAX_VALUE) {
                System.out.println(num + "can be fitted in: byte, short, int and long and byte is preferred");
            } else if (num <= Short.MAX_VALUE) {
                System.out.println(num + "can be fitted in: short, int and long and short is preferred");
            }
            else if (num <= Integer.MAX_VALUE) {
                System.out.println(num + "can be fitted in: int and long and int is preferred");
            }else {
                System.out.println(num + "can be fitted in: long and preferred");
            }
        } catch (Exception ex) {
            System.out.println("can't be fitted anywhere");
        }
    }
}
