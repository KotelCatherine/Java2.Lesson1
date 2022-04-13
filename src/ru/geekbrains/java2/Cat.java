package ru.geekbrains.java2;

public class Cat implements Actions{

    @Override
    public void run() {
        int max_distance = 1200; //максимльное расстояение которое может пробежать кот
        if (Treadmill.run(max_distance)) {
            System.out.println("Беговая дорожка успешно пройдена котом");
        } else {
            System.out.println("Беговая дорожка не пройдена котом");
        }
    }

    @Override
    public void jump() {
        int limitHeight = 2; //максимальная высота
        if (Wall.jump(limitHeight)) {
            System.out.println("Стена успешно пройдена котом");
        } else {
            System.out.println("Стена не пройдена котом");
        }
    }
}