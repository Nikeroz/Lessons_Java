package Home_work_lesson_7;



public class Cat {
    private String name;
    private int appetite;
    private boolean hangry;
    private boolean satiety;


    public Cat ( String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void setHangry(boolean hangry) {
        this.hangry = hangry;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;

    }



    public int getAppetite() {
        return appetite;
    }
    public void eat(Plate plate){
        if(plate.getFood() < appetite){
            System.out.println("Коту мало еды");
            hangry = false;
            return;
        }


        plate.decreaseFood(appetite);
        satiety = true;
        hangry = false;
        System.out.println("Кот поел из тарелки");

    }


    public void info(){
        System.out.println(name + " " + appetite + " " + hangry + " " + satiety);
    }



}

