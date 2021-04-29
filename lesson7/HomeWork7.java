package ru.geekbrains.lesson7;

public class HomeWork7 {
    public static void main(String[] args) {

        Cat[] cats = {
                new Cat("Barsik", 10),
                new Cat("Murka", 15),
                new Cat("Belok", 25),
                new Cat("Liza", 5),
        };

        Plate plate = new Plate(30);

        plate.info();

        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
        }

        plate.addFood(50);
        plate.info();
    }
}
