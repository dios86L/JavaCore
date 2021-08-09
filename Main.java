package Lesson1;

public class Main {
    public static void main(String[] args) {

        Obstracle[] obstracle = {
            new Road(3),
            new Wall(5),
            new Road(6),
            new Wall(8),
            new Road(2),
            new Wall(4),
        };

        Participants[] participants = {
            new Robot("T100", 3,4),
            new Robot("T1000", 5, 89),
            new Man( "Вася", 4,7),
            new Man("Петя", 3, 9),
            new Cat("Рыжик", 7, 4),
            new Cat("Барсик",6,8),
        };
        for (Participants participants1 : participants) {
            for (Obstracle obstracle1 : obstracle) {
                if (!participants1.getStatus()){
                    participants1.thrueObstracle (obstracle1);
                }
            }
            System.out.println("\n");
        }
    }
}
