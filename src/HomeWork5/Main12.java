package HomeWork5;


public class Main12 {
    static private Point[] point = new Point[7];
    static private Vector[] vector = new Vector[point.length];
    static private double[] derivative = new double[vector.length];

    static private void delPoint1(double[] dot) {

        for (int i = 0; i < dot.length; i++) {
            int k = 1;
            if (dot[i] >= 0) {
                System.out.println(dot[i] + "фигура опуклая");
            } else if (dot[i] < 0 || i == dot.length - 1) {
                point[k+1].setX(point[k].getX());


            } else if (dot[i] < 0 || i != dot.length - 1) {
                point[i+1] = point[i];
            }

        }
        for (int i = 0; i < derivative.length; i++) {
            System.out.println(point[i]+"+"+point[i].getX()+"  "+point[i].getY());

        }


    }

//    static private void delPoint2(double[] dot) {
//
//        for (int i = 0; i < dot.length; i++) {
//            int k = 0;
//            if (dot[i] < 0 || i == dot.length - 1) {
//                point[k] = point[k + 1];
//            } else if (dot[i] < 0 || i != dot.length - 1) {
//                point[i] = point[i + 1];
//
//            } else break;
//        }
//        for (int i = 0; i < derivative.length; i++) {
//            System.out.println(derivative[i]);
//
//        }
//
//    }


    static private void cVector() {
        for (int i = 0; i < vector.length; i++) {
            if (i < vector.length - 1) {
                vector[i] = new Vector(point[i].getX(), point[i + 1].getX(), point[i].getY(), point[i + 1].getY());
            } else vector[i] = new Vector(point[i].getX(), point[0].getX(), point[i].getY(), point[0].getY());
        }

    }


    static private void cDerivative() {
        for (int i = 0; i < derivative.length; i++) {
            if (i < vector.length - 1) {
                derivative[i] = vector[i].getA() * vector[i + 1].getB() - vector[i].getB() * vector[i + 1].getA();
            } else derivative[i] = vector[i].getA() * vector[0].getB() - vector[i].getB() * vector[0].getA();
        }
        for (int i = 0; i < derivative.length; i++) {
            System.out.println(derivative[i]);

        }

        delPoint1(derivative);
    }

    public static void main(String[] args) {


        point[0] = new Point(-1.5, 1.5);
        point[1] = new Point(-4, 2);
        point[2] = new Point(-2.5, -1.5);
        point[3] = new Point(0.5, -2.5);
        point[4] = new Point(1.5, -0.5);
        point[5] = new Point(1, 1);
        point[6] = new Point(-0.5, 4);


        cVector();
        cDerivative();

        for (int i = 0; i < derivative.length; i++) {
            System.out.println(derivative[i]);

        }


    }
}

