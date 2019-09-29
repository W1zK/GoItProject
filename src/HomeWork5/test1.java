//package HomeWork5;
//
//import HomeWork4.*;
//
//import java.util.Scanner;
//
//public class test1 {
//    public void setConvexPolygon(derivative[] polygon) {
//        int numberOfPositive = 0;
//        int numberOfNegative = 0;
//        for (int i = 0; i < polygon.length; i++) {
//            if (polygon[i].isPositive() == true) {
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
//
//}
//
//
