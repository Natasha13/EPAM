package com.minarchenko.taskSevenPartSix;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner {
    public void run() {
        //1
        List<Integer> integerList = Stream.iterate(10, n -> n + 10)
                .limit(10)
                .map(n -> n / 2)
                .collect(Collectors.toList());
        System.out.println("List: " + integerList);

        //2
        List<Person> people = createList();
        System.out.println("Before: ");
        people.stream().forEach(System.out::println);
        System.out.println("After: ");
        people.stream()
                .filter(obj -> obj.getSex() == Person.Sex.MALE)
                .filter(obj -> obj.getAge() >= 18)
                .filter(obj -> obj.getAge() <= 55)
                .forEach(System.out::println);

        double averageAge = people.stream()
                .filter(obj -> obj.getSex() == Person.Sex.FEMALE)
                .mapToInt(Person::getAge)
                .average()
                .orElse(0);
      //          .getAsDouble();
        System.out.println("Average age: " + averageAge);
    }

    private List<Person> createList() {
        return Arrays.asList(
                new Person("Oleg", 34, Person.Sex.MALE),
                new Person("Olya", 24, Person.Sex.FEMALE),
                new Person("Oksana", 18, Person.Sex.FEMALE),
                new Person("Dima", 64, Person.Sex.MALE),
                new Person("Igor", 18, Person.Sex.MALE),
                new Person("Sasha", 54, Person.Sex.MALE),
                new Person("Vasya", 44, Person.Sex.MALE),
                new Person("Petro", 19, Person.Sex.MALE)
        );
    }
}
