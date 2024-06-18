package Program3;

public class Student extends Person{
    private String collage;

    public Student(String name, int id, String collage) {
        super(name, id);
        this.collage = collage;
    }
    public Student(Student other){
        super(other);
        this.collage = other.collage;
    }

    @Override
    public String toString() {
        return super.toString() + " Student{" +
                "collage='" + collage + '\'' +
                '}';
    }

}
