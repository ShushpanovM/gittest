package ru.geekbrains.lesson3;

import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrReplace()));
        System.out.println(Arrays.toString(arrCompletion()));
        System.out.println(Arrays.toString(arrChange()));
        arrReplaceDiagonal();
        System.out.println(Arrays.toString(initialValue(6,9)));
        maxMin();
        System.out.println(checkBalance(new int[] {2, 2, 2, 1, 2, 2, 10, 1}));
    }

    public static int[] arrReplace() {
        int[] arr = {0, 1, 1, 0, 0, 1, 0, 1, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            }
            else {
                arr[i] = 0;
            }

        }
        return arr;
    }
    public static int[] arrCompletion() {
        int[] arr2 = new int[100];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;
        }
        return arr2;
    }
    public static int[] arrChange() {
        int[] arr3 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] = arr3[i] * 2;
            }
        }
        return arr3;
    }

    public static void arrReplaceDiagonal() {
        int[][] arr4 = new int[5][5];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0, x = arr4[i].length - 1; j < arr4[i].length; j++, x--) {
                if (i == j || i == x) arr4[i][j] = 1;
                else arr4[i][j] = 0;
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] initialValue(int len, int initialValue) {
        int[] arr5 = new int[len];
        for (int i = 0; i < arr5.length; i++) {
            arr5[i] = initialValue ;
        }

        return arr5;
    }
    public static void maxMin() {
        int[] arr6 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr6.length; i++) {
            if (arr6[i] < min) {
                min = arr6[i];
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i=0; i < arr6.length; i++){
            if(arr6[i] > max){
                max = arr6[i];
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
    static boolean checkBalance(int[] arr7) {
        int length = arr7.length;
        int leftSum;
        int rightSum;

        for (int i = 0; i < length - 1; i++) {
            leftSum = 0;
            rightSum = 0;

            for (int j = 0; j <= i; j++) {
                leftSum += arr7[j];
            }

            for (int k = i + 1; k < length; k++) {
                rightSum += arr7[k];
            }

            if (leftSum == rightSum) return true;
        }
        return false;
    }
}
// Попытался вникнуть в 8е задание, даже загуглил решение, но всё равно, это, пока что, не понятно, слишком объемно.
// для 6-го и 7-го задания искал инфу в Гугле. Незнаю моя ли теперь заслуга в их решении(Это не копипаст с сайта. Писал всё сам). Но было интересно разобраться.
