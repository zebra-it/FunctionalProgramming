package com.whmcs.stream;

import com.whmcs.Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

import static com.whmcs.stream._Stream.Gender.FEMALE;
import static com.whmcs.stream._Stream.Gender.MALE;

public class _Stream {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>(Arrays.asList(
                new Person("John", MALE),
                new Person("Tom", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE)
        ));

        // crl alt n - вернет переменные на место в функцию
        Function<Person, String> personStringFunction = person -> person.name;
        ToIntFunction<String> length = String::length;
        IntConsumer println = System.out::println;
/*
        people.stream()
                .map(personStringFunction)
                .mapToInt(length)
                .forEach(println);
        */

        Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);
        boolean b = people.stream()
                .allMatch(personPredicate); // return false
        // нужно делать по другому те он проверит на схожесть всю коллекцию а не отдельные элементы
        boolean b1 = people.stream()
                .anyMatch(personPredicate); // true
        boolean b2 = people.stream()
                .noneMatch(personPredicate); // false


    }


    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }


        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }


}
