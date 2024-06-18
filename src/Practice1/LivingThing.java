package Practice1;

public abstract class LivingThing {
    protected String name;

    public LivingThing(String name) {
        this.name = name;
    }

    public LivingThing clone()throws CloneNotSupportedException{
        return (LivingThing) super.clone();
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " Name: " + name ;
    }
}
