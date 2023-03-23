package Day5;

public class StaticMethod {
    //method that belongs to a class rather than an instance of a class
    static void show(){
        System.out.println("hello");
    }
    public static void main(String[] args) {
        show();
    }
}
