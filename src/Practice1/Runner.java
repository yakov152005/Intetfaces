package Practice1;

import java.util.Comparator;

public class Runner extends LivingThing implements Runable,Cloneable,Breathable {
    private double height;
    private int runAvg;

    public Runner(String name,int height,int runAvg){
        super(name);
        this.height = height;
        this.runAvg = runAvg;
    }
    public String getName() {
        return super.getName();
    }

    @Override
    public void breath(){
        System.out.println("The " + getClass().getSimpleName() + " " + name + " breathe properly");
    }
    @Override
    public void run() {
        System.out.println("The " + getClass().getSimpleName() + " " + name + " Run fast to win");
    }

    @Override
    public String toString() {
        return super.toString() +
                ", height: " + height +
                ", Average speed: " + runAvg;
    }

    public Runner clone()throws CloneNotSupportedException{
        return (Runner) super.clone();
    }

}
