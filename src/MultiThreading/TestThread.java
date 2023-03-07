package MultiThreading;
import java.util.*;

public class TestThread extends Thread{
    public void run(){
        System.out.println("Thread Run");
    }
    public static void main(String[] args) {
        TestThread th = new TestThread();
        th.start();
    }
}
