package ru.geekbrains.lesson6;

public class HomeWork6 {
    public static void main(String[] args) {
        Animal cat = new Cat("Barsik");
        cat.run(200);
        cat.swim(1);

        Animal cat2 = new Cat("Murzik");
        cat.run(210);
        cat.swim(10);

        Animal dog = new Dog("Bobik");
        dog.run(501);
        dog.swim(10);

        Animal dog2 = new Dog("Sharik");
        dog.run(400);
        dog.swim(15);
        System.out.println("Создано Котов: " + Cat.catCount);
        System.out.println("Создано Собак: " + Dog.dogCount);
        System.out.println("Всего животных: " + (Cat.catCount + Dog.dogCount));
    }
}
