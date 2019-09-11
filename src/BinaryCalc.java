import java.util.Scanner;

public class BinaryCalc {
    private static int a, n;

    public static String binaryCode(int value){
        String x = "";
        while(value > 0)
        {
            a = value % 2;
            x = a + "" + x;
            value = value / 2;
        }
        return x ;



    }
    public static String octalCode(int value){
        String x = "";

        while(value > 0)
        {
            a = value % 8;
            x = a + "" + x;
            value = value / 8;
        }
        return x;



    }
    public static String hexalCode(int value){
        String x = "";
        char[] pool = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while (value > 0) {
        a = value % 16;
        x = pool[a] + "" + x;
        value = value / 16;
        }
        return x;
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("EnterNumber");
        n = scanner.nextInt();


        System.out.println(binaryCode(n) + "\n" +
                            octalCode(n) + "\n" +
                            hexalCode(n));

    }

}
