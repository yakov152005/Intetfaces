package Program3;
public abstract class Person implements Cloneable {
    private String name;
    private int id;

    public Person(String name,int id){
        this.name = name;
        this.id = id;
    }
    protected Person(Person other){
       this(other.name,other.id);
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String toString(){
        return "Name: " + this.name +" Id: " + this.id;
    }

    public Person clone()throws CloneNotSupportedException{
        return (Person) super.clone();
    }
}
