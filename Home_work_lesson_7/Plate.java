package Home_work_lesson_7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int amount){
        food -= amount;
    }

    public void addFood(){
        this.food += 30;
        System.out.println("В миску добавили " + 30 +   " грамм корма");
    }


    public int getFood() {
        return food;
    }



    public void info(){
        System.out.printf("Plate  [ Food  %d ]\n  ", food);
    }
}
