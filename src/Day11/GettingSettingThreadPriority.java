package Day11;

class Thread2 extends  Thread{

}
public class GettingSettingThreadPriority {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(8);
        System.out.println(Thread.currentThread().getPriority());
        Thread2 t=new Thread2();
        System.out.println(t.getPriority());
    }
}
