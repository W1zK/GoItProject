import java.util.Scanner;

public class CalcCase {
    static char[] pool = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    static int userNumber;
    static int a;

//    static String decimalConvert(int value, int system) {
//        int i = value;
//        switch (i){
//            //String x = "";
//            case 2:{
//                String x = "";
//                a = value % system;
//                x = pool[a] + "" + x;
//                value = value / system;
//                break;
//
//            }
//
//        }
//    }

    static void decimal(int value, int system ){
        int i = value;
        switch (i) {
            //String x = "";
            case 2: {
                String x = "";
                a = value % system;
                x = pool[a] + "" + x;
                value = value / system;
                System.out.println(x);
                break;

            }
            case 8: {
                String x = "";
                a = value % system;
                x = pool[a] + "" + x;
                value = value / system;
                System.out.println(x);
                break;

            }
            case 16: {
                String x = "";
                a = value % system;
                x = pool[a] + "" + x;
                value = value / system;

                break;


            }
            System.out.println(x);

        }

    }

//    static void show() {
//        System.out.print("Binary system:" + decimal(userNumber, 2) + "\n"
//                        + "Octal system:" + decimal(userNumber, 8) + "\n"
//                        + "Hex system:" + decimal(userNumber, 16));
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number:");
        userNumber = scanner.nextInt();
        decimal(userNumber,2);
        decimal(userNumber,8);
        decimal(userNumber,16);


//        show();
    }
}