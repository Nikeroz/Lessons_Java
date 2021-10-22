package java_2_Lesson_1;

public class Cat implements Runnable, Jumping {
    private String name;
    private int interval;
    private int jump;

    public Cat(String name, int interval, int jump) {
        this.name = name;
        this.interval = interval;
        this.jump = jump;
    }


    @Override
    public void jump() {
        System.out.println("Кот умеет прыгать!");
    }

    @Override
    public void jump(wall wall) {
        if (wall.getHeight() < jump){
            System.out.println("Кот успешно прыгнул ");
        } else {
            System.out.println("Кот не смог перепрыгнуть ");
        }
    }



    @Override
    public void run() {
        System.out.println("Кот умеет бегать! ");

    }

    @Override
    public void run( treadmill treadmill) {
        if (treadmill.getDistance() < interval){
            System.out.println(" Кот успешно пробежал");
        } else {
            System.out.println("Кот не смог пробежать  ");
        }

    }
}
