package HomeWork5;

public class Main {

    public static void main(String[] args) {


        double derivative1;
        double derivative2;
        double derivative3;
        double derivative4;
        double derivative5;
        double derivative6;
        double derivative7;


        Point point1 = new Point(-2,3);
        Point point2 = new Point(-3,1);
        Point point3 = new Point(-2,-1);
        Point point4 = new Point(-0.5,-1);
        Point point5 = new Point(1,-1);
        Point point6 = new Point(1,1);
        Point point7 = new Point(-0.5,0.5);



        Vector vector1 =new Vector(point1.getX(),point2.getX(),point1.getY(),point2.getY());
        Vector vector2 =new Vector(point2.getX(),point3.getX(),point2.getY(),point3.getY());
        Vector vector3 =new Vector(point3.getX(),point4.getX(),point3.getY(),point4.getY());
        Vector vector4 =new Vector(point4.getX(),point5.getX(),point4.getY(),point5.getY());
        Vector vector5 =new Vector(point5.getX(),point6.getX(),point5.getY(),point6.getY());
        Vector vector6 =new Vector(point6.getX(),point7.getX(),point6.getY(),point7.getY());
        Vector vector7 =new Vector(point7.getX(),point1.getX(),point7.getY(),point1.getY());



        derivative1 = vector1.getA()*vector2.getB()-vector1.getB()*vector2.getA();
        derivative2 = vector2.getA()*vector3.getB()-vector2.getB()*vector3.getA();
        derivative3 = vector3.getA()*vector4.getB()-vector3.getB()*vector4.getA();
        derivative4 = vector4.getA()*vector5.getB()-vector4.getB()*vector5.getA();
        derivative5 = vector5.getA()*vector6.getB()-vector5.getB()*vector6.getA();
        derivative6 = vector6.getA()*vector7.getB()-vector6.getB()*vector7.getA();
        derivative7 = vector7.getA()*vector1.getB()-vector7.getB()*vector1.getA();





        System.out.println(derivative1+" "+derivative2+" "+derivative3+" "+derivative4+" "+derivative5+" "+derivative6+" "+derivative7);

    }



}
