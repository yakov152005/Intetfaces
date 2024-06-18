package Program3;

import java.util.Arrays;
import java.util.Comparator;

public class BubbleSort {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person[] people = new Person[3];
        people[0] = new Student("momo",333,"AAC");
        people[1] = new Student("yoyo",111,"AAC");
        people[2] = new Student("gogo", 222,"AAC");

        System.out.println("Persons are: " + Arrays.toString(people));
        bubbleSort(people,new ComparePersonsById());
        System.out.println("Persons sortes by id: " + Arrays.toString(people));
        System.out.println();
        System.out.println("Persons are: " + Arrays.toString(people));
        bubbleSort(people,new ComparePersonByName());
        System.out.println("Persons sortes by name: " + Arrays.toString(people));

        System.out.println();
        System.out.println();
        System.out.println();

        Person[] people1 = new Person[3];
        people1[0] = new Student("lolo",888,"Sapir");
        people1[1] = new Student("dodo",666,"AAC");
        people1[2] = new Student("aoao", 555,"Sami");
        Comparator<Person> c = new ComparePersonsById();
        Arrays.sort(people1,c);
        System.out.println(Arrays.toString(people1));

        Person p1 = new Student("lolo",888,"Sami");
        System.out.println(Arrays.binarySearch(people1,p1,c));

        Person p2 = new Student("aoao",444,"Sapir");
        System.out.println(Arrays.binarySearch(people1,p2,c));

        Person p3 = new Student("koko",888,"AAC");
        System.out.println(Arrays.binarySearch(people1,p3,c));

    }
    public static <T> void bubbleSort(T[] arr, Comparator c){
        for (int i = arr.length -1 ; i > 0  ; i--) {
            for (int j = 0; j < i; j++) {
                if (c.compare(arr[j],arr[j + 1]) > 0){
                    T temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
