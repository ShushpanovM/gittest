package ru.geekbrains.lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = true;
    }

    void info() {
        String isHungry = !satiety ? "сыт" : "голоден";
        System.out.println("Кот " + name + " хотел съесть " + appetite + " и " + isHungry);
    }

    void eat(Plate plate) {
        if (satiety && plate.decreaseFood(appetite))
            satiety = false;
    }
}
