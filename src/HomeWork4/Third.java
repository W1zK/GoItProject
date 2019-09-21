package HomeWork4;

import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение X:");
        int x = scanner.nextInt();
        drawRectangle(x);

    }
    static void drawRectangle(int s) {
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                System.out.print("+");
            }
            System.out.println();
        }


    }
    static void drawRectangle(int a, int b) {

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("+");
            }
            System.out.println();
        }

    }
}
