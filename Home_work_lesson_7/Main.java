package Home_work_lesson_7;

public class Main {



    public static void main(String[] args) {
        Cat[] cat = new Cat[3];
        cat[0] = new Cat("Barsik", 40);
        cat[1] = new Cat("Murzik", 70);
        cat[2] = new Cat("Tortik",60);
        Plate plate = new Plate(50);





        for(Cat i:cat){
            i.info();
            plate.info();

        i.eat(plate);
            if (plate.getFood() > i.getAppetite() ){
                System.out.println("Коту хватает еды");
              }
            else {
                plate.addFood();
            }

            }




        }




    }


