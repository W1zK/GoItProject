package HomeWork5;

class Utils {

    private Point[] point = new Point[7];
    private Point pointArtil = new Point(6,3);
    private Point[] sourcePoint = new Point[point.length];
    private Point[] allPoint = new Point[point.length*2];
    private Vector[] vector = new Vector[point.length];
    private double[] derivative = new double[vector.length];
    private double[] distance = new double[allPoint.length];
    private boolean check = false;


    void run(){
        point[0] = new Point(-1.5, 1.5);
        point[1] = new Point(-4, 2);
        point[2] = new Point(-2.5, -1.5);
        point[3] = new Point(0.5, -2.5);
        point[4] = new Point(1.5, -0.5);
        point[5] = new Point(1, 1);
        point[6] = new Point(-0.5, 4);
        cVector(point);
        checker();
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

    private void sourcePoints(Point[] source){

        for (int i = 0; i <point.length ; i++) {
            if (i<source.length-1){
                sourcePoint[i]=new Point((source[i].getX() + source[i+1].getX())/2,(source[i].getY() + source[i+1].getY())/2);
            } else sourcePoint[i]=new Point((source[i].getX() + source[0].getX())/2,(source[i].getY() + source[0].getY())/2);

        }

        

    }

    private void simbios(Point[] mass1,Point[] mass2){
        int j = 0;
        for (int i = 0; i <allPoint.length ; i++) {
            if (i<=point.length-1){
                allPoint[i]=mass1[i];
            }else allPoint[i] = mass2[j++];

        }

    }

    private void length(Point dot,Point[] spray){
        for (int i = 0; i <distance.length ; i++) {
            distance[i]= Math.sqrt(Math.pow(dot.getX()-spray[i].getX(),2)+ Math.pow(dot.getY()-spray[i].getY(),2));

        }

    }

    private void distantPoint(){
        double average = 0;
        if (distance.length > 0)
        {
            double sum = 0;
            for (int j = 0; j < distance.length; j++) {
                sum += distance[j];
            }
            average = sum / distance.length;
        }
    }

    private void show(){
        sourcePoints(point);
        simbios(point,sourcePoint);
        length(pointArtil,allPoint);

        for (int i = 0; i <allPoint.length ; i++) {
            System.out.println(distance[i]);

        }

    }
}
