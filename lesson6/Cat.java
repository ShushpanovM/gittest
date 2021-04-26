package ru.geekbrains.lesson6;


public class Cat extends Animal {
    static int catCount;
    static String catName;
    private final int RUN_LIMIT = 200;

    public Cat(String catName) {
        this.catName = catName;
        catCount ++;
    }
    @Override
    void run(int length) {
        if ((length >= 0) && (length <= RUN_LIMIT)) System.out.println("Кот " + catName + " пробежал " + length);
        else System.out.println("Кот " + catName + "  пробежал только " + RUN_LIMIT + "м, из " + length);
    }

    @Override
    void swim(int length) {
        System.out.println("Кот не умеет плавать");
    }
}
