import java.util.Scanner;

public class MainCalc {
    static char[] pool = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    static int userNumber, a, count = 0;
    static public String decimalConvert (int value,int system){
        String x = "";
        while(value > 0)
        {
            a = value % system;
            x = pool[a] + "" + x;
            value = value / system;
        }
        return x ;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number:");
        userNumber = scanner.nextInt();

        System.out.println(decimalConvert(userNumber,2) + "\n"
                        + decimalConvert(userNumber,8) + "\n"
                        + decimalConvert(userNumber,16));
    }
}