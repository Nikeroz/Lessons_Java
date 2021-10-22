package java_2_Lesson_1;

public class Robot implements Runnable, Jumping {
    private String name;
    private int interval;
    private int jump;

    public Robot(String name, int interval, int jump) {
        this.name = name;
        this.interval = interval;
        this.jump = jump;
    }

    @Override
    public void jump() {
        System.out.println("Робот умеет прыгать! ");
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
        System.out.println("Робот умеет бегать! ");

    }

    @Override
    public void run( treadmill treadmill) {
        if (treadmill.getDistance() < interval){
            System.out.println("Робот успешно пробежал");
        } else {
            System.out.println("Робот не смог пробежать  ");
        }

    }
}


