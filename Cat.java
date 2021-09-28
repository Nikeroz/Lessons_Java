package Home_work_6;

public class Cat extends Animal {



    public  Cat(String name, int age){
        this.name = name;
        this.age = age;
    }


    public void run(int i) {
        if (i > 0 && i < 200){
            System.out.println(name + " смог пробежать " + i + "м");
        } else {
            System.out.println(name + " не смог пробежать");
        }
    }

    public void swim(int j){
        if(j < 0){
            System.out.println(name + " смог проплыть");
        } else {
            System.out.println(name + " не смог проплыть");
        }

    }

    @Override
    public void info() {
        super.info();

    }
}
