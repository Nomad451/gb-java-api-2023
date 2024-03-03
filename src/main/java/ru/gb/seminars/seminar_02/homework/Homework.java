package ru.gb.seminars.seminar_02.homework;

public class Homework {
    public static void main(String[] args) {
        System.out.println(isPalindrome("abba"));
        System.out.println(isPalindrome("abbasfda"));
    }

    // Метод, который проверяет является ли строка палиндромом.
    static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        String reverseStr = String.valueOf(sb.reverse());
        if (str.equals(reverseStr)) {
            return true;
        }
        return false;
    }
}
