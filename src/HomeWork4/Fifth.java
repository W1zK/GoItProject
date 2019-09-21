package HomeWork4;

import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int x = scanner.nextInt();
        recurs(x);
    }
    static void recurs(int input){
        if (input != 0) {
            recurs(input - 1);
        }
        System.out.println(input);
        }
}
