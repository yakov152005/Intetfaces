package Program4;

public class Point implements Cloneable{
    private int x,y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public Point clone() throws CloneNotSupportedException{
        return (Point) super.clone();
    }
    public void move(int newX, int newY){
        this.x = newX;
        this.y = newY;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("(").append(this.x).append(",").append(this.y).append(")");
        return sb.toString();
    }

}
