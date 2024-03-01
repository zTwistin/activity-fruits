package org.example;

import java.util.*;

public class FruitDriver {

    public static void main(String[] args) {

        Fruit apple = new Fruit("apple", 100);
        Fruit orange = new Fruit("orange", 50);
        Fruit banana = new Fruit("banana", 50);
        Fruit peaches = new Fruit("peaches", 200);
        Fruit apple2 = new Fruit("apple2", 125);
        Fruit tangerine = new Fruit("tangerine", 50);

        List<Fruit> fruits = new ArrayList<>();

        fruits.add(apple);
        fruits.add(orange);
        fruits.add(banana);
        fruits.add(peaches);
        fruits.add(apple2);
        fruits.add(tangerine);

        fruits.forEach(System.out::println);

        Collections.sort(fruits);
        List<Fruit> reversed = fruits.reversed();

        System.out.println();
        fruits.forEach(System.out::println);
        System.out.println();
        reversed.forEach(System.out::println);
    }
}
