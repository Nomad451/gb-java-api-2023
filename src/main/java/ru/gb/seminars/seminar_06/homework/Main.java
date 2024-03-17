package ru.gb.seminars.seminar_06.homework;

public class Main {
    public static void main(String[] args) {
        Cat murzik = new Cat("Murzik", 100, 5);
        Plate plate = new Plate(150);

        System.out.println(murzik);
        System.out.println();
        System.out.println("В тарелке " + plate + " корма");
        System.out.println();
        murzik.eat(plate);
        System.out.println(murzik);

        System.out.println("В тарелке " + plate + " корма");
        System.out.println(murzik);
    }
}
