package ru.geekbrains.lesson5;

public class HomeWork5 {
    public static void main(String[] args) {
        System.out.println("Работники: ");
//        Первые задания:
//        User user = new User("ivanov ivan","QA","ivivan@mail.ru","892123123",30000,30);
//        user.Info();
//        4 и 5 задания:
        User[] user = new User[5];
        user[0] = new User("ivanov ivan","QA","ivivan@mail.ru","892123123",30000,30);
        user[1] = new User("ivanov ivan","QA","ivivan@mail.ru","892123123",30000,39);
        user[2] = new User("ivanov ivan","QA","ivivan@mail.ru","892123123",30000,41);
        user[3] = new User("ivanov ivan","QA","ivivan@mail.ru","892123123",30000,52);
        user[4] = new User("ivanov ivan","QA","ivivan@mail.ru","892123123",30000,26);

        for (User e : user) {
            if (e.getAge() > 40) e.info();
        }
    }

}
