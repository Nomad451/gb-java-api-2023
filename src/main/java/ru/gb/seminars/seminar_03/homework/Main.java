package ru.gb.seminars.seminar_03.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        removeEven(arrayList);
        System.out.println(minValue(arrayList));
        System.out.println(maxValue(arrayList));
        System.out.println(averageValue(arrayList));
    }

    static void removeEven(ArrayList<Integer> list) {
        ArrayList<Integer> notEven = new ArrayList<>();
        for (Integer i : list) {
            if (i % 2 != 0) {
                notEven.add(i);
            }
        }
        System.out.println(notEven);
    }

    static int minValue(ArrayList<Integer> list) {
        int min = 1;
        for (Integer i : list) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    static int maxValue(ArrayList<Integer> list) {
        int max = 0;
        for (Integer i : list) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    static int averageValue(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer i : list) {
            sum += i;
        }
        int aver = sum / list.size();
        return aver;
    }
}
