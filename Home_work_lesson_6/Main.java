package Home_work_lesson_6;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 4);
        cat.info();
        cat.run(100);
        cat.swim(5);


        Dog dog = new Dog("Sharik", 2);
        dog.info();
        dog.Run(300);
        dog.swim(5);


    }
}
