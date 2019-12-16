package NewLessons;

public class Main {
    public static void main(String[] args) {
        new Thread(() -> {
            print();
            checker();
        }).start();
        new Thread(() -> {
            print();
            checker();
        }).start();
        checker();

    }

    static void print (){
       System.out.println(Thread.currentThread().getName() +"\n"+ Thread.currentThread().getThreadGroup());
    }
    static void checker(){
        if (Thread.currentThread().getName().equals("main")){
            System.out.println("true");
        }
        else System.out.println("false");
    }



}
