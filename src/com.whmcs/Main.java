package com.whmcs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static com.whmcs.Main.Gender.FEMALE;
import static com.whmcs.Main.Gender.MALE;

public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>(Arrays.asList(
                new Person("John", MALE),
                new Person("Tom", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE)
        ));

        System.out.println("// Imperative approach");
        List<Person> females = new ArrayList<>();
        for (Person person : people) {
            if (FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }
        for (Person female : females) {
            System.out.println(female);
        }

        System.out.println("// Declarative approach");
        people.stream().filter(person ->
                FEMALE.equals(person.gender))
                .collect(Collectors.toList())
                .forEach(System.out::println);


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
