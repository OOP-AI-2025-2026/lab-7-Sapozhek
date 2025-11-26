package ua.opnu;

import java.util.function.Predicate;

public class Task1 {

    // Предикат: повертає true, якщо n – просте
    public static final Predicate<Integer> IS_PRIME = n -> {
        if (n == null || n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    };

    public static void main(String[] args) {
        System.out.println(IS_PRIME.test(1));  // false
        System.out.println(IS_PRIME.test(2));  // true
        System.out.println(IS_PRIME.test(17)); // true
        System.out.println(IS_PRIME.test(21)); // false
    }
}
