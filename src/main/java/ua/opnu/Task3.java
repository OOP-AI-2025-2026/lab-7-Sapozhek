package ua.opnu;

import java.util.Arrays;
import java.util.function.Predicate;

public class Task3 {

    public static int[] filter(int[] input,
                               Predicate<Integer> p1,
                               Predicate<Integer> p2) {
        int[] tmp = new int[input.length];
        int k = 0;
        for (int value : input) {
            if (p1.test(value) && p2.test(value)) {
                tmp[k++] = value;
            }
        }
        return Arrays.copyOf(tmp, k);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Predicate<Integer> even = n -> n % 2 == 0;
        Predicate<Integer> greaterThan5 = n -> n > 5;

        int[] result = filter(arr, even, greaterThan5);
        System.out.println(Arrays.toString(result)); // [6, 8, 10]
    }
}

