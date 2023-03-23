package Day5;

public class InstanceMethod {
    //non-static method defined in the class
    //Before calling or invoking the instance method, it is necessary to create an object of its class
    // Two types: Accessor Method(getter) and Mutator Method (setter)
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        InstanceMethod obj = new InstanceMethod();
        System.out.println(obj.add(5, 3));
    }
}
