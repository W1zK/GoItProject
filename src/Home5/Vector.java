package Home5;

class Vector {
    private double aVec;
    private double bVec;
    private double x;
    private double x1;
    private double y;
    private double y1;

    public Vector(double x, double x1, double y, double y1) {

        this.x=x;
        this.x1=x1;
        this.y=y;
        this.y1=y1;
        getVector();
    }

    private void getVector(){
        this.aVec=x1-x;
        this.bVec=y1-y;
    }

    public double getaVec() {
        return aVec;
    }

    public double getbVec() {
        return bVec;
    }
}
