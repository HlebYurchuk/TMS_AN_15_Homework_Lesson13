package com.teachmeskills.homework13.part1;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i=0 ; i< 8; i++ ){
            arrayList.add((int) (Math.random() * 10));
        }
        System.out.println(arrayList + " - Рандомные элементы коллекции");

        System.out.println(arrayList.stream().distinct().toList() + " - Уникальные элементы коллекции");

        System.out.println(arrayList.stream().distinct().filter(n -> 7 < n && n < 17 )
                .filter(n -> n % 2==0).toList()+
                " - Четные числа от 7 до 17");

        System.out.println(arrayList.stream().map(n -> n*2 ).toList()+" - Каждый элемент умноженный на 2");

        System.out.println(arrayList.stream().sorted().limit(4).toList()+ " - Отсортированные, первые четрые элемента");

        System.out.println(arrayList.stream().count() + " - Количетсво элементов в коллекции");

        System.out.println(arrayList.stream().mapToInt(n -> n).average());

    }
}
