package Day2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class newpro {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Type a value");

        try {
            Long num = sc.nextLong();

            if (num <= Byte.MAX_VALUE && num >= Byte.MIN_VALUE) {
                System.out.println(num + " can be fitted in: byte, short, int and long where byte is most preferable");
            } else if (num <= Short.MAX_VALUE && num >= Short.MIN_VALUE) {
                System.out.println(num + " can be fitted in: short, int and long where short is most preferable");
            } else if (num <= Integer.MAX_VALUE) {
                System.out.println(num + " can be fitted in: int and long where is more preferable");

            } else {
                System.out.println(num + " can be fitted in: long");
            }

        }
        catch (InputMismatchException e) {
            System.out.println("cannot be fitted anywhere");
        }


    }

}