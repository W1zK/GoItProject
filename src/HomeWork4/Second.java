package HomeWork4;

public class Second {
    public static void main(String[] args) {
        draw(5, 4);
        draw(3);

    }

    static void draw(int x, int y) {

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("+");
            }
            System.out.println();
        }

    }

    static void draw(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("+");
            }
            System.out.println();
        }


    }
}
