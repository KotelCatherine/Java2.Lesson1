package ru.geekbrains.java2;

public class Wall {
    public static int wallHeight = 3;

    public static boolean jump(int obj) {
        return obj >= wallHeight;
    }
}
