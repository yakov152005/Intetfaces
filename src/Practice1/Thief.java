package Practice1;
public class Thief extends LivingThing implements Runable, Cloneable{
    private double height;
    private int timesArrested;

    public Thief(String name, int height, int timesArrested){
        super(name);
        this.height = height;
        this.timesArrested = timesArrested;
    }

    public void steal(){
        System.out.println("The " + getClass().getSimpleName() + " " + name + " Steal this money $$$");
    }
    @Override
    public void run() {
        System.out.println("The " + getClass().getSimpleName() + " " + name + " Run away!!!");
    }



    public double getHeight() {
        return height;
    }

    public int getTimesArrested() {
        return timesArrested;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", height: " + height +
                ", timesArrested: " + timesArrested ;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Thief)){
            return false;
        }
        Thief temp = (Thief)o;
        return name.equals(temp.name);
    }
    public Thief clone()throws CloneNotSupportedException{
        return (Thief) super.clone();
    }

}
