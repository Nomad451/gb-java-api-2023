package ru.gb.seminars.seminar_06.homework;

import java.util.Objects;

public class Cat {
    private String name;
    private int appetite; // аппетит
    private int satiety;  // голод

    public Cat(String name, int appetite, int satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public String getName() {
        return name;
    }

    public void eat(Plate plate) {
        //реализация шкалы голода
        if (satiety > 0 && satiety <= 2) {
            appetite += plate.decreaseFood(25);
            satiety -= 2;
        } else if (satiety > 2 && satiety <= 5) {
            appetite += plate.decreaseFood(50);
            satiety -= 5;
        } else if (satiety > 5 && satiety <= 7) {
            appetite += plate.decreaseFood(75);
            satiety -= 7;
        } else if (satiety > 7 && satiety <= 10) {
            appetite += plate.decreaseFood(100);
            satiety -= 10;
        }


    }

    @Override
    public String toString() {
        return name
                + "\nАппетит: " + appetite
                + "\nГолод: " + satiety;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (obj instanceof Cat anotherCat) {
            return name.equals(anotherCat.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
