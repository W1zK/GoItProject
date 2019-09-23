import HomeWork4.*;

import java.util.Scanner;

public class Seventh_2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String yes = "y";
        String no = "n";
        String a = yes;
        if (a.equals(yes)){
            System.out.println("1 - считает в консоли до числа Х" +
                    "\n2 - drawRectangle рисует прямоугольник" +
                    "\n3 - перегрузка задания №2" +
                    "\n4 - функция getMax(int,float)" +
                    "\n5 - рекурсия, задание №1" +
                    "\n6 - рекурсия, задание №2");
            System.out.print("Выберите задание из списка:");
            int input = scanner.nextInt();

            switch (input) {
                case 1:
                    First.main();
                    a=no;

                    break;
                case 2:
                    Second.main();

                    break;
                case 3:
                    Third.main();

                    break;
                case 4:
                    Fourth.main();

                    break;
                case 5:
                    Fifth.main();
                    break;
                case 6:
                    Sixth.main();
                    break;
                default:
                    System.out.println("Вы ввели не верный номер задания, повторите ввод!");


            }
            a=no;
        }else if (a.equals(no)){
            System.out.println("введите номер");
            a = scanner.nextLine();
            return;
        }

    }

}
