package ru.gb.seminars.seminar_04.homework;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        while (true) {
            String word = sc.nextLine();
            list.add(0, word);
            if (word.equals("print")) {
                list.removeFirst();
                System.out.println(list);
            }
            if (word.equals("revert")) {
                list.removeFirst();
                list.removeFirst();
            }
            if (word.equals("exit")) break;
        }

        sc.close();
    }
}
