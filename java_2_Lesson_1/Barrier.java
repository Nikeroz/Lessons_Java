package java_2_Lesson_1;

public  class Barrier  {
   private int distance;
   private int height;


     public Barrier(int distance, int height) {
          this.distance = distance;
          this.height = height;
     }



    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public boolean tryToPass(Players p) {
         try {
         p.run();
         p.jump();
         }catch (Exception b){
             System.out.println(p.getClass() + " не смог преодолеть " + b.getClass());

         }

        return false;
    }
}
