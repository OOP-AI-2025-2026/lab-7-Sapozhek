package ua.opnu;

import java.util.Arrays;
import java.util.function.Function;

public class Task6 {

    public static int[] processArray(int[] input, Function<Integer, Integer> f) {
        int[] res = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            res[i] = f.apply(input[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        Function<Integer, Integer> pow2 = n -> {
            int result = 1;
            for (int i = 0; i < n; i++) {
                result *= 2;
            }
            return result;
        };

        int[] res = processArray(arr, pow2);
        System.out.println(Arrays.toString(res));
    }
}
