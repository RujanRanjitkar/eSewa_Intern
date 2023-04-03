package Day11;

class Display1{
    public void wish(String name){
        synchronized (Display1.class){
            for(int i=0;i<10;i++){
                System.out.println("Good Morning");
                try{
                    Thread.sleep(2000);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println(name);
            }
        }

    }
}
class Thread8 extends Thread{
    Display1 d;
    String name;

    public Thread8(Display1 d, String name) {
        this.d = d;
        this.name = name;
    }
    public  void run(){
        d.wish(name);
    }
}
public class SynchronizedBlockDemo {
    public static void main(String[] args) {
        Display1 d1=new Display1();
        Display1 d2=new Display1();
        Thread8 t1=new Thread8(d1, "Rujan");
        Thread8 t2=new Thread8(d2, "Ram");
        t1.start();
        t2.start();
    }
}
