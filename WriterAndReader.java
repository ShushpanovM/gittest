package ru.geekbrains.javacore;


import java.io.*;

public class WriterAndReader {
    public static void main(String[] args) {
        byte[] byteAppData = null;
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
             ObjectOutputStream ObjectOutputStream = new ObjectOutputStream(
                     new FileOutputStream("src/main/java/ru/geekbrains/javacore/data.csv"))) {
            AppData appData = new AppData(
                    new String[] { "Value 1", "Value 2", "Value 3" },
                    new int[][] {
                            { 100, 200, 123 },
                            { 300, 400, 500 }
                    });
            ObjectOutputStream.writeObject(appData);
            byteAppData = byteArrayOutputStream.toByteArray();
            System.out.println(appData);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (ObjectInputStream inputStream = new ObjectInputStream(
                new FileInputStream("src/main/java/ru/geekbrains/javacore/data.csv"))) {
            AppData appDataFromByte = (AppData) inputStream.readObject();
            System.out.println(appDataFromByte);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

