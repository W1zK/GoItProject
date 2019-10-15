package HomeWork5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class Utils {
    private int k;
    private int n;
    private double average = 0; //midl distance
    private Point[] point = new Point[7]; //point arr
    private Point pointArtil = new Point(6, 3); //artilery
    private Point[] sourcePoint = new Point[point.length];
    private Point[] allPoint = new Point[point.length * 2];
    private ArrayList<Integer> fPoint = new ArrayList<Integer>(); //bigerThenMidl
    private ArrayList<Integer> cPoint = new ArrayList<Integer>();
    private Vector[] vector = new Vector[point.length];
    private double[] derivative = new double[vector.length];
    private double[] distance = new double[allPoint.length];
    private boolean check = false;
    private Line[] lineMath = new Line[allPoint.length]; // AllLineCross
    private Line[] clothLineMath;
    private Line[] trapLine;
    private ArrayList<Point> crossLineVsLine = new ArrayList<Point>();
    private ArrayList<Point> sourceValideCross = new ArrayList<Point>();


    void run() {
        point[0] = new Point(-1.5, 1.5);
        point[1] = new Point(-4, 2);
        point[2] = new Point(-2.5, -1.5);
        point[3] = new Point(0.5, -2.5);
        point[4] = new Point(1.5, -0.5);
        point[5] = new Point(1, 1);
        point[6] = new Point(-0.5, 4);
        //cVector(point);
        //checker();
        show();

    }

    private void checker() {
        for (int i = 0; i < derivative.length; i++) {
            if (derivative[i] > 0) {
                check = true;
            }
        }
        if (check) {
            System.out.println("!!!Фигура Опуклая!!!");
            for (int i = 0; i < derivative.length; i++) {
                System.out.println(derivative[i]);

            }
            show();
        }
    }

    private void delPoint1(double[] dot) {

        for (int i = 0; i < dot.length; i++) {
            int k = 0;
            while (dot[i] < 0) {
                if (i == dot.length - 1) {
                    point[k + 1] = point[k];
                    cVector(point);
                } else if (i != dot.length - 1) {
                    point[i + 1] = point[i];
                    cVector(point);
                }
            }
        }
    }

    private void cVector(Point[] pnt) {

        for (int i = 0; i < vector.length; i++) {
            if (i < vector.length - 1) {
                vector[i] = new Vector(pnt[i].getX(), pnt[i + 1].getX(), pnt[i].getY(), pnt[i + 1].getY());
            } else vector[i] = new Vector(pnt[i].getX(), pnt[0].getX(), pnt[i].getY(), pnt[0].getY());
        }
        cDerivative(vector);
    }

    private void cDerivative(Vector[] vek) {
        for (int i = 0; i < derivative.length; i++) {
            if (i < vek.length - 1) {
                derivative[i] = (vek[i].getA() * vek[i + 1].getB()) - (vek[i].getB() * vek[i + 1].getA());
            } else derivative[i] = vek[i].getA() * vek[0].getB() - vek[i].getB() * vek[0].getA();
        }
        delPoint1(derivative);
    }

    ////////////////////////////////////////////////////////

    private void sourcePoints(Point[] source) {

        for (int i = 0; i < point.length; i++) {
            if (i < source.length - 1) {
                sourcePoint[i] = new Point((source[i].getX() + source[i + 1].getX()) / 2, (source[i].getY() + source[i + 1].getY()) / 2);
            } else
                sourcePoint[i] = new Point((source[i].getX() + source[0].getX()) / 2, (source[i].getY() + source[0].getY()) / 2);

        }


    }

    private void simbios(Point[] mass1, Point[] mass2) {
        int j = 0;
        int g = 1;
        int f;
        for (int i = 0; i < allPoint.length; i++) {
            f = i % 2;
            if (i == 0) {
                allPoint[i] = mass1[i];

            } else if (f != 0) {
                allPoint[i] = mass2[j++];

            } else allPoint[i] = mass1[g++];
        }
    }

    private void length(Point dot, Point[] spray) {
        for (int i = 0; i < distance.length; i++) {
            distance[i] = Math.sqrt(Math.pow(dot.getX() - spray[i].getX(), 2) + Math.pow(dot.getY() - spray[i].getY(), 2));

        }

    }

    private void midlDistance() {

        double sum = 0;

        if (distance.length > 0) {
            for (int j = 0; j < distance.length; j++) {
                sum += distance[j];
            }
            average = sum / distance.length;
        }

    }

    private void farPoint() {
        k = 0;
        n = 0;
        for (int i = 0; i < distance.length; i++) {
            if (average < distance[i]) {
                fPoint.add(i);
                k++;
            } else {
                cPoint.add(i);
                n++;
            }
        }
        trapLine = new Line[k];
        clothLineMath = new Line[n - 1];
    }

    private void crossLine() {
        for (int i = 0; i < lineMath.length; i++) {
            if (i < lineMath.length - 1) {
                lineMath[i] = new Line(allPoint[i].getX(), allPoint[i + 1].getX(), allPoint[i].getY(), allPoint[i + 1].getY());
            } else
                lineMath[i] = new Line(allPoint[i].getX(), allPoint[0].getX(), allPoint[i].getY(), allPoint[0].getY());

        }
    }

    private void neareLineCross() {
        for (int i = 0; i < clothLineMath.length; i++) {
            clothLineMath[i] = new Line(allPoint[cPoint.get(i)].getX(), allPoint[cPoint.get(i + 1)].getX(), allPoint[cPoint.get(i)].getY(), allPoint[cPoint.get(i + 1)].getY());
//            if (i!=clothLineMath.length-1) {
//                clothLineMath[i] = new Line(allPoint[cPoint.get(i)].getX(), allPoint[cPoint.get(i + 1)].getX(), allPoint[cPoint.get(i)].getY(), allPoint[cPoint.get(i + 1)].getY());
//            }//else clothLineMath[i] = new Line(allPoint[cPoint.get(i)].getX(), allPoint[cPoint.get(i)].getX(), allPoint[cPoint.get(i)].getY(), allPoint[cPoint.get(i)].getY());

        }

    }

    private void farLine() {
        for (int i = 0; i < trapLine.length; i++) {
            trapLine[i] = new Line(pointArtil.getX(), allPoint[fPoint.get(i)].getX(), pointArtil.getY(), allPoint[fPoint.get(i)].getY());

        }


    }

    private void lineVsLine() {
        double x;
        double y1;
        double y2;
        for (int i = 0; i < trapLine.length; i++) {//Пересечение главной линии с ближними линиями
            for (int j = 0; j < clothLineMath.length; j++) {
                x = (trapLine[i].getA() * clothLineMath[j].getC() - clothLineMath[j].getA() * trapLine[i].getC()) / (clothLineMath[j].getA() * trapLine[i].getB() - trapLine[i].getA() * clothLineMath[j].getB());
                y1 = (trapLine[i].getB() * x + trapLine[i].getC()) / trapLine[i].getA();
                y2 = (clothLineMath[j].getB() * x + clothLineMath[j].getC()) / clothLineMath[j].getA();
                x = Math.round(x * 1000);
                y1 = Math.round(y1 * 1000);
                y2 = Math.round(y2 * 1000);
                crossLineVsLine.add(new Point(x / 1000, y2 / 1000));

//                System.out.println("++++++++++++++++"+clothLineMath[j].getA()+"++++++++++++++");
//                System.out.println("\nx="+x+"\ny1="+y1+"\ny2="+y2+"\nj="+j+"\nLines="+trapLine[i].getA()+"\nLisen="+clothLineMath[j].getA());
//                System.out.println("++++++++++++++++++++++++++++++");

            }

        }
    }

    private void ppp() {
        double u1;
        double u2;
        int peres = 0;
        int nePeres = 0;
        for (int i = 0; i < cPoint.size() - 1; i++) {

            for (int j = 0; j < crossLineVsLine.size(); j++) {
                u1 = (Math.round((crossLineVsLine.get(j).getX() - allPoint[cPoint.get(i)].getX()) / (allPoint[cPoint.get(i + 1)].getX() - allPoint[cPoint.get(i)].getX()) * 1000)) / 1000;
                u2 = (Math.round((crossLineVsLine.get(j).getY() - allPoint[cPoint.get(i)].getY()) / (allPoint[cPoint.get(i + 1)].getY() - allPoint[cPoint.get(i)].getY()) * 1000)) / 1000;

                if (crossLineVsLine.get(j).getX() > allPoint[cPoint.get(i)].getX()
                        && crossLineVsLine.get(j).getX() < allPoint[cPoint.get(i + 1)].getX()
                        || crossLineVsLine.get(j).getX() > allPoint[cPoint.get(i + 1)].getX()
                        && crossLineVsLine.get(j).getX() < allPoint[cPoint.get(i)].getX()) {
                    if (crossLineVsLine.get(j).getY() > allPoint[cPoint.get(i)].getY()
                            && crossLineVsLine.get(j).getY() < allPoint[cPoint.get(i + 1)].getY()
                            || crossLineVsLine.get(j).getY() > allPoint[cPoint.get(i + 1)].getY()
                            && crossLineVsLine.get(j).getY() < allPoint[cPoint.get(i)].getY()) {
                        if (u1 == u2) {
                            sourceValideCross.add(new Point(crossLineVsLine.get(j).getX(),crossLineVsLine.get(j).getY()));
                            System.out.print("\ni=" + i + "\nj=" + j + "\nUAREGOG");
                            System.out.println("========" + crossLineVsLine.get(j).getX() + "==" + crossLineVsLine.get(j).getY() + "========");
                            peres++;
                        } else nePeres++;
                    }
                }

            }
        }
        System.out.println("\n" + peres);
        System.out.println(nePeres);

    }
    private void creatValidePoint(){
        for (int i = 0; i <sourceValideCross.size() ; i++) {
            for (int j = 1; j <sourceValideCross.size() ; j++) {

                    if (sourceValideCross.get(i).getX() == sourceValideCross.get(j).getX() && sourceValideCross.get(i).getY() == sourceValideCross.get(j).getY()) {
                        sourceValideCross.remove(i);
                        //valideCross.add(new Point(sourceValideCross.get(i).getX(), sourceValideCross.get(i).getY()));

                    }

            }










        }

    }


    private void pointOnSegment() {
        double z;
        double v;
        int peres = 0;
        int nePeres = 0;


        for (int i = 0; i < cPoint.size(); i++) {

            for (int j = 0; j < crossLineVsLine.size(); j++) {
                if (i == 0) {
                    z = (crossLineVsLine.get(j).getX() - allPoint[cPoint.get(i)].getX()) / (allPoint[cPoint.get(i + 1)].getX() - allPoint[cPoint.get(i)].getX());
                    v = (crossLineVsLine.get(j).getY() - allPoint[cPoint.get(i)].getY()) / (allPoint[cPoint.get(i + 1)].getY() - allPoint[cPoint.get(i)].getY());

                } else {
                    z = (crossLineVsLine.get(j).getX() - allPoint[cPoint.get(i - 1)].getX()) / (allPoint[cPoint.get(i)].getX() - allPoint[cPoint.get(i - 1)].getX());
                    v = (crossLineVsLine.get(j).getY() - allPoint[cPoint.get(i - 1)].getY()) / (allPoint[cPoint.get(i)].getY() - allPoint[cPoint.get(i - 1)].getY());
                }


                if (z == v) {
                    System.out.print("\ni=" + i + "\nj=" + j + "\nUAREGOG");
                    System.out.println("========" + crossLineVsLine.get(j).getX() + "==" + crossLineVsLine.get(j).getY() + "========");
                    peres++;
                } else {
                    //System.out.print("\ni=" + i + "\nj=" + j + "\nWORKMORE");
                    nePeres++;
                }
            }

        }
        System.out.println("\n" + peres);
        System.out.println(nePeres);
    }


    private void show() {
        cVector(point);
        sourcePoints(point);
        simbios(point, sourcePoint);
        length(pointArtil, allPoint);
        midlDistance();
        crossLine();
        farPoint();
        farLine();
        neareLineCross();
        lineVsLine();
        ppp();
        creatValidePoint();
        for (int i = 0; i <sourceValideCross.size() ; i++) {
            System.out.println("***********"+sourceValideCross.get(i).getX()+"--"+sourceValideCross.get(i).getY()+"***********");

        }

        //pointOnSegment();

        System.out.println(crossLineVsLine.get(30).getX() + "==" + crossLineVsLine.get(30).getY());
        System.out.println(crossLineVsLine.get(36).getX() + "==" + crossLineVsLine.get(36).getY());
        System.out.println("++++++++" + (allPoint[7].getX() + "-" + (allPoint[7].getY() + "=======")));
        System.out.println("++++++++" + (allPoint[8].getX() + "-" + (allPoint[8].getY() + "=======")));
        System.out.println("++++++++" + (allPoint[9].getX() + "-" + (allPoint[9].getY() + "=======")));
        System.out.println("++++++++" + (allPoint[10].getX() + "-" + (allPoint[10].getY() + "=======")));
        System.out.println("++++++++" + (allPoint[11].getX() + "-" + (allPoint[11].getY() + "=======")));
        System.out.println("++++++++" + (allPoint[12].getX() + "-" + (allPoint[12].getY() + "=======")));
        System.out.println("++++++++" + (allPoint[13].getX() + "-" + (allPoint[13].getY() + "=======")));
        System.out.println("*****************************************************");
        for (int i = 0; i < cPoint.size(); i++) {
            System.out.println("++++++++" + (allPoint[cPoint.get(i)].getX() + "-" + (allPoint[cPoint.get(i)].getY() + "=======")));

        }


//        System.out.println(trapLine.length);
//        System.out.println(clothLineMath.length);
//        System.out.println("qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq");
//
//
//        for (int i = 0; i <crossLineVsLine.size() ; i++) {
//            System.out.println(crossLineVsLine.get(i).getX()+"=="+crossLineVsLine.get(i).getY());
//
//        }
//        System.out.println("qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq");
//
//        for (int p = 0; p <clothLineMath.length ; p++) {
//            System.out.println(p+"---"+clothLineMath[p].getA()+"=="+clothLineMath[p].getB()+"=="+clothLineMath[p].getC());
//
//        }
//
//        for (int i = 0; i <fPoint.size() ; i++) {
//            System.out.println(i+"=="+allPoint[fPoint.get(i)].getX()+" "+allPoint[fPoint.get(i)].getY());
//
//        }
//        System.out.println("*************************************************");
//        for (int i = 0; i <cPoint.size() ; i++) {
//            System.out.println(i+"=="+allPoint[cPoint.get(i)].getX()+" "+allPoint[cPoint.get(i)].getY());
//
//        }


//        for (int i = 0; i <allPoint.length ; i++) {
//            System.out.println(allPoint[i].getX()+" "+allPoint[i].getY());
//
//        }
//        System.out.println("-------------------");
//        for (int i = 0; i <point.length ; i++) {
//            System.out.println(point[i].getX()+" "+point[i].getY());
//
//        }
//
//
//
//
//
//        for (int i = 0; i <lineMath.length ; i++) {
//            System.out.println(lineMath[i].getA()+"=="+lineMath[i].getB()+"=="+lineMath[i].getC());
//
//        }

    }
}
