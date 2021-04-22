package ru.geekbrains.lesson5;


public class User {
    private String fullName;
    private String post;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public User(String fullName, String post, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    void info() {
        System.out.println("ФИО: " + this.fullName + ";" + " Должность: " + this.post + ";" + " Email: " + this.email + ";"
                + " Телефон: " + this.phone + ";" + " Зарплата: " + this.salary + ";" + " Возраст: " + this.age + ";");
    }

    int getAge() {
        return age;
    }
}
