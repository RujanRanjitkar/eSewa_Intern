package Day5;

public class UserdefinedMethod {
    // method written by the user or programmer
    // call by value
    public static int add(int a, int b){
        a--;
        return a+b;
    }
    public static void main(String[] args) {
        int a=5;
        int b=10;
        int sum=a+b;
        System.out.println(add(a,b));
        System.out.println(sum);
    }
}
