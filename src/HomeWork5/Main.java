package HomeWork5;

public class Main {
    public static void main(String[] args) {

        Point point1 = new Point(5.2,6.7,0);
        Point point2 = new Point(4,5.5,0);
        Point point3 = new Point(3,8,0);
        Point point4 = new Point(5,6.2,0);
        Point point5 = new Point(4.3,1.5,0);
        Point point6 = new Point(3.5,2.9,0);
        Point point7 = new Point(0.5,9.1,0);



        Vector vector2 =new Vector(point1.getX(),point2.getX(),point1.getY(),point2.getY(),point1.getZ(),point2.getZ());


        System.out.println(vector2.getVek1());

    }



}
