package java_2_Lesson_1;

public class Man implements Runnable, Jumping {
    private String name;
    private int interval;
    private int jump;

    public Man(String name, int interval, int jump) {
        this.name = name;
        this.interval = interval;
        this.jump = jump;
    }

    @Override
    public void jump() {
        System.out.println("Человек умеет прыгать! ");

    }

    @Override
    public void jump(wall wall) {
        if (wall.getHeight() < jump){
            System.out.println("Человек успешно прыгнул ");
        } else {
            System.out.println("Человек не смог перепрыгнуть ");
        }


    }


    @Override
    public void run() {
        System.out.println("Человек умеет бегать! ");

    }

    @Override
    public void run(treadmill treadmill) {
        if (treadmill.getDistance() < interval){
            System.out.println("Человек успешно пробежал ");
        } else {
            System.out.println("Человек не смог пробежать  ");
        }

    }
}
