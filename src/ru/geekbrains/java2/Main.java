package ru.geekbrains.java2;

public class Main {

    public static void main(String[] args) {
        Object[] team = new Object[3];
        team[0] = new Human();
        team[1] = new Cat();
        team[2] = new Robot();

        Object[] obstacles = new Object[2];
        //noinspection InstantiationOfUtilityClass
        obstacles[0] = new Treadmill();
        //noinspection InstantiationOfUtilityClass
        obstacles[1] = new Wall();

        for (Object user : team) {
            for (Object obstacle : obstacles) {
                if (obstacle instanceof Treadmill) {
                    if (user instanceof Human) {
                        ((Human) user).run();
                    }

                    if (user instanceof Cat) {
                        ((Cat) user).run();
                    }

                    if (user instanceof Robot) {
                        ((Robot) user).run();
                    }
                }

                if (obstacle instanceof Wall) {
                    if (user instanceof Human) {
                        ((Human) user).jump();
                    }

                    if (user instanceof Cat) {
                        ((Cat) user).jump();
                    }

                    if (user instanceof Robot) {
                        ((Robot) user).jump();
                    }
                }
            }
            System.out.println();
        }
    }
}
