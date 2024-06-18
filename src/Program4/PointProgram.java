package Program4;

public class PointProgram {
    public static void main(String[] args) throws CloneNotSupportedException{
        Point p1 = new Point(4,3);
        Point p2 = p1.clone();
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        p1.move(7,8);
        System.out.println("After moving p1: ");
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);


        System.out.println();

        Point p = new Point(2,3);
        Circle c1 = new Circle(10,p);
        System.out.println("p:" + p);
        System.out.println("c1: " + c1);

        p.move(6,7);
        System.out.println("After moving p(Center) : " + p);
        System.out.println("c1: " + c1);

        Circle c2 = c1.clone();
        c1.getCenter().move(1,1);
        System.out.println("After clone: ");
        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);


    }
}
