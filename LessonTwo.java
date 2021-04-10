package ru.geekbrains.lesson2;

public class LessonTwo {
    public static void main(String[] args) {
        sum(5, 10);
        PosOrNeg(100);
        PosOrNegReturn(100);
        PrintString(10, "Hello");
        LeapYear(2020);

    }
    public static boolean sum(int a, int b) {
        if ((a + b >= 10 && a + b <= 20)) {
 // Написал вывод в консоль чтобы было как-то нагляднее.
            System.out.println("true");
            return true;
        }
        else {
            System.out.println("false");
            return false;
        }
    }

    public static void PosOrNeg(int c) {
        if (c >= 0) {
            System.out.println("Положительное число");}
            else {
                System.out.println("Отрицательное число");
            }
    }
    public static boolean PosOrNegReturn(int c) {
        if (c >= 0) {
// Написал вывод в консоль чтобы было как-то нагляднее.
            System.out.println("false");
            return false;
        }
        else {
            System.out.println("true");
            return true;
        }
    }
    public static void PrintString(int d,String e) {
        for (int i = 1; i <= d; i++) {
            System.out.println(i + " " + e);
        }
    }

    public static boolean LeapYear(int f) {
        if (!(f % 4 == 0) || ((f % 100 == 0) && !(f % 400 == 0))) {
            System.out.println(f + " год не високосный");
            return false;
        }
        else {
            System.out.println(f + " год високосный");
            return true;
        }
        }
}
// Непонял как и зачем в этих заданиях использовать switch хоть и очень хотелось.
