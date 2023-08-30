package Practice;

public class T_thread extends Thread{

    public void run(){
        System.out.print("Hello Thread");
    }

    public static void main(String[] args) {
        T_thread th= new T_thread();
        th.start();
    }
}
