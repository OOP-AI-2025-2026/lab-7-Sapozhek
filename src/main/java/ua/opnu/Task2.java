package ua.opnu;

import java.util.Arrays;
import java.util.function.Predicate;

public class Task2 {

    static class Student {
        private String name;   // можеш сюди записувати "Прізвище Ім'я"
        private String group;
        private int[] marks;

        public Student(String name, String group, int[] marks) {
            this.name = name;
            this.group = group;
            this.marks = marks;
        }

        public String getName() {
            return name;
        }

        public String getGroup() {
            return group;
        }

        public int[] getMarks() {
            return marks;
        }

        // є хоча б одна заборгованість (оцінка < 60)
        public boolean hasDebts() {
            for (int m : marks) {
                if (m < 60) return true;
            }
            return false;
        }

        @Override
        public String toString() {
            return name + " (" + group + "), marks=" + Arrays.toString(marks);
        }
    }

    // універсальна фільтрація студентів
    public static Student[] filter(Student[] input, Predicate<Student> p) {
        Student[] tmp = new Student[input.length];
        int k = 0;
        for (Student s : input) {
            if (p.test(s)) {
                tmp[k++] = s;
            }
        }
        return Arrays.copyOf(tmp, k);
    }

    public static void main(String[] args) {
        Student[] group = {
                new Student("Іванов Іван", "AI-242", new int[]{90, 75, 80}),
                new Student("Петров Петро", "AI-242", new int[]{59, 70, 65}),
                new Student("Сидоренко Оля", "AI-242", new int[]{100, 95, 88})
        };

        // предикат: студент БЕЗ заборгованостей (усі оцінки >= 60)
        Predicate<Student> noDebts = s -> !s.hasDebts();

        Student[] passed = filter(group, noDebts);
        System.out.println("Без заборгованостей: " + Arrays.toString(passed));
    }
}

