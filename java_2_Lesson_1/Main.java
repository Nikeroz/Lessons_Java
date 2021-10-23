package java_2_Lesson_1;

public class Main {

    public static void main(String[] args) {
        Players[] players = new Players[3];
        players[0] = new Cat("Barsik", 30,20);
        players[1] = new Man("Sam", 10, 30);
        players[2] = new Robot("X2r8", 40, 50);
        Barrier[] barriers = new Barrier[1];
        barriers[0] = new Barrier(20, 10);



        for (Players p : players) {
            System.out.println(p.getClass() + " начинает полосу препятствий");
            for (Barrier b : barriers) {
                if (!b.tryToPass(p)) {
                    System.out.println(p.getClass() + " не смог преодолеть " + b.getClass());
                }
                System.out.println(p.getClass() + " преодолел " + b.getClass());
            }
        }







    }

    private static void jump(Players players){
        players.jump();

    }

    private static void run(Players players){
      players.run();
    }



}
