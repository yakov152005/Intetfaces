package Practice1;
public class Cheetah extends LivingThing implements Runable,Cloneable{
    private double height;
    private int animalsSheAte;

    public Cheetah(String name,int height,int animalsSheAte){
        super(name);
        this.height = height;
        this.animalsSheAte = animalsSheAte;
    }


    @Override
    public void run() {
        System.out.println("The " + getClass().getSimpleName() + " " + this.name + " wanted to quickly eat animals!!!");
    }

    @Override
    public String toString() {
        return  super.toString()+
                ", height: " + height +
                ", animalsSheAte: " + animalsSheAte;
    }

    public Cheetah clone()throws CloneNotSupportedException{
        return (Cheetah) super.clone();
    }
}
