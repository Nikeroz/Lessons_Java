package Home_work_6;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat("Barsik", 4);
        cat.run(100);
        cat.swim(5);
        cat.info();


        Dog dog = new Dog("Sharik", 5);
        dog.run(300);
        dog.swim(6);
        dog.info();
    }
}
