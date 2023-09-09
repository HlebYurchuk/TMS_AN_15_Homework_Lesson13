package com.teachmeskills.homework13.part2;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("Vasya");
        arrayList.add("Petya");
        arrayList.add("Denis");
        arrayList.add("Victor");
        arrayList.add("Vasilii");
        arrayList.add("Andrew");
        arrayList.add("Michael");


        System.out.println(arrayList + " - Имена ");

        System.out.println(arrayList.stream().filter(p -> p.toLowerCase().startsWith("a")).toList() + " - Имена начинающиеся с буквы A");

        System.out.println(arrayList.stream().sorted().limit(1).toList() + " - Отсортированное первое имя");

    }
}