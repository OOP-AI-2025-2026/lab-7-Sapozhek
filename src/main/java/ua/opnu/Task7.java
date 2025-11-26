package ua.opnu;

import java.util.Arrays;
import java.util.function.Function;

public class Task7 {

    public static String[] stringify(int[] input,
                                     Function<Integer, String> f) {
        String[] res = new String[input.length];
        for (int i = 0; i < input.length; i++) {
            res[i] = f.apply(input[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        Function<Integer, String> numberToWord = n -> {
            switch (n) {
                case 0: return "нуль";
                case 1: return "один";
                case 2: return "два";
                case 3: return "три";
                case 4: return "чотири";
                case 5: return "п'ять";
                case 6: return "шість";
                case 7: return "сім";
                case 8: return "вісім";
                case 9: return "дев'ять";
                default: return "???";
            }
        };

        String[] res = stringify(arr, numberToWord);
        System.out.println(Arrays.toString(res));
    }
}
