package java_2_Lesson_1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
   Players[] players = new Players[3];
   players[0] = new Players("Alex", 20, 18);
   players[1] = new Players("Barsik", 13, 45);
   players[2] = new Players("X3zt4", 50, 40);

   Barrier[] barrier = new Barrier[3];
   barrier[0] = new Barrier(10, 5);
   barrier[1] = new Barrier(20,15);
   barrier[2] = new Barrier(30,30);

        if (Arrays.deepEquals(new Players[]{players[1]} > new Barrier[]{barrier[0]})) {
            System.out.println(" Успешно прошел испытания ");
        } else {
            System.out.println("Не прошел испытания");
        }


    }

    private static void jump(Jumping jumping){
        jumping.jump();

    }

    private static void run(Runnable runnable){
      runnable.run();
    }


    private static class Players {
        private String name;
        private int interval;
        private int jump;

        private Players(String name, int interval, int jump) {
            this.name = name;
            this.interval = interval;
            this.jump = jump;
        }
    }

    private static class Barrier {
        private int height;
        private int distance;

        private Barrier(int height, int distance) {
            this.height = height;

            this.distance = distance;
        }
    }
}
