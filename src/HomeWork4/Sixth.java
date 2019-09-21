package HomeWork4;

import java.util.Scanner;

public class Sixth {
    private static int y;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение X:");
        int x = scanner.nextInt();
        System.out.print("Введите значение Y:");
        y = scanner.nextInt();

        draw(x, y);
    }

    static void draw(int height, int width) {
        if (0 < height && width == 0) {
            width = y;
            System.out.println();
            draw(height - 1, width);

        } else if (height == 0) {

        } else {
            System.out.print("+");
            draw(height, width - 1);
        }
    }
}

