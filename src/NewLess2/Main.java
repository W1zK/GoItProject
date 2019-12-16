package NewLess2;

public class Main {
    public static void main(String[] args) {
        NonBlockStack<String> str = new NonBlockStack<>();


        new Thread(new Runnable() {
            @Override
            public void run() {
                str.Push("second");
                System.out.println(str.Pop());
            }
        }).start();
        /*new Thread(() -> {
            str.Push("third");
            str.Pop();
        }).start();
        new Thread(() -> {
            str.Push("forth");
            str.Pop();
        }).start();
        new Thread(() -> {
            str.Push("fifth");
            str.Pop();

        }).start();*/

        //System.out.println(str.Pop());
    }
}
