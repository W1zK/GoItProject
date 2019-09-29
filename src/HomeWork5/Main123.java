//package HomeWork5;
//
//
//public class Main123 {
//    static private Point[] point = new Point[7];
//    static private Vector[] vector = new Vector[point.length];
//    static private double[] derivative = new double[vector.length];
//    static private int nElem = point.length - 1;
//
//
//    public void setConvexPolygon(derivative[] polygon) {
//        int numberOfPositive = 0;
//        int numberOfNegative = 0;
//        for (int i = 0; i < polygon.length; i++) {
//            if (polygon[i] ) {
//                numberOfPositive += 1;
//            } else if (polygon[i].isPositive() == false) {
//                numberOfNegative += 1;
//            }
//        }
//        if (numberOfNegative < numberOfPositive) {
//            Dot[] convexPolygon = new Dot[numberOfDots - numberOfNegative];
//            int j = 0;
//            for (int i = 0; i < polygon.length; i++) {
//                if (polygon[i].isPositive() == true) {
//                    convexPolygon[j] = polygon[i];
//
//                    System.out.println("Convex polygon: dot added: (" + convexPolygon[j].getX() + "," + convexPolygon[j].getY() + ")");
//                    j++;
//                }
//
//            }
//            this.convexPolygon = convexPolygon;
//        } else {
//
//            Dot[] convexPolygon = new Dot[numberOfDots - numberOfPositive];
//            int j = 0;
//            for (int i = 0; i < polygon.length; i++) {
//                if (polygon[i].isPositive() == false) {
//                    convexPolygon[j] = polygon[i];
//
//                    System.out.println("Convex polygon: dot added: (" + convexPolygon[j].getX() + "," + convexPolygon[j].getY() + ")");
//                    j++;
//                }
//
//            }
//            this.convexPolygon = convexPolygon;
//        }
//    }
//
//
//    static private void cVector(){
//        for (int i = 0; i < vector.length; i++) {
//            if (i < vector.length - 1) {
//                vector[i] = new Vector(point[i].getX(), point[i + 1].getX(), point[i].getY(), point[i + 1].getY());
//            } else vector[i] = new Vector(point[i].getX(), point[0].getX(), point[i].getY(), point[0].getY());
//        }
//
//    }
//
//    static private void delPoint(){
//        for (int i = 0; i < nElem; i++) {
//            if (i != derivative.length - 1||i!=0) {
//                if (derivative[i] < 0) {
//                    for (int j = i; j < derivative.length - 1; j++) {
//                        point[j] = point[j - 1];
//                        nElem--;
//
//
//                    }
//                }
//            } else if (derivative[i] < 0) {
//
//                point[i] = point[i+1];
//                nElem--;
////                for (int j = i; j <derivative.length - 1; j++) {
////                    point[0] = point[6];
////                    nElem--;
////                }
//            }
//
//        }
//
//    }
//    static private void cDerivative(){
//        for (int i = 0; i < derivative.length; i++) {
//            if (i < vector.length - 1) {
//                derivative[i] = vector[i].getA() * vector[i + 1].getB() - vector[i].getB() * vector[i + 1].getA();
//            } else derivative[i] = vector[i].getA() * vector[0].getB() - vector[i].getB() * vector[0].getA();
//        }
//    }
//
//    public static void main(String[] args) {
//
//
//        point[0] = new Point(-1.5, 1.5);
//        point[1] = new Point(-4, 2);
//        point[2] = new Point(-2.5, -1.5);
//        point[3] = new Point(0.5, -2.5);
//        point[4] = new Point(1.5, -0.5);
//        point[5] = new Point(1, 1);
//        point[6] = new Point(-0.5, 4);
//
//        //point[0] = point[6];
//        System.out.println(point[0]+"   "+point[6]);
//
//        cVector();
//        cDerivative();
//        delPoint();
//
////        cVector();
////        cDerivative();
////        delPoint();
//
////        for (int i = 0; i < vector.length; i++) {
////            if (i < vector.length - 1) {
////                vector[i] = new Vector(point[i].getX(), point[i + 1].getX(), point[i].getY(), point[i + 1].getY());
////            } else vector[i] = new Vector(point[i].getX(), point[0].getX(), point[i].getY(), point[0].getY());
////        }
////
////        for (int i = 0; i < derivative.length; i++) {
////            if (i < vector.length - 1) {
////                derivative[i] = vector[i].getA() * vector[i + 1].getB() - vector[i].getB() * vector[i + 1].getA();
////            } else derivative[i] = vector[i].getA() * vector[0].getB() - vector[i].getB() * vector[0].getA();
////        }
//
//
//
//
//        for (int i = 0; i <derivative.length ; i++) {
//            System.out.println(point[i]+"+"+i+"   "+derivative[i]);
//
//        }
//
//    }
//
//
//
//
//
////        derivative1 = vector[0].getA() * vector[1].getB() - vector[0].getB() * vector[1].getA();
////        derivative2 = vector[1].getA() * vector[2].getB() - vector[1].getB() * vector[2].getA();
////        derivative3 = vector[2].getA() * vector[3].getB() - vector[2].getB() * vector[3].getA();
////        derivative4 = vector[3].getA() * vector[4].getB() - vector[3].getB() * vector[4].getA();
////        derivative5 = vector[4].getA() * vector[5].getB() - vector[4].getB() * vector[5].getA();
////        derivative6 = vector[5].getA() * vector[6].getB() - vector[5].getB() * vector[6].getA();
////        derivative7 = vector[6].getA() * vector[0].getB() - vector[6].getB() * vector[0].getA();
////
////
////        System.out.println(derivative1 + " " + derivative2 + " " + derivative3 + " " + derivative4 + " " + derivative5 + " " + derivative6 + " " + derivative7);
//
//}
//
