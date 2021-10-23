package java_2_Lesson_1;

 public class Treadmill extends Barrier {
     private int height;
     private int distance;



     public Treadmill(int height, int distance) {
        super(distance, height);
         this.height = height;
         this.distance = distance;

    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }


 }
