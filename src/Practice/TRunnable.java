package Practice;

public class TRunnable implements Runnable{

    @Override
    public void run() {
        System.out.print("Hello Runable ");
    }

    public static void main(String[] args) {
        TRunnable tr = new TRunnable();
        Thread th = new Thread(tr);
        th.start();
    }
}
