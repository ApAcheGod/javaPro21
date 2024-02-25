package ru.project;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println(
            Lists.reverse(
                    IntStream
                            .range(1, 1_000_000)
                            .collect(ArrayList::new, ArrayList::add, ArrayList::add)
            )
        );
        System.out.println(System.nanoTime() - start);
    }
}