package ua.opnu;

import java.util.function.Consumer;

public class Task4 {

    static class Student {
        private String name; // сюди можна писати просто ім'я
        private String lastName;
        private String group;

        public Student(String lastName, String name, String group) {
            this.name = name;
            this.lastName = lastName;
            this.group = group;
        }

        public String getName() {
            return name;
        }

        public String getLastName() {
            return lastName;
        }
    }

    public static void forEach(Student[] students, Consumer<Student> action) {
        for (Student s : students) {
            action.accept(s);
        }
    }

    public static void main(String[] args) {
        Student[] group = {
                new Student("Іванов", "Іван", "AI-242"),
                new Student("Петренко", "Марія", "AI-242"),
                new Student("Сидоренко", "Олег", "AI-242")
        };

        Consumer<Student> printFullName =
                s -> System.out.println(s.getLastName() + " " + s.getName());

        forEach(group, printFullName);
    }
}
