package ru.geekbrains.java2;

public class Human implements Actions{

    @Override
    public void run() {
        int max_distance = 500;
        if (Treadmill.run(max_distance)) {
            System.out.println("Беговая дорожка успешно пройдена человеком");
        } else {
            System.out.println("Беговая дорожка не пройдена человеком");
        }
    }

    @Override
    public void jump() {
        int limitHeight = 2;
        if (Wall.jump(limitHeight)) {
            System.out.println("Стена успешно пройдена человеком");
        } else {
            System.out.println("Стена не пройдена человеком");
        }
    }
}

