package ru.geekbrains.java2;

public class Robot implements Actions{

    @Override
    public void run() {
        int max_distance = 3000;
        if (Treadmill.run(max_distance)) {
            System.out.println("Беговая дорожка успешно пройдена роботом");
        } else {
            System.out.println("Беговая дорожка не пройдена роботом");
        }
    }

    @Override
    public void jump() {
        int limitHeight = 5;
        if (Wall.jump(limitHeight)) {
            System.out.println("Стена успешно пройдена роботом");
        } else {
            System.out.println("Стена не пройдена роботом");
        }
    }
}
