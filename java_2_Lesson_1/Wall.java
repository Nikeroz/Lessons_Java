package java_2_Lesson_1;

public class Wall extends Barrier {
    private int height;
    private int distance;


    public Wall(int height, int distance) {
        super(distance, height);
        this.height = height;
        this.distance = distance;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }




}
