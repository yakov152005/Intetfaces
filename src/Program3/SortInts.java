package Program3;

import java.util.*;

public class SortInts implements Comparable<Integer> {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(3, 7, 1, 9, 2, 6));
        System.out.println("Before sort: " + numbers);
        Collections.sort(numbers);
        System.out.println("After sort: " + numbers);

        System.out.println();

        int[] numbers2 ={8,7,9,43,55,2};
        System.out.println("Before sort: " + Arrays.toString(numbers2));
        Arrays.sort(numbers2);
        System.out.println("After sort: " + Arrays.toString(numbers2));
    }

    @Override
    public int compareTo(Integer o) {
        return this.compareTo(o);
    }
}
