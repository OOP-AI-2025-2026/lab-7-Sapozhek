package ua.opnu;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Task5 {

    public static void process(int[] input,
                               Predicate<Integer> condition,
                               Consumer<Integer> action) {
        for (int value : input) {
            if (condition.test(value)) {
                action.accept(value);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // 1-й варіант: вивести лише парні числа
        Predicate<Integer> isEven = n -> n % 2 == 0;
        Consumer<Integer> printNumber = n -> System.out.print(n + " ");

        process(arr, isEven, printNumber);
        System.out.println();

        // 2-й варіант: вивести квадрати чисел, які > 5
        Predicate<Integer> greaterThan5 = n -> n > 5;
        Consumer<Integer> printSquare = n -> System.out.print((n * n) + " ");

        process(arr, greaterThan5, printSquare);
    }
}
