package Day4;

public class ReverseNum {
    public static void main(String[] args) {
        int num=1234;
        int r;
        int re=0;
        while(num!=0){
            r=num%10;
            re=re*10+r;
            num=num/10;
        }
        System.out.println(re);
    }
}
