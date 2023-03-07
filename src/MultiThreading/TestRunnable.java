package MultiThreading;

public class TestRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Runnable ");
    }

    public static void main(String[] args) {
        TestRunnable Tr= new TestRunnable();
        Thread th = new Thread(Tr);
        th.start();
    }
}
