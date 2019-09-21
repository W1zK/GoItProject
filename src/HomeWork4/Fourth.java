package HomeWork4;

import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        getMax(3,9);
        getMax(3.5f,9.2f);
    }
    static void getMax(int x,int y){

        int max = (x>y)?x:y;
        System.out.println(max);
    }
    static void getMax(float x,float y){

        float max = (x>y)?x:y;
        System.out.println(max);
    }
}
