package ru.gb.seminars.seminar_05.homework;

import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        HashMap<String, Integer> phoneBook = new HashMap<>();

        System.out.println("================ТЕЛЕФОННЫЙ СПРАВОЧНИК===============");
        System.out.println("Выберите одну из пяти команд:" +
                "\n\t\"ADD\" - добавить новый контакт." +
                "\n\t\"GET\" - получить список всех номеров по фамилии." +
                "\n\t\"REMOVE\" - удалить все номера по фамилии." + "" +
                "\n\t\"LIST\" - посмотреть все записи." +
                "\n\t\"EXIT\" - выйти из программы.");
        System.out.println("====================================================");

        while (true) {
            System.out.print("Введите команду: ");
            String input = sc.nextLine();

            if (input.equals("ADD")) {
                System.out.println("Введите фамилию и номер: ");
                phoneBook.put(sc.nextLine(), sc.nextInt());
            } else if (input.equals("GET")) {
                System.out.print("Введите фамилию: ");
                try {
                    int phone = phoneBook.get(sc.nextLine());
                    System.out.println(phone);
                } catch (NullPointerException e) {
                    System.out.println("Не найдена запись с фамилией");
                }
            } else if (input.equals("REMOVE")) {
                System.out.print("Введите фамилию: ");
                phoneBook.remove(sc.nextLine());
            } else if (input.equals("LIST")) {
                System.out.println(phoneBook);
            } else if (input.equals("EXIT")) {
                System.out.println("Завершение программы...");
                break;
            } else {
                System.out.println("Не корректный ввод");
            }
        }
    }
}
