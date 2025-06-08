package thread;

public class t1{
    public static void main(String[] args) {
        thread1 t=new thread1();
        t.start();
    }
}
class thread1 extends Thread{
    @Override
    public void run() {
        System.out.println("Running like a thread");
    }
}
