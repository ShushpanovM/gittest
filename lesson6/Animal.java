package ru.geekbrains.lesson6;

public abstract class Animal {
    public String catName;
    public String dogName;
    private final int MAX_RUN_LENGTH = 0;
    private final int MAX_SWIM_LENGTH = 0;

    abstract void run(int length);

    abstract void swim(int length);

}
