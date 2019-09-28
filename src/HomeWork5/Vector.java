package HomeWork5;

class Vector {
    //private double vek1;
    private double a;
    private double b;


    public Vector(double x, double x1,double y,double y1) {

        this.a=x1-x;
        this.b=y1-y;

        //this.vek1 =; // (y*0-y1*0)-(x*0-x*0)+(x*y1-x1*y);

    }

//    public double getVek1() {
//        return vek1;
//    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
}
