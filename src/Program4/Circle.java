package Program4;
public class Circle implements Cloneable{
    private int radius;
    private Point center;

    public Circle(int radius,Point center)throws CloneNotSupportedException{
        this.radius = radius;
        setCenter(center);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
    public Circle clone()throws CloneNotSupportedException{
        Circle temp = (Circle) super.clone();
        temp.center = center.clone();
        return temp;
    }
    public Point getCenter(){
        return this.center;
    }

    public void setCenter(Point center)throws CloneNotSupportedException {
        this.center = center.clone();
    }
}
