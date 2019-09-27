package HomeWork5;

class Vector {
    private double vek1;


    public Vector(double x, double x1,double y,double y1,double z,double z1) {
        this.vek1 = (y*z1-y1*z)+(x*z1)+(x*y1-x1*y);
//        this.b = y1 - y;
//        this.c = z1 - z;
    }

    public double getVek1() {
        return vek1;
    }
}
