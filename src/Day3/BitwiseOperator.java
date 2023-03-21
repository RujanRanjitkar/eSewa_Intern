package Day3;

public class BitwiseOperator {
    public static void main(String[] args) {
        //used to perform operations on the individual bits of a binary number or a bit pattern
        //work on integer types (byte, short, int, long)
        int x =10;  // 00001010 in binary
        int y = 5;   // 00000101 in binary

        System.out.println("x & y = " + (x & y));  // Bitwise AND: 00000000
        System.out.println("x | y = " + (x | y));  // Bitwise OR: 00001111
        System.out.println("x ^ y = " + (x ^ y));  // Bitwise XOR: 00001111
        System.out.println("~x = " + (~x));        // Bitwise NOT: 11110101 2's complement (~x=-x-1)
        System.out.println("x << 2 = " + (x << 2)); // Left shift: 00101000 (10*2^2=10*4=40)
        System.out.println("y >> 1 = " + (y >> 1)); // Right shift: 00000010 (5/2^1=5/2=2)

        /*the >> operator is used for signed values and preserves the sign of the original value after shifting,
         while the >>> operator is used for unsigned values and treats the value as unsigned after shifting.*/
    }
}
