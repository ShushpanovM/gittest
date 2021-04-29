package ru.geekbrains.lesson7;


public class Plate {
    private int food;

    Plate(int food) {
        this.food = food;
    }

    boolean decreaseFood(int n) {
        int diff = food - n;
        if (diff < 0) return false;

        food -= n;
        return true;
    }

    void addFood(int food) {
        this.food += food;
        System.out.println("В миску добавили: " + food + " еды.");
    }

    void info() {
        System.out.println("В тарлке: " + food + " еды.");
    }
}
