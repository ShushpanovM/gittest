package ru.geekbrains.lesson6;

public class Dog extends Animal{
    static int dogCount;
    static String dogName;
    private final int RUN_LIMIT = 500;
    private final int SWIM_LIMIT = 10;

    public Dog(String dogName) {
        this.dogName = dogName;
        dogCount ++;
    }
    @Override
    void run(int length) {
        if ((length >= 0) && (length <= RUN_LIMIT)) System.out.println("Собака " + dogName + " пробежала " + length + "м");
        else System.out.println("Собака " + dogName + " пробежала только " + RUN_LIMIT + "м, из " + length);
    }

    @Override
    void swim(int length) {
        if ((length >= 0) && (length <= SWIM_LIMIT)) System.out.println("Собака " + dogName + " проплыла " + length + "м");
        else System.out.println("Собака " + dogName + " проплыла только " + SWIM_LIMIT + "м, из " + length);
    }
}
