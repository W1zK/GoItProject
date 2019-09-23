import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int x;
        int y;
        float z;
        float w;

        Scanner scanner = new Scanner(System.in);
        String firsNum = scanner.nextLine();
        String secondNum = scanner.next();
        if (!firsNum.contains(".")&&!secondNum.contains(".")){
            x = Integer.parseInt(firsNum);
            y = Integer.parseInt(secondNum);
            getMax(x,y);
        }else {
            z = Float.parseFloat(firsNum);
            w = Float.parseFloat(secondNum);
            getMax(z,w);
        }

//        if (!secondNum.contains(".")){
//            y = Integer.parseInt(secondNum);
//        }else {
//            w = Float.parseFloat(secondNum);
//        }









    }
    static void getMax(int vel1,int vel2){

        int max = (vel1>vel2)?vel1:vel2;
        System.out.println(max);
    }
    static void getMax(float vel1,float vel2){

        float max = (vel1>vel2)?vel1:vel2;
        System.out.println(max);
    }
}
